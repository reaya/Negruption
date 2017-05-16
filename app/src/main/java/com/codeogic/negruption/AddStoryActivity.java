package com.codeogic.negruption;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class AddStoryActivity extends AppCompatActivity implements View.OnClickListener {

    @InjectView(R.id.spinnerCities)
    Spinner spinnerMainCities;

    @InjectView(R.id.spinnerDepartment)
    Spinner spinnerDepartment;

    @InjectView(R.id.editTextStoryTitle)
    EditText editTextStoryTitle;

    @InjectView(R.id.editTextStory)
    EditText editTextAddStory;

    @InjectView(R.id.imageButtonPhoto)
    ImageButton imageButtonPhoto;

    @InjectView(R.id.imageButtonAudio)
    ImageButton imageButtonAudio;

    @InjectView(R.id.imageButtonVideo)
    ImageButton imageButtonVideo;

    @InjectView(R.id.textViewHonestOfficer)
    TextView textViewHonestOfficer;

    @InjectView(R.id.buttonShare)
    Button btnShare;

    String stateName;
    ArrayAdapter<String>arrayAdapterCities,arrayAdapterDepartment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_story);



        ButterKnife.inject(this);
         setDepartment();
        setCities();
        textViewHonestOfficer.setOnClickListener(this);

    }
    public void setDepartment() {

        arrayAdapterDepartment = new ArrayAdapter<String>(AddStoryActivity.this, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterDepartment.add("--  Which Department ? --");
        arrayAdapterDepartment.add("Airports");
        arrayAdapterDepartment.add("Banking");
        arrayAdapterDepartment.add("Bureau Of Immigration");
        arrayAdapterDepartment.add("Commercial Tax , Sales Tax , VAT");
        arrayAdapterDepartment.add("Customs,Excise And Service Tax");
        arrayAdapterDepartment.add("Education");
        arrayAdapterDepartment.add("Electricity And Power Supply");
        arrayAdapterDepartment.add("Food And Drug Administration");
        arrayAdapterDepartment.add("Food,Civil Supplies And Consumer Rights");
        arrayAdapterDepartment.add("Foreign Trade");
        arrayAdapterDepartment.add("Forest");
        arrayAdapterDepartment.add("Health And Family Welfare");
        arrayAdapterDepartment.add("Income Tax");
        arrayAdapterDepartment.add("Insurance");
        arrayAdapterDepartment.add("Judiciary");
        arrayAdapterDepartment.add("Labour");
        arrayAdapterDepartment.add("Municipal Services");
        arrayAdapterDepartment.add("Passport");
        arrayAdapterDepartment.add("Pension");
        arrayAdapterDepartment.add("Police");
        arrayAdapterDepartment.add("Post Office");
        arrayAdapterDepartment.add("Public Undertakings");
        arrayAdapterDepartment.add("Public Services");
        arrayAdapterDepartment.add("Public Works Department");
        arrayAdapterDepartment.add("Railways");
        arrayAdapterDepartment.add("Religious Trusts");
        arrayAdapterDepartment.add("Revenue");
        arrayAdapterDepartment.add("Slum Development");
        arrayAdapterDepartment.add("Social Welfare");
        arrayAdapterDepartment.add("Stamps And Registration");
        arrayAdapterDepartment.add("Telecom Services");
        arrayAdapterDepartment.add("Transport");
        arrayAdapterDepartment.add("Urban Development Authorities");
        arrayAdapterDepartment.add("Water Sewage");
        arrayAdapterDepartment.add("Others");

        spinnerDepartment.setAdapter(arrayAdapterDepartment);
        spinnerDepartment.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0)
                    arrayAdapterDepartment.getItem(position);
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    public void setCities(){
        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Select City --");

        arrayAdapterCities.add("Agra");
        arrayAdapterCities.add("Ahmedabad");
        arrayAdapterCities.add("Ambala");
        arrayAdapterCities.add("Amritsar");
        arrayAdapterCities.add("Bangalore");
        arrayAdapterCities.add("Bhopal");
        arrayAdapterCities.add("Chandigarh");
        arrayAdapterCities.add("Delhi");
        arrayAdapterCities.add("Gandhinagar");
        arrayAdapterCities.add("Gurgaon");
        arrayAdapterCities.add("Gurdaspur");
        arrayAdapterCities.add("Guwahati");
        arrayAdapterCities.add("Jalandhar");
        arrayAdapterCities.add("Jaipur");
        arrayAdapterCities.add("Jodhpur");
        arrayAdapterCities.add("Kanniyakumari");
        arrayAdapterCities.add("Kapurthala");
        arrayAdapterCities.add("Karnal");
        arrayAdapterCities.add("Ludhiana");
        arrayAdapterCities.add("Noida");
        arrayAdapterCities.add("Kolkata");
        arrayAdapterCities.add("Mumbai");
        arrayAdapterCities.add("Panipat");
        arrayAdapterCities.add("Panchkula");
        arrayAdapterCities.add("Patiala");
        arrayAdapterCities.add("Patna");
        arrayAdapterCities.add("Pune");
        arrayAdapterCities.add("Mysore");
        arrayAdapterCities.add("Panaji");
        arrayAdapterCities.add("Shimla");
        arrayAdapterCities.add("Surat");
        arrayAdapterCities.add("Ranchi");
        arrayAdapterCities.add("Trivandrum");
        arrayAdapterCities.add("Visakhapatnam");


        spinnerMainCities.setAdapter(arrayAdapterCities);
        spinnerMainCities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position !=0)
                    arrayAdapterCities.getItem(position);
            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onClick(View v) {


        int id = v.getId();

        if (id==R.id.textViewHonestOfficer){

            Intent i =new Intent(AddStoryActivity.this,HonestStory.class);
            startActivity(i);


        }
    }
}


