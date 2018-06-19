package com.john.carsistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class ServiceEvent extends AppCompatActivity {

    static String cmi;
    public static String getCmi() {return cmi;}
    public static void setCmi(String c) {
        cmi = c;
    }

    static String dt;
    public static String getDt() {return dt;}
    public static void setDt(String d) {
        dt = d;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_event);

        String boxName = EnterVehicle.getYear() + " " + EnterVehicle.getManufacturer() + " "
                + EnterVehicle.getModel();
        CheckBox chbx = (CheckBox) findViewById(R.id.checkBox5);
        chbx.setText(boxName);

        Button button1 = (Button) findViewById(R.id.btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), RepairMenu.class);

                EditText mile = (EditText) findViewById(R.id.input1);
                String curMile = mile.getText().toString();
                setCmi(curMile);
                EnterVehicle.setCurMile(curMile);

                EditText dtPc = (EditText) findViewById(R.id.input2);
                String datePur = dtPc.getText().toString();
                setDt(datePur);

                if (!curMile.isEmpty() && !datePur.isEmpty()) {
                    view.getContext().startActivity(Intent);
                }

            }
        });
    }
}
