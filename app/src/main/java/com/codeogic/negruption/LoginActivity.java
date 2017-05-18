package com.codeogic.negruption;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int REQUEST_CODE= 101;


    EditText uname,password;
    Button login,register;
    RequestQueue requestQueue;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    User user;
    ConnectivityManager connectivityManager;
    NetworkInfo networkInfo;

    public boolean isNetworkConnected(){

        connectivityManager=(ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        networkInfo=connectivityManager.getActiveNetworkInfo();

        return (networkInfo != null && networkInfo.isConnected());
    }


    public void init(){

        uname=(EditText)findViewById(R.id.loginUsername);
        password=(EditText)findViewById(R.id.loginPassword);
        login=(Button)findViewById(R.id.btnLogin);
        register=(Button)findViewById(R.id.btnRegister);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

        int permission= ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO);

        if (permission != PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this,"Permissions denied",Toast.LENGTH_LONG).show();

            //makeRequest();
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.RECORD_AUDIO)){

                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Permission Required");
                builder.setMessage("Permission to access microphone is required for this app to record audio");

                builder.setPositiveButton("O K A Y", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(LoginActivity.this,"Clicked Okay",Toast.LENGTH_LONG).show();
                        makeRequest();
                    }
                });
                builder.create().show();
            }
            else
                makeRequest();
        }


        login.setOnClickListener(this);
        register.setOnClickListener(this);
        user=new User();


        requestQueue= Volley.newRequestQueue(this);

        sharedPreferences=getSharedPreferences(Util.PREFS_NAME,MODE_PRIVATE);
        editor=sharedPreferences.edit();



    }
    protected void makeRequest(){

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.RECORD_AUDIO},REQUEST_CODE);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch (requestCode){

            case REQUEST_CODE :

                if (grantResults.length==0 || grantResults[0] != PackageManager.PERMISSION_GRANTED){

                    Toast.makeText(this,"User Has Denied The Permissions",Toast.LENGTH_LONG).show();

                    AlertDialog.Builder builder=new AlertDialog.Builder(this);
                    builder.setTitle("Permission Required");
                    builder.setMessage("Permission to access microphone is required for this app to record audio");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            Toast.makeText(LoginActivity.this,"Clicked Okay",Toast.LENGTH_LONG).show();
                            makeRequest();
                        }
                    });
                    builder.create().show();
                }
                else {

                    Toast.makeText(this,"User granted the permissions",Toast.LENGTH_LONG).show();
                }
                return;
                }

        }





    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btnLogin){

           user.setUsername(uname.getText().toString().trim());
           user.setPassword(password.getText().toString().trim());

            if (validateLogin()){
            if (isNetworkConnected()){
            loginIntoCloud();
        }else
            {
                Toast.makeText(LoginActivity.this,"Please Connect To Internet",Toast.LENGTH_LONG).show();
            }

        }
        else{

                Toast.makeText(LoginActivity.this,"Please Correct Your Input",Toast.LENGTH_LONG).show();
            }
        }


           else if (id==R.id.btnRegister){

            Intent i =new Intent(LoginActivity.this,RegisterActivity.class);
            startActivity(i);
            finish();
        }
    }


    public void loginIntoCloud(){

        StringRequest stringRequest = new StringRequest(Request.Method.POST, Util.LOGIN_USER, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String message = jsonObject.getString("message");
                    int success = jsonObject.getInt("success");
                    if(success==1){
                        editor.putString(Util.PREFS_KEYUSERNAME,user.getUsername());
                        editor.putString(Util.PREFS_KEYPASSWORD,user.getPassword());
                        editor.commit();
                        Toast.makeText(LoginActivity.this,message,Toast.LENGTH_LONG).show();
                        Intent i = new Intent(LoginActivity.this,HomeActivity.class);
                        startActivity(i);
                        finish();
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }

                Toast.makeText(LoginActivity.this,"Response: "+response,Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(LoginActivity.this,"Some Error"+error,Toast.LENGTH_LONG).show();
            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map = new HashMap<>();
                map.put("username",user.getUsername());
                map.put("password",user.getPassword());
             //   Log.i("userName",user.getUsername() + user.getPassword());
                return map;
            }
        };
        requestQueue.add(stringRequest);


    }
    public boolean validateLogin(){

        boolean flag =true;

     if (user.getUsername().isEmpty()){

        flag=false;
        uname.setError(" Username Cannot Be Empty ");
        uname.requestFocus();
    }
        else if (user.getUsername().contains(" ")){
        flag=false;
        uname.setError("No Spaces Allowed");
        uname.requestFocus();
    }

        if(user.getPassword().isEmpty()){
        flag=false;
        password.setError("Password Cannot Be Empty");
        password.requestFocus();

    }
        else if (user.getPassword().contains(" ")){

        flag=false;
        password.setError("No Spaces Allowed");
        password.requestFocus();
    }

    return flag;

    }
}

