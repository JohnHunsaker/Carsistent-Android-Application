package com.john.carsistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class EnterVehicle extends AppCompatActivity {


    static String man;
    public static String getManufacturer() {return man;}
    public static void setManufacturer(String manu) {
        man = manu;
    }

    static String model;
    public static String getModel() {return model;}
    public static void setModel(String mod) {
        model = mod;
    }

    static String year;
    public static String getYear() {return year;}
    public static void setYear(String yr) {
        year = yr;
    }

    static String color;
    public static String getColor() {return color;}
    public static void setColor(String col) {
        color = col;
    }

    static String licPlt;
    public static String getLicPlt() {return licPlt;}
    public static void setLicPlt(String l) {
        licPlt = l;
    }

    static String dtPc;
    public static String getDtPc() {return dtPc;}
    public static void setDtPc(String dp) {
        dtPc = dp;
    }

    static String curMile;
    public static String getCurMile() {return curMile;}
    public static void setCurMile(String mile) {
        curMile = mile;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_vehicle);

        Button button1 = (Button) findViewById(R.id.btn_save);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Intent = new Intent(view.getContext(), EnterVehicleHistory.class);

                EditText iMan = (EditText) findViewById(R.id.input_man);
                String manufacturer = iMan.getText().toString();
                setManufacturer(manufacturer);

                EditText iMod = (EditText) findViewById(R.id.input_model);
                String model = iMod.getText().toString();
                setModel(model);

                EditText iYr = (EditText) findViewById(R.id.input_year);
                String year = iYr.getText().toString();
                setYear(year);

                EditText iCol = (EditText) findViewById(R.id.input_color);
                String color = iCol.getText().toString();
                setColor(color);

                EditText ilc = (EditText) findViewById(R.id.input_licplt);
                String licPlt = ilc.getText().toString();
                setLicPlt(licPlt);

                EditText dtPc = (EditText) findViewById(R.id.input_datepur);
                String datePur = dtPc.getText().toString();
                setDtPc(datePur);

                EditText mile = (EditText) findViewById(R.id.input_curmile);
                String curMile = mile.getText().toString();
                setCurMile(curMile);

                view.getContext().startActivity(Intent);}
        });
    }
}