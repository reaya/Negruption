
package com.codeogic.negruption;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener,CompoundButton.OnCheckedChangeListener{

    EditText name,phone,email,username,password,password1;
    Button register;
    RadioButton male,female;



    ConnectivityManager connectivityManager;
    NetworkInfo networkInfo;

    User user;
     RequestQueue requestQueue;

    RadioGroup radioGroupGender;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    public void init(){

        name=(EditText)findViewById(R.id.registerName);
        phone=(EditText)findViewById(R.id.registerPhone);
        email=(EditText)findViewById(R.id.registerEmail);
        username=(EditText)findViewById(R.id.registerUsername);
        password=(EditText)findViewById(R.id.registerPassword);
       password1=(EditText)findViewById(R.id.registerPassword1);
        male=(RadioButton)findViewById(R.id.rbMale);
        female=(RadioButton)findViewById(R.id.rbFemale);
        register=(Button)findViewById(R.id.btnRegister1);
        radioGroupGender=(RadioGroup)findViewById(R.id.radioGroup) ;


        requestQueue= Volley.newRequestQueue(this);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
        male.setOnCheckedChangeListener(this);
        female.setOnCheckedChangeListener(this);
        register.setOnClickListener(this);

        user=new User();
        sharedPreferences=getSharedPreferences(Util.PREFS_NAME,MODE_PRIVATE);
        editor=sharedPreferences.edit();

    }

    public boolean isNetworkConnected(){

        connectivityManager=(ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        networkInfo=connectivityManager.getActiveNetworkInfo();

        return (networkInfo != null && networkInfo.isConnected());
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if (id==R.id.btnRegister1){

            user.setName(name.getText().toString().trim());
            user.setPhone(phone.getText().toString().trim());
            user.setEmail(email.getText().toString().trim());
            user.setUsername(username.getText().toString().trim());
            user.setPassword(password.getText().toString().trim());

            validateFields();

           insertIntoCloud();


        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int id=buttonView.getId();
        if (isChecked){
            if (id==R.id.rbMale){
                 user.setGender("male");

            }
            else
            {
          user.setGender("female");

            }
        }
    }


    public void insertIntoCloud() {
        final StringRequest stringRequest=new StringRequest(Request.Method.POST, Util.INSERT_USER, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                   JSONObject jsonObject = new JSONObject(response);
                    int success=jsonObject.getInt("success");
                    String message=jsonObject.getString("message");

                    if (success==1){
                        Toast.makeText(RegisterActivity.this,message,Toast.LENGTH_LONG).show();

                        editor.putString(Util.PREFS_KEYUSERNAME,user.getUsername());
                        editor.putString(Util.PREFS_KEYPASSWORD,user.getPassword());

                        editor.commit();

                        Intent intent=new Intent(RegisterActivity.this,HomeActivity.class);
                        startActivity(intent);
                        finish();

                    }
                    else {
                        Toast.makeText(RegisterActivity.this,message,Toast.LENGTH_LONG).show();

                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(RegisterActivity.this,"Oops! Exception happened : "+e,Toast.LENGTH_LONG).show();
                }


                Toast.makeText(RegisterActivity.this,"Response :"+response,Toast.LENGTH_LONG).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(RegisterActivity.this,"Some Error "+error.getMessage(),Toast.LENGTH_LONG).show();

            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<>();
                map.put("name1",user.getName());
                map.put("phone1",user.getPhone());
                map.put("email1",user.getEmail());
                map.put("gender1",user.getGender());
                map.put("username1",user.getUsername());
                map.put("password1",user.getPassword());


                return map;

            }

        };

        requestQueue.add(stringRequest);
         clear();

    }
    public void clear(){

        name.setText("");
        phone.setText("");
        email.setText("");
        male.setChecked(false);
        female.setChecked(false);
        username.setText("");
        password.setText("");
        password1.setText("");



    }

    public boolean validateFields(){

        boolean flag=true;


        if (user.getName().isEmpty()){
            flag=false;
            name.setError(" Name Cannot Be Empty ");
            name.requestFocus();

        }

        if (user.getPhone().isEmpty()){

            flag=false;
            phone.setError(" Phone Number Cannot Be Empty ");
            phone.requestFocus();
        }else if (user.getPhone().length()<10){

            flag=false;
            phone.setError(" Please Enter 10 digits Phone Number ");
            phone.requestFocus();
        }

        if (user.getUsername().isEmpty()){

            flag=false;
            username.setError(" Username Cannot Be Empty ");
            username.requestFocus();
        }else if (user.getUsername().length()<5){

            flag=false;
            username.setError(" Username Should Be Minimum 5 characters long");
            username.requestFocus();
        }

        if(user.getPassword().isEmpty()){
            flag=false;
            password.setError("Password Cannot Be Empty");
            password.requestFocus();

        }else if (user.password.length()<8){
            flag=false;
            password.setError("Choose A Strong Password Of Minimum Length 8");
            password.requestFocus();

        }
        else if(user.getPassword() != password1.getText().toString().trim()){

            flag=false;
            password1.setError("The Password Does not Match , Please Re-Enter");
            password1.requestFocus();
        }



        return flag;
    }

    }
