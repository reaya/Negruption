package com.codeogic.negruption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class AddStoryActivity extends AppCompatActivity {

    @InjectView(R.id.spinnerCities)
    Spinner spinnerMainCities;

    @InjectView(R.id.spinnerStates)
    Spinner spinnerMainStates;

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
    ArrayAdapter<String> arrayAdapterStates,arrayAdapterCities,arrayAdapterDepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_story);

        ButterKnife.inject(this);
        setStates();
         setDepartment();

    }
    public void setDepartment(){

        arrayAdapterDepartment=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
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

    }

    public void setStates(){


        arrayAdapterStates=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterStates.add("--Select State/Union Territory--");
        arrayAdapterStates.add("Andhra Pradesh");
        arrayAdapterStates.add("Andamon And Nicobar Islands");
        arrayAdapterStates.add("Arunachal Pradesh");
        arrayAdapterStates.add("Assam");
        arrayAdapterStates.add("Bihar");
        arrayAdapterStates.add("Chhattisgarh");
        arrayAdapterStates.add("Chandigarh");
        arrayAdapterStates.add("Dadar And Nagar Haveli");
        arrayAdapterStates.add("Daman And Diu");
        arrayAdapterStates.add("Delhi");
        arrayAdapterStates.add("Goa");
        arrayAdapterStates.add("Gujarat");
        arrayAdapterStates.add("Haryana");
        arrayAdapterStates.add("Himachal Pradesh");
        arrayAdapterStates.add("Jammu And Kashmir");
        arrayAdapterStates.add("Jharkhand");
        arrayAdapterStates.add("Karnataka");
        arrayAdapterStates.add("Kerala");
        arrayAdapterStates.add("Lakshadeep");
        arrayAdapterStates.add("Madhya Pradesh");
        arrayAdapterStates.add("Maharashtra");
        arrayAdapterStates.add("Manipur");
        arrayAdapterStates.add("Meghalaya");
        arrayAdapterStates.add("Mizoram");
        arrayAdapterStates.add("Nagaland");
        arrayAdapterStates.add("Orissa");
        arrayAdapterStates.add("Punjab");
        arrayAdapterStates.add("Puducherry");
        arrayAdapterStates.add("Rajasthan");
        arrayAdapterStates.add("Sikkim");
        arrayAdapterStates.add("TamilNadu");
        arrayAdapterStates.add("Tripura");
        arrayAdapterStates.add("Uttaranchal");
        arrayAdapterStates.add("Uttar Pradesh");
        arrayAdapterStates.add("West Bengal");



        spinnerMainStates.setAdapter(arrayAdapterStates);

        spinnerMainStates.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                stateName= (String) parent.getItemAtPosition(position);

                switch (stateName){

                    case "Andhra Pradesh": andhra();
                        break;
                    case "Andamon And Nicobar Islands":andamon();
                        break;
                    case "Arunachal Pradesh":arunachal();
                        break;
                    case "Assam":assam();
                        break;
                    case "Bihar":bihar();
                        break;
                    case "Chhattisgarh":chhattisgarh();
                        break;
                    case "Chandigarh":chandigarh();
                        break;
                    case "Dadar And Nagar Haveli":dadar();
                        break;
                    case "Daman And Diu":daman();
                        break;
                    case "Delhi":delhi();
                        break;
                    case "Goa":goa();
                        break;
                    case "Gujarat":gujarat();
                        break;
                    case "Haryana":haryana();
                        break;
                    case "Himachal Pradesh":himachal();
                        break;
                    case "Jammu and Kashmir":jk();
                        break;
                    case "Jharkhand":jharkhand();
                        break;
                    case "Karnataka":karnataka();
                        break;
                    case "Kerala":kerala();
                        break;
                    case "Lakshadeep":lakshadeep();
                        break;
                    case "Madhya Pradesh":madhya();
                        break;
                    case "Maharashtra":maharashtra();
                        break;
                    case "Manipur":manipur();
                        break;
                    case "Meghalaya":meghalaya();
                        break;
                    case "Mizoram":mizoram();
                        break;
                    case "Nagaland":nagaland();
                        break;
                    case "Orissa":orissa();
                        break;
                    case "Punjab":punjab();
                        break;
                    case "Puducherry":puducherry();
                        break;
                    case "Rajasthan":rajasthan();
                        break;
                    case "Sikkim":sikkim();
                        break;
                    case "Tamil Nadu":tamilnadu();
                        break;
                    case "Tripura":tripura();
                        break;
                    case "Uttaranchal":
                        uttaranchal();
                        break;
                    case "Uttar Pradesh":uttarpradesh();
                        break;
                    case "West Bengal":westbengal();
                        break;

                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }



    public void arunachal(){
        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Anjaw");
        arrayAdapterCities.add("Aalo");
        arrayAdapterCities.add("Anini") ;
        arrayAdapterCities.add("Basar");
        arrayAdapterCities.add("Boleng");
        arrayAdapterCities.add("Bomdila");
        arrayAdapterCities.add("Changlang");
        arrayAdapterCities.add("Daporijo");
        arrayAdapterCities.add("Deomali");
        arrayAdapterCities.add("Dirang");
        arrayAdapterCities.add("Dibang Valley");
        arrayAdapterCities.add("East Kameng");
        arrayAdapterCities.add("East Siang");
        arrayAdapterCities.add("Hawai");
        arrayAdapterCities.add("Itanagar");
        arrayAdapterCities.add("Jairampur");
        arrayAdapterCities.add("Khonsa");
        arrayAdapterCities.add("Koloriang");
        arrayAdapterCities.add("Kurung Kumey");
        arrayAdapterCities.add("Lohit");
        arrayAdapterCities.add("Longding");
        arrayAdapterCities.add("Lower Dibang Valley");
        arrayAdapterCities.add("Lower Subansiri");
        arrayAdapterCities.add("Miao");
        arrayAdapterCities.add("Naharlagun");
        arrayAdapterCities.add("Namsai");
        arrayAdapterCities.add("Papum Pare");
        arrayAdapterCities.add("Pasighat");
        arrayAdapterCities.add("Roing");
        arrayAdapterCities.add("Rupa");
        arrayAdapterCities.add("Sagalee");
        arrayAdapterCities.add("Seppa");
        arrayAdapterCities.add("Tawang");
        arrayAdapterCities.add("Tezu");
        arrayAdapterCities.add("Tawang");
        arrayAdapterCities.add("Tirap")  ;
        arrayAdapterCities.add("Upper Siang");
        arrayAdapterCities.add("Upper Subansiri");
        arrayAdapterCities.add("West Kameng");
        arrayAdapterCities.add("West Siang");
        arrayAdapterCities.add("Yingkiong");
        arrayAdapterCities.add("Ziro");

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

    public void andamon(){
        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);

        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Bakultala");
        arrayAdapterCities.add("BambooFlat");
        arrayAdapterCities.add("Garacharma");
        arrayAdapterCities.add("Nicobar");
        arrayAdapterCities.add("North And Middle Andamon ");
        arrayAdapterCities.add("Port Blair");
        arrayAdapterCities.add("Prothrapur");
        arrayAdapterCities.add("South Andamon");

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

    public void andhra(){
        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);

        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Visakhapatnam");
        arrayAdapterCities.add("Vijayawada");
        arrayAdapterCities.add("Guntur");
        arrayAdapterCities.add("Nellore");
        arrayAdapterCities.add("Kurnool");
        arrayAdapterCities.add("Kadapa");
        arrayAdapterCities.add("Rajahmundry");
        arrayAdapterCities.add("Kakinada");
        arrayAdapterCities.add("Tirupati");
        arrayAdapterCities.add("Anantapur");
        arrayAdapterCities.add("Vizianagaram");
        arrayAdapterCities.add("Eluru");
        arrayAdapterCities.add("Ongole");
        arrayAdapterCities.add("Nandyal");
        arrayAdapterCities.add("Machilipatnam");
        arrayAdapterCities.add("Adoni");
        arrayAdapterCities.add("Tenali");
        arrayAdapterCities.add("Proddatur");
        arrayAdapterCities.add("Chittoor");
        arrayAdapterCities.add("Hindupur");
        arrayAdapterCities.add("Bhimavaram");
        arrayAdapterCities.add("Madanapalle");
        arrayAdapterCities.add("Guntakal");
        arrayAdapterCities.add("Srikakulam");
        arrayAdapterCities.add("Dharmavaram");
        arrayAdapterCities.add("Gudivada");
        arrayAdapterCities.add("Narasaraopet");
        arrayAdapterCities.add("Tadipatri");
        arrayAdapterCities.add("Tadepalligudem");
        arrayAdapterCities.add("Amaravati");
        arrayAdapterCities.add("Chilakaluripet");

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
    public void assam(){

        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Baksa");
        arrayAdapterCities.add("Barpeta");
        arrayAdapterCities.add("Bongaigaon");
        arrayAdapterCities.add("Cachar");
        arrayAdapterCities.add("Chirang");
        arrayAdapterCities.add("Darrang");
        arrayAdapterCities.add("Dhemaji");
        arrayAdapterCities.add("Dhubri");
        arrayAdapterCities.add("Dibrugarh");
        arrayAdapterCities.add("Dima Hasao");
        arrayAdapterCities.add("Goalpara");
        arrayAdapterCities.add("Golaghat");
        arrayAdapterCities.add("Hailakandi");
        arrayAdapterCities.add("Jorhat");
        arrayAdapterCities.add("Kamrup");
        arrayAdapterCities.add("Kamrup Metropolitan");
        arrayAdapterCities.add("Karbi Anglong");
        arrayAdapterCities.add("Karimganj");
        arrayAdapterCities.add("Kokrajhar");
        arrayAdapterCities.add("Lakhimpur");
        arrayAdapterCities.add("Morigaon");
        arrayAdapterCities.add("Nagaon");
        arrayAdapterCities.add("Nalbari");
        arrayAdapterCities.add("Sivasagar");
        arrayAdapterCities.add("Sonitpur");
        arrayAdapterCities.add("Tinsukia");
        arrayAdapterCities.add("Udalguri");

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
    public void bihar(){


        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Arra");
        arrayAdapterCities.add("Aurangabad");
        arrayAdapterCities.add("Bagaha");
        arrayAdapterCities.add("Begusarai");
        arrayAdapterCities.add("Bettiah");
        arrayAdapterCities.add("Bhagalpur");
        arrayAdapterCities.add("Bihar Sharif");
        arrayAdapterCities.add("Buxar");
        arrayAdapterCities.add("Chhapra");
        arrayAdapterCities.add("Darbhanga");
        arrayAdapterCities.add("Danapur");
        arrayAdapterCities.add("Dehri");
        arrayAdapterCities.add("Gaya");
        arrayAdapterCities.add("Hajipur");
        arrayAdapterCities.add("Jamalpur");
        arrayAdapterCities.add("Katihar");
        arrayAdapterCities.add("Kishanganj");
        arrayAdapterCities.add("Madhubani");

        arrayAdapterCities.add("Munger");
        arrayAdapterCities.add("Motihari");
        arrayAdapterCities.add("Muzaffarpur");
        arrayAdapterCities.add("Nawada");
        arrayAdapterCities.add("Patna");
        arrayAdapterCities.add("Purnea");
        arrayAdapterCities.add("Saharsa");
        arrayAdapterCities.add("Sasaram");
        arrayAdapterCities.add("Siwan");
        arrayAdapterCities.add("Sitamarhi");


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
    public void chhattisgarh(){

        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Ambikapur");
        arrayAdapterCities.add("Bilaspur");
        arrayAdapterCities.add("Chirmiri");
        arrayAdapterCities.add("Durg - Bhilai");
        arrayAdapterCities.add("Dhamtari");
        arrayAdapterCities.add("Jagdalpur");
        arrayAdapterCities.add("Korba");
        arrayAdapterCities.add("Mahasamund");
        arrayAdapterCities.add("Pakhanjore");
        arrayAdapterCities.add("Raipur");
        arrayAdapterCities.add("Rajnandgaon");
        arrayAdapterCities.add("Raigarh");

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
    public void chandigarh(){

        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Chandigarh");


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
    public void goa(){

        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Bicholim");
        arrayAdapterCities.add("Canacona");
        arrayAdapterCities.add("Cuncolim");
        arrayAdapterCities.add("Curchorem");
        arrayAdapterCities.add("Mapusa");
        arrayAdapterCities.add("Margao");
        arrayAdapterCities.add("Mormugao");
        arrayAdapterCities.add("PanajiCapital");
        arrayAdapterCities.add("Pernem");
        arrayAdapterCities.add("Ponda");
        arrayAdapterCities.add("Quepem");
        arrayAdapterCities.add("Sanguem");
        arrayAdapterCities.add("Sanquelim");
        arrayAdapterCities.add("Valpoi");

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
    public void gujarat(){

        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Ahmedabad");
        arrayAdapterCities.add("Anand");
        arrayAdapterCities.add("Ankleshwar");
        arrayAdapterCities.add("Amreli");
        arrayAdapterCities.add("Bhavnagar");
        arrayAdapterCities.add("Bharuch");
        arrayAdapterCities.add("Bhuj");
        arrayAdapterCities.add("Botad");
        arrayAdapterCities.add("Dahod");
        arrayAdapterCities.add("Gandhidham");
        arrayAdapterCities.add("Gandhinagar");
        arrayAdapterCities.add("Gir");
        arrayAdapterCities.add("Godhra");
        arrayAdapterCities.add("Gondal");
        arrayAdapterCities.add("Jamnagar");
        arrayAdapterCities.add("Junagadh");
        arrayAdapterCities.add("Jetpur");
        arrayAdapterCities.add("Kalol");
        arrayAdapterCities.add("Morbi");
        arrayAdapterCities.add("Mehsana");
        arrayAdapterCities.add("Nadiad");
        arrayAdapterCities.add("Navsari");
        arrayAdapterCities.add("Porbandar");
        arrayAdapterCities.add("Palanpur");
        arrayAdapterCities.add("Patan");
        arrayAdapterCities.add("Rajkot");
        arrayAdapterCities.add("Surat");
        arrayAdapterCities.add("Surendranagar");
        arrayAdapterCities.add("Vadodara");
        arrayAdapterCities.add("Vapi");
        arrayAdapterCities.add("Veraval");
        arrayAdapterCities.add("Valsad");




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

    public void himachal(){
        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Arki");
        arrayAdapterCities.add("Baddi");
        arrayAdapterCities.add("Badloh");
        arrayAdapterCities.add("Banjar");
        arrayAdapterCities.add("Bhota");
        arrayAdapterCities.add("Bilaspur");
        arrayAdapterCities.add("Chamba");
        arrayAdapterCities.add("Chaupal");
        arrayAdapterCities.add("Chauri Khas");
        arrayAdapterCities.add("Dagshai");
        arrayAdapterCities.add("Dalhousie");
        arrayAdapterCities.add("Daulatpur");
        arrayAdapterCities.add("Dharamshala");
        arrayAdapterCities.add("Dera Gopipur");
        arrayAdapterCities.add("Gagret");
        arrayAdapterCities.add("Hamirpur");
        arrayAdapterCities.add("Indora");
        arrayAdapterCities.add("Jawalamukhi");
        arrayAdapterCities.add("Jhakhri");
        arrayAdapterCities.add("Jogindernagar");
        arrayAdapterCities.add("Jubbal");
        arrayAdapterCities.add("Kangra");
        arrayAdapterCities.add("Kasauli");
        arrayAdapterCities.add("KotKhai");
        arrayAdapterCities.add("Kullu");
        arrayAdapterCities.add("Manali");
        arrayAdapterCities.add("Mandi");
        arrayAdapterCities.add("Naduan");
        arrayAdapterCities.add("Nagrota Bagwan");
        arrayAdapterCities.add("Nahan");
        arrayAdapterCities.add("Naina Devi");
        arrayAdapterCities.add("Nalagarh");
        arrayAdapterCities.add("Narkanda");
        arrayAdapterCities.add("Nurpur");
        arrayAdapterCities.add("Palampur");
        arrayAdapterCities.add("Paonta Sahib");
        arrayAdapterCities.add("Rajgarh");
        arrayAdapterCities.add("Rampur");
        arrayAdapterCities.add("Rawalsar");
        arrayAdapterCities.add("Rohru");
        arrayAdapterCities.add("Sabathu Cantonment");
        arrayAdapterCities.add("Santokhgarh");
        arrayAdapterCities.add("Seoni");
        arrayAdapterCities.add("Shimla");
        arrayAdapterCities.add("Solan");
        arrayAdapterCities.add("Sundarnagar");
        arrayAdapterCities.add("Talai");
        arrayAdapterCities.add("Theog");
        arrayAdapterCities.add("Tira Sujanpur");
        arrayAdapterCities.add("Una");
        arrayAdapterCities.add("Yol Cantonment");



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
    public void haryana(){
        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Ambala");
        arrayAdapterCities.add("Bhiwani");
        arrayAdapterCities.add("Bahadurgarh");
        arrayAdapterCities.add("Faridabad");
        arrayAdapterCities.add("Gurgaon");
        arrayAdapterCities.add("Hisar");
        arrayAdapterCities.add("Jind");
        arrayAdapterCities.add("Panipat");
        arrayAdapterCities.add("Karnal");
        arrayAdapterCities.add("Kaithal");
        arrayAdapterCities.add("Panchkula");
        arrayAdapterCities.add("Palwal");
        arrayAdapterCities.add("Rewari");
        arrayAdapterCities.add("Rohtak");
        arrayAdapterCities.add("Sonipat");
        arrayAdapterCities.add("Sirsa");
        arrayAdapterCities.add("Thanesar");
        arrayAdapterCities.add("Yamunanagar");




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

    public void jk(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Anantnag");
        arrayAdapterCities.add("Badgam");
        arrayAdapterCities.add("Bandipore");
        arrayAdapterCities.add("Baramula");
        arrayAdapterCities.add("Doda");
        arrayAdapterCities.add("Ganderbal");
        arrayAdapterCities.add("Jammu");
        arrayAdapterCities.add("Kargil");
        arrayAdapterCities.add("Kathua");
        arrayAdapterCities.add("Kishtwar");
        arrayAdapterCities.add("Kulgam");
        arrayAdapterCities.add("Kupwara");
        arrayAdapterCities.add("Leh (Ladakh)");
        arrayAdapterCities.add("Pulwama");
        arrayAdapterCities.add("Punch");
        arrayAdapterCities.add("Rajouri");
        arrayAdapterCities.add("Ramban");
        arrayAdapterCities.add("Reasi");
        arrayAdapterCities.add("Samba");
        arrayAdapterCities.add("Shupiyan");
        arrayAdapterCities.add("Srinagar");
        arrayAdapterCities.add("Udhampur");


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
        });}

    public void jharkhand(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Jamshedpur");
        arrayAdapterCities.add("Ranchi");
        arrayAdapterCities.add("Bokaro Steel City");
        arrayAdapterCities.add("Deoghar");
        arrayAdapterCities.add("Phusro");
        arrayAdapterCities.add("Hazaribagh");
        arrayAdapterCities.add("Giridih");
        arrayAdapterCities.add("Ramgarh");
        arrayAdapterCities.add("Medininagar");



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
        });}

    public void karnataka(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Bagalkot");
        arrayAdapterCities.add("Bangalore");
        arrayAdapterCities.add("Belgaum");
        arrayAdapterCities.add("Bellary");
        arrayAdapterCities.add("Bidar");
        arrayAdapterCities.add("Bijapur");
        arrayAdapterCities.add("Chamarajanagar");
        arrayAdapterCities.add("Chikkaballapura");
        arrayAdapterCities.add("Chikmagalur");
        arrayAdapterCities.add("Chitradurga");
        arrayAdapterCities.add("Dakshina");
        arrayAdapterCities.add("Davanagere");
        arrayAdapterCities.add("Dharwad");
        arrayAdapterCities.add("Gadag");
        arrayAdapterCities.add("Gulbarga");
        arrayAdapterCities.add("Hassan");
        arrayAdapterCities.add("Kodagu");
        arrayAdapterCities.add("Kolar");
        arrayAdapterCities.add("Koppal");
        arrayAdapterCities.add("Mandya");
        arrayAdapterCities.add("Mysore");
        arrayAdapterCities.add("Raichur");
        arrayAdapterCities.add("Ramanagara");
        arrayAdapterCities.add("Shimoga");
        arrayAdapterCities.add("Tumkur");
        arrayAdapterCities.add("Udupi");
        arrayAdapterCities.add("Uttara");
        arrayAdapterCities.add("Yadgir");


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
        });}

    public void kerala(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Alleppey");
        arrayAdapterCities.add("Attingal");
        arrayAdapterCities.add("Beypore");
        arrayAdapterCities.add("Calicut");
        arrayAdapterCities.add("Chalakkudy");
        arrayAdapterCities.add("Cherthala");
        arrayAdapterCities.add("Chavakkad");
        arrayAdapterCities.add("Kalamassery");
        arrayAdapterCities.add("Kochi");
        arrayAdapterCities.add("Kanhangad");
        arrayAdapterCities.add("Kannur");
        arrayAdapterCities.add("Koyilandy");
        arrayAdapterCities.add("Kayamkulam");
        arrayAdapterCities.add("Kottayam");
        arrayAdapterCities.add("Kasaragod");
        arrayAdapterCities.add("Kunnamkulam");
        arrayAdapterCities.add("Kottakkal");
        arrayAdapterCities.add("Kottarakara");
        arrayAdapterCities.add("Kattappana");
        arrayAdapterCities.add("Malappuram");
        arrayAdapterCities.add("Manjeri");
        arrayAdapterCities.add("Mattanur");
        arrayAdapterCities.add("Maradu");
        arrayAdapterCities.add("Manjeshwaram");
        arrayAdapterCities.add("Mananthavady");
        arrayAdapterCities.add("Neyyattinkara");
        arrayAdapterCities.add("Nedumangad");
        arrayAdapterCities.add("Nilambur");
        arrayAdapterCities.add("Nileshwaram");
        arrayAdapterCities.add("Ottappalam");
        arrayAdapterCities.add("Palghat");
        arrayAdapterCities.add("Ponnani");
        arrayAdapterCities.add("Payyanur");
        arrayAdapterCities.add("Perinthalmanna");
        arrayAdapterCities.add("Punalur");
        arrayAdapterCities.add("Pandalam");
        arrayAdapterCities.add("Pathanamthitta");
        arrayAdapterCities.add("Paravur");
        arrayAdapterCities.add("Ramanattukara");
        arrayAdapterCities.add("Shornur");
        arrayAdapterCities.add("Trivandrum");
        arrayAdapterCities.add("Trichur");
        arrayAdapterCities.add("Tellicherry");
        arrayAdapterCities.add("Taliparamba");
        arrayAdapterCities.add("Tirur");
        arrayAdapterCities.add("Tiruvalla");
        arrayAdapterCities.add("Uppala");
        arrayAdapterCities.add("Vatakara");
        arrayAdapterCities.add("Varkala");
        arrayAdapterCities.add("Quilon");


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
        });}

    public void madhya(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Alirajpur");
        arrayAdapterCities.add("Anuppur");
        arrayAdapterCities.add("Ashoknagar");
        arrayAdapterCities.add("Balaghat");
        arrayAdapterCities.add("Barwani");
        arrayAdapterCities.add("Betul");
        arrayAdapterCities.add("Bhind");
        arrayAdapterCities.add("Bhopal");
        arrayAdapterCities.add("Burhanpur");
        arrayAdapterCities.add("Chhatarpur");
        arrayAdapterCities.add("Chhindwara");
        arrayAdapterCities.add("Damoh");
        arrayAdapterCities.add("Datia");
        arrayAdapterCities.add("Dewas");
        arrayAdapterCities.add("Dhar");
        arrayAdapterCities.add("Dindori");
        arrayAdapterCities.add("Guna");
        arrayAdapterCities.add("Gwalior");
        arrayAdapterCities.add("Harda");
        arrayAdapterCities.add("Hoshangabad");
        arrayAdapterCities.add("Indore");
        arrayAdapterCities.add("Jabalpur");
        arrayAdapterCities.add("Jhabua");
        arrayAdapterCities.add("Katni");
        arrayAdapterCities.add("Khandwa");
        arrayAdapterCities.add("Khargone");
        arrayAdapterCities.add("Mandla");
        arrayAdapterCities.add("Mandsaur");
        arrayAdapterCities.add("Morena");
        arrayAdapterCities.add("Narsimhapur");
        arrayAdapterCities.add("Neemuch");
        arrayAdapterCities.add("Panna");
        arrayAdapterCities.add("Raisen");
        arrayAdapterCities.add("Rajgarh");
        arrayAdapterCities.add("Ratlam");
        arrayAdapterCities.add("Rewa");
        arrayAdapterCities.add("Sagar");
        arrayAdapterCities.add("Satna");
        arrayAdapterCities.add("Sehore");
        arrayAdapterCities.add("Seoni");
        arrayAdapterCities.add("Shahdol");
        arrayAdapterCities.add("Shajapur");
        arrayAdapterCities.add("Sheopur");
        arrayAdapterCities.add("Shivpuri");
        arrayAdapterCities.add("Sidhi");
        arrayAdapterCities.add("Singrauli");
        arrayAdapterCities.add("Tikamgarh");
        arrayAdapterCities.add("Ujjain");
        arrayAdapterCities.add("Umaria");
        arrayAdapterCities.add("Vidisha");


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
        });}


    public void maharashtra(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Ahmadnagar");
        arrayAdapterCities.add("Akola");
        arrayAdapterCities.add("Amravati");
        arrayAdapterCities.add("Aurangabad");
        arrayAdapterCities.add("Bhandara");
        arrayAdapterCities.add("Bid (Beed)");
        arrayAdapterCities.add("Buldana (Buldhana)");
        arrayAdapterCities.add("Chandrapur");
        arrayAdapterCities.add("Dhule");
        arrayAdapterCities.add("Gadchiroli");
        arrayAdapterCities.add("Gondiya (Gondia)");
        arrayAdapterCities.add("Hingoli");
        arrayAdapterCities.add("Jalgaon");
        arrayAdapterCities.add("Jalna");
        arrayAdapterCities.add("Kolhapur");
        arrayAdapterCities.add("Latur");
        arrayAdapterCities.add("Mumbai");
        arrayAdapterCities.add("Nagpur");
        arrayAdapterCities.add("Nanded");
        arrayAdapterCities.add("Nandurbar");
        arrayAdapterCities.add("Nashik");
        arrayAdapterCities.add("Osmanabad");
        arrayAdapterCities.add("Parbhani");
        arrayAdapterCities.add("Pune");
        arrayAdapterCities.add("Raigad");
        arrayAdapterCities.add("Ratnagiri");
        arrayAdapterCities.add("Sangli");
        arrayAdapterCities.add("Satara");
        arrayAdapterCities.add("Sindhudurg");
        arrayAdapterCities.add("Solapur");
        arrayAdapterCities.add("Thane");
        arrayAdapterCities.add("Wardha");
        arrayAdapterCities.add("Washim");
        arrayAdapterCities.add("Yavatmal");


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
        });}

    public void manipur(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Bishnupur");
        arrayAdapterCities.add("Chandel");
        arrayAdapterCities.add("Churachandpur");
        arrayAdapterCities.add("Imphal East");
        arrayAdapterCities.add("Imphal West");
        arrayAdapterCities.add("Senapati");
        arrayAdapterCities.add("Tamenglong");
        arrayAdapterCities.add("Thoubal");
        arrayAdapterCities.add("Ukhrul");




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
        });}

    public void meghalaya(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Baghmara");
        arrayAdapterCities.add("Cherrapunjee");
        arrayAdapterCities.add("East Garo Hills");
        arrayAdapterCities.add("East Khasi Hills");
        arrayAdapterCities.add("Jaintia Hills");
        arrayAdapterCities.add("Jowai");
        arrayAdapterCities.add("Lawsohtun");
        arrayAdapterCities.add("Madanriting");
        arrayAdapterCities.add("Mairang");
        arrayAdapterCities.add("Mawlai");
        arrayAdapterCities.add("Mawpat");
        arrayAdapterCities.add("Nongkseh");
        arrayAdapterCities.add("Nongmynsong");
        arrayAdapterCities.add("Nongpoh");
        arrayAdapterCities.add("Nongstoin");
        arrayAdapterCities.add("Nongthymmai");
        arrayAdapterCities.add("Pynthormukhrah");
        arrayAdapterCities.add("Resubelpara");
        arrayAdapterCities.add("Ribhoi");
        arrayAdapterCities.add("Shillong");
        arrayAdapterCities.add("South Garo Hills");
        arrayAdapterCities.add("Tura");
        arrayAdapterCities.add("Umlyngka");
        arrayAdapterCities.add("Umpling");
        arrayAdapterCities.add("Umroi");
        arrayAdapterCities.add("West Garo Hills");
        arrayAdapterCities.add("West Khasi Hills");
        arrayAdapterCities.add("Williamnagar");


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
        });}


    public void mizoram(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Aizawl");
        arrayAdapterCities.add("Bairabi");
        arrayAdapterCities.add("Biate");
        arrayAdapterCities.add("Champhai");
        arrayAdapterCities.add("Darlawn");
        arrayAdapterCities.add("Hnahthial");
        arrayAdapterCities.add("Khawhai");
        arrayAdapterCities.add("Khawzawl");
        arrayAdapterCities.add("Kolasib");
        arrayAdapterCities.add("Lawngtlai");
        arrayAdapterCities.add("Lengpui");
        arrayAdapterCities.add("Lunglei");
        arrayAdapterCities.add("Mamit");
        arrayAdapterCities.add("N. Kawnpui");
        arrayAdapterCities.add("North Vanlaiphai");
        arrayAdapterCities.add("Saiha");
        arrayAdapterCities.add("Sairang");
        arrayAdapterCities.add("Saitual");
        arrayAdapterCities.add("Serchhip");
        arrayAdapterCities.add("Thenzawl");
        arrayAdapterCities.add("Tlabung");
        arrayAdapterCities.add("Vairengte");
        arrayAdapterCities.add("Zawlnuam");



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
        });}

    public void nagaland(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Changtongya");
        arrayAdapterCities.add("Chumukedima");
        arrayAdapterCities.add("Dimapur");
        arrayAdapterCities.add("Diphupar");
        arrayAdapterCities.add("Jalukie");
        arrayAdapterCities.add("Kiphire");
        arrayAdapterCities.add("Kohima");
        arrayAdapterCities.add("Kohima");
        arrayAdapterCities.add("Kuda");
        arrayAdapterCities.add("Longleng");
        arrayAdapterCities.add("Medziphema");
        arrayAdapterCities.add("Mokokchung");
        arrayAdapterCities.add("Mon Town");
        arrayAdapterCities.add("Naginimora");
        arrayAdapterCities.add("Peren");
        arrayAdapterCities.add("Pfutsero");
        arrayAdapterCities.add("Phek");
        arrayAdapterCities.add("Puranabazar");
        arrayAdapterCities.add("Rangapahar");
        arrayAdapterCities.add("Satakha Hq.");
        arrayAdapterCities.add("Tseminyu");
        arrayAdapterCities.add("Tsudikong");
        arrayAdapterCities.add("Tuensang");
        arrayAdapterCities.add("Tuli");
        arrayAdapterCities.add("Wokha");


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
        });}

    public void orissa(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Angul");
        arrayAdapterCities.add("Balangir");
        arrayAdapterCities.add("Balasore");
        arrayAdapterCities.add("Bargarh");
        arrayAdapterCities.add("Bhadrak");
        arrayAdapterCities.add("Boudh");
        arrayAdapterCities.add("Cuttack");
        arrayAdapterCities.add("Debagarh");
        arrayAdapterCities.add("Dhenkanal");
        arrayAdapterCities.add("Gajapati");
        arrayAdapterCities.add("Ganjam");
        arrayAdapterCities.add("Jagatsinghapur");
        arrayAdapterCities.add("Jajpur");
        arrayAdapterCities.add("Jharsuguda");
        arrayAdapterCities.add("Kalahandi");
        arrayAdapterCities.add("Kandhamal");
        arrayAdapterCities.add("Kendrapara");
        arrayAdapterCities.add("Kendujhar");
        arrayAdapterCities.add("Khordha");
        arrayAdapterCities.add("Koraput");
        arrayAdapterCities.add("Malkangiri");
        arrayAdapterCities.add("Mayurbhanj");
        arrayAdapterCities.add("Nabarangpur");
        arrayAdapterCities.add("Nayagarh");
        arrayAdapterCities.add("Nuapada");
        arrayAdapterCities.add("Puri");
        arrayAdapterCities.add("Rayagada");
        arrayAdapterCities.add("Sambalpur");
        arrayAdapterCities.add("Subarnapur");
        arrayAdapterCities.add("Sundergarh");


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
        });}

    public void punjab(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Amritsar");
        arrayAdapterCities.add("Barnala");
        arrayAdapterCities.add("Bathinda");
        arrayAdapterCities.add("Faridkot");
        arrayAdapterCities.add("Fatehgarh Sahib");
        arrayAdapterCities.add("Firozpur");
        arrayAdapterCities.add("Gurdaspur");
        arrayAdapterCities.add("Hoshiarpur");
        arrayAdapterCities.add("Jalandhar");
        arrayAdapterCities.add("Kapurthala");
        arrayAdapterCities.add("Ludhiana");
        arrayAdapterCities.add("Mansa");
        arrayAdapterCities.add("Moga");
        arrayAdapterCities.add("Muktsar");
        arrayAdapterCities.add("Patiala");
        arrayAdapterCities.add("Rupnagar");
        arrayAdapterCities.add("Sahibzada Ajit Singh Nagar");
        arrayAdapterCities.add("Sangrur");
        arrayAdapterCities.add("Shahid Bhagat Singh Nagar");
        arrayAdapterCities.add("Tarn Taran");

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
        });}

    public void puducherry(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Ariankuppam");
        arrayAdapterCities.add("Karaikal");
        arrayAdapterCities.add("Kurumbapet");
        arrayAdapterCities.add("Mahé");
        arrayAdapterCities.add("Manavely");
        arrayAdapterCities.add("Ozhukarai");
        arrayAdapterCities.add("Puducherry");
        arrayAdapterCities.add("Thirumalairayanpattinam");
        arrayAdapterCities.add("Villianur");
        arrayAdapterCities.add("Yanam");


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
        });}

    public void rajasthan(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Ajmer");
        arrayAdapterCities.add("Alwar");
        arrayAdapterCities.add("Banswara");
        arrayAdapterCities.add("Baran");
        arrayAdapterCities.add("Barmer");
        arrayAdapterCities.add("Bharatpur");
        arrayAdapterCities.add("Bhilwara");
        arrayAdapterCities.add("Bikaner");
        arrayAdapterCities.add("Bundi");
        arrayAdapterCities.add("Chittorgarh");
        arrayAdapterCities.add("Churu");
        arrayAdapterCities.add("Dausa");
        arrayAdapterCities.add("Dholpur");
        arrayAdapterCities.add("Dungarpur");
        arrayAdapterCities.add("Hanumangarh");
        arrayAdapterCities.add("Jaipur");
        arrayAdapterCities.add("Jaisalmer");
        arrayAdapterCities.add("alor");
        arrayAdapterCities.add("Jhalawar");
        arrayAdapterCities.add("Jhunjhunu");
        arrayAdapterCities.add("Jodhpur");
        arrayAdapterCities.add("Karauli");
        arrayAdapterCities.add("Kota");
        arrayAdapterCities.add("Nagaur");
        arrayAdapterCities.add("Pali");
        arrayAdapterCities.add("Pratapgarh");
        arrayAdapterCities.add("Rajsamand");
        arrayAdapterCities.add("Sawai Madhopur");
        arrayAdapterCities.add("Sikar");
        arrayAdapterCities.add("Sirohi");
        arrayAdapterCities.add("Sri Ganganagar");
        arrayAdapterCities.add("Tonk");
        arrayAdapterCities.add("Udaipur");


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
        });}

    public void sikkim(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Gangtok");
        arrayAdapterCities.add("Gyalshing");
        arrayAdapterCities.add("Jorethang");
        arrayAdapterCities.add("Mangan");
        arrayAdapterCities.add("Namchi");
        arrayAdapterCities.add("Nayabazar");
        arrayAdapterCities.add("Rangpo");
        arrayAdapterCities.add("Rhenak");
        arrayAdapterCities.add("Singtam");


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
        });}

    public void tamilnadu(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Ariyalur");
        arrayAdapterCities.add("Chennai");
        arrayAdapterCities.add("Coimbatore");
        arrayAdapterCities.add("Cuddalore");
        arrayAdapterCities.add("Dharmapuri");
        arrayAdapterCities.add("Dindigul");
        arrayAdapterCities.add("Erode");
        arrayAdapterCities.add("Kanchipuram");
        arrayAdapterCities.add("Kanniyakumari");
        arrayAdapterCities.add("Karur");
        arrayAdapterCities.add("Krishnagiri");
        arrayAdapterCities.add("Madurai");
        arrayAdapterCities.add("Nagapattinam");
        arrayAdapterCities.add("Namakkal");
        arrayAdapterCities.add("Pudukkottai");
        arrayAdapterCities.add("Ramanathapuram");
        arrayAdapterCities.add("Salem");
        arrayAdapterCities.add("Sivaganga");
        arrayAdapterCities.add("Thanjavur");
        arrayAdapterCities.add("Theni");
        arrayAdapterCities.add("The Nilgiris");
        arrayAdapterCities.add("Thiruvallur");
        arrayAdapterCities.add("Thiruvarur");
        arrayAdapterCities.add("Thoothukkudi");
        arrayAdapterCities.add("Tiruchirappalli");
        arrayAdapterCities.add("Tirunelveli");
        arrayAdapterCities.add("Tiruppur");
        arrayAdapterCities.add("Tiruvannamalai");
        arrayAdapterCities.add("Vellore");
        arrayAdapterCities.add("Viluppuram");
        arrayAdapterCities.add("Virudhunagar");
        arrayAdapterCities.add("Tamil Nadu");


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
        });}
    public void tripura(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Agartala");
        arrayAdapterCities.add("Amarpur");
        arrayAdapterCities.add("Belonia");
        arrayAdapterCities.add("Dharmanagar");
        arrayAdapterCities.add("Kailasahar");
        arrayAdapterCities.add("Kamalpur");
        arrayAdapterCities.add("Khowai");
        arrayAdapterCities.add("Kumarghat");
        arrayAdapterCities.add("Ranirbazar");
        arrayAdapterCities.add("Sabroom");
        arrayAdapterCities.add("Sonamura");
        arrayAdapterCities.add("Teliamura");
        arrayAdapterCities.add("Udaipur");
        arrayAdapterCities.add("Bishalgarh");
        arrayAdapterCities.add("Santirbazar");
        arrayAdapterCities.add("Ambassa");
        arrayAdapterCities.add("Jirania");
        arrayAdapterCities.add("Mohanpur");
        arrayAdapterCities.add("Melaghar");
        arrayAdapterCities.add("Panisagar");



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
        });}
    public void uttaranchal(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Almora");
        arrayAdapterCities.add("Bageshwar");
        arrayAdapterCities.add("Chamoli");
        arrayAdapterCities.add("Champawat");
        arrayAdapterCities.add("Dehradun");
        arrayAdapterCities.add("Garhwal");
        arrayAdapterCities.add("Hardwar");
        arrayAdapterCities.add("Nainital");
        arrayAdapterCities.add("Pithoragarh");
        arrayAdapterCities.add("Rudraprayag");
        arrayAdapterCities.add("Tehri Garhwal");
        arrayAdapterCities.add("Udham Singh Nagar");
        arrayAdapterCities.add("Uttarkashi");



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
        });}
    public void uttarpradesh(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Agra");
        arrayAdapterCities.add("Aligarh");
        arrayAdapterCities.add("Allahabad");
        arrayAdapterCities.add("Ambedkar Nagar");
        arrayAdapterCities.add("Amroha");
        arrayAdapterCities.add("Auraiya");
        arrayAdapterCities.add("Azamgarh");
        arrayAdapterCities.add("Baghpat");
        arrayAdapterCities.add("Bahraich");
        arrayAdapterCities.add("Ballia");
        arrayAdapterCities.add("Balrampur");
        arrayAdapterCities.add("Banda");
        arrayAdapterCities.add("Bara Banki");
        arrayAdapterCities.add("Bareilly");
        arrayAdapterCities.add("Basti");
        arrayAdapterCities.add("Bijnor");
        arrayAdapterCities.add("Budaun");
        arrayAdapterCities.add("Bulandshahr");
        arrayAdapterCities.add("Chandauli");
        arrayAdapterCities.add("Chitrakoot");
        arrayAdapterCities.add("Deoria");
        arrayAdapterCities.add("Etah");
        arrayAdapterCities.add("Etawah");
        arrayAdapterCities.add("Faizabad");
        arrayAdapterCities.add("Farrukhabad");
        arrayAdapterCities.add("Fatehpur");
        arrayAdapterCities.add("Firozabad");
        arrayAdapterCities.add("Gautam Buddha Nagar");
        arrayAdapterCities.add("Ghaziabad");
        arrayAdapterCities.add("Ghazipur");
        arrayAdapterCities.add("Gorakhpur");
        arrayAdapterCities.add("Greater Noida");
        arrayAdapterCities.add("Hamirpur");
        arrayAdapterCities.add("Hardoi");
        arrayAdapterCities.add("Hapur");
        arrayAdapterCities.add("Hathras");
        arrayAdapterCities.add("Jalaun");
        arrayAdapterCities.add("Jaunpur");
        arrayAdapterCities.add("Jhansi");
        arrayAdapterCities.add("Kannauj");
        arrayAdapterCities.add("Kanpur");
        arrayAdapterCities.add("Kasganj");
        arrayAdapterCities.add("Kaushambi");
        arrayAdapterCities.add("Kheri (Lakhimpur Kheri)");
        arrayAdapterCities.add("Kushinagar");
        arrayAdapterCities.add("Lalitpur");
        arrayAdapterCities.add("Lucknow");
        arrayAdapterCities.add("Mahoba");
        arrayAdapterCities.add("Mahrajganj");
        arrayAdapterCities.add("Mainpuri");
        arrayAdapterCities.add("Mathura");
        arrayAdapterCities.add("Mau");
        arrayAdapterCities.add("Meerut");
        arrayAdapterCities.add("Mirzapur");
        arrayAdapterCities.add("Moradabad");
        arrayAdapterCities.add("Muzaffarnagar");
        arrayAdapterCities.add("Noida");
        arrayAdapterCities.add("Pilibhit");
        arrayAdapterCities.add("Pratapgarh");
        arrayAdapterCities.add("Rae Bareli");
        arrayAdapterCities.add("Rampur");
        arrayAdapterCities.add("Saharanpur");
        arrayAdapterCities.add("Sant Kabir Nagar");
        arrayAdapterCities.add("Sant Ravidas Nagar");
        arrayAdapterCities.add("Shahjahanpur");
        arrayAdapterCities.add("Shrawasti");
        arrayAdapterCities.add("Siddharthnagar");
        arrayAdapterCities.add("Sitapur");
        arrayAdapterCities.add("Sonbhadra");
        arrayAdapterCities.add("Sultanpur");
        arrayAdapterCities.add("Unnao");
        arrayAdapterCities.add("Varanasi");



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
        });}

    public void westbengal(){ arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");

        arrayAdapterCities.add("Asansol");
        arrayAdapterCities.add("Alipuduar");
        arrayAdapterCities.add("Ashoknagar Kalyangarh");
        arrayAdapterCities.add("Bankura");
        arrayAdapterCities.add("Bangaon");
        arrayAdapterCities.add("Balurghat");
        arrayAdapterCities.add("Barddhaman");
        arrayAdapterCities.add("Birbhum");
        arrayAdapterCities.add("Dakshin Dinajpur");
        arrayAdapterCities.add("Dankuni");
        arrayAdapterCities.add("Darjiling");
        arrayAdapterCities.add("Dhulian");
        arrayAdapterCities.add("Durgapur");
        arrayAdapterCities.add("Haora");
        arrayAdapterCities.add("Habra");
        arrayAdapterCities.add("Hugli");
        arrayAdapterCities.add("Haldia");
        arrayAdapterCities.add("Jalpaiguri");
        arrayAdapterCities.add("Koch Bihar(Cooch Behar)");
        arrayAdapterCities.add("Kolkata");
        arrayAdapterCities.add("Krishnanagar");
        arrayAdapterCities.add("Maldah");
        arrayAdapterCities.add("Murshidabad");
        arrayAdapterCities.add("Nadia");
        arrayAdapterCities.add("North Twenty Four Parganas");
        arrayAdapterCities.add("Paschim Medinipur");
        arrayAdapterCities.add("Purba Medinipur");
        arrayAdapterCities.add("Puruliya");
        arrayAdapterCities.add("Raiganj");
        arrayAdapterCities.add("Shantipur");
        arrayAdapterCities.add("Siliguri");
        arrayAdapterCities.add("South Twenty Four Parganas");
        arrayAdapterCities.add("Uttar Dinajpur");


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
        });}


    public void dadar(){

        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Amli");
        arrayAdapterCities.add("Dadra");
        arrayAdapterCities.add("Nagar Haveli");
        arrayAdapterCities.add("Silvassa");


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
    public void daman(){

        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Bhimpore");
        arrayAdapterCities.add("Dadhel");
        arrayAdapterCities.add("Daman");
        arrayAdapterCities.add("Diu");
        arrayAdapterCities.add("Dunetha");
        arrayAdapterCities.add("Kachigam");
        arrayAdapterCities.add("Kadaiya");
        arrayAdapterCities.add("Marwad");

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

    public void delhi(){
        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Delhi");


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
    public void lakshadeep(){
        arrayAdapterCities=new ArrayAdapter<String>(AddStoryActivity.this,android.R.layout.simple_spinner_dropdown_item);
        arrayAdapterCities.add("-- Which City/District in "+stateName+" --");
        arrayAdapterCities.add("Lakshadweep");
        arrayAdapterCities.add("Kavaratti");


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



}
