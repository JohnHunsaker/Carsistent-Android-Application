package com.john.carsistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class GasMileage extends AppCompatActivity {

    static String mileage;
    public static String getMileage() {return mileage;}
    public static void setMileage(String m) {
        mileage = m;
    }

    static String gallons;
    public static String getGallons() {return gallons;}
    public static void setGallons(String g) {
        gallons = g;
    }

    static String price;
    public static String getPrice() {return price;}
    public static void setPrice(String p) {
        price = p;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gas_mileage);

        String boxName = EnterVehicle.getYear() + " " + EnterVehicle.getManufacturer() + " "
                + EnterVehicle.getModel();
        CheckBox chbx = (CheckBox) findViewById(R.id.checkBox5);
        chbx.setText(boxName);

        Button button1 = (Button) findViewById(R.id.btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), GasMetrics.class);

                EditText iMile = (EditText) findViewById(R.id.input1);
                String mileage = iMile.getText().toString();
                setMileage(mileage);

                EditText iGals = (EditText) findViewById(R.id.input2);
                String gallons = iGals.getText().toString();
                setGallons(gallons);

                EditText iPrc = (EditText) findViewById(R.id.input3);
                String price = iPrc.getText().toString();
                setPrice(price);

                if(!mileage.isEmpty() && !gallons.isEmpty() && !price.isEmpty()) {
                    view.getContext().startActivity(Intent);
                }
            }
        });
    }
}