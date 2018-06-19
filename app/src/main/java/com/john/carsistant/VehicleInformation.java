package com.john.carsistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VehicleInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_information);

        //Manufacturer
        String manufacturer = EnterVehicle.getManufacturer();
        TextView man = (TextView) findViewById(R.id.man_name);
        man.setTextSize(23);
        man.setText(manufacturer);

        //Model
        String model = EnterVehicle.getModel();
        TextView md = (TextView) findViewById(R.id.model_name);
        md.setTextSize(23);
        md.setText(model);

        //Year
        String year = EnterVehicle.getYear();
        TextView yr = (TextView) findViewById(R.id.year_name);
        yr.setTextSize(23);
        yr.setText(year);

        //Color
        String color = EnterVehicle.getColor();
        TextView col = (TextView) findViewById(R.id.color_name);
        col.setTextSize(23);
        col.setText(color);

        //License Plate
        String license = EnterVehicle.getLicPlt();
        TextView lp = (TextView) findViewById(R.id.lic_name);
        lp.setTextSize(23);
        lp.setText(license);

        //Date Purchased
        String datePur = EnterVehicle.getDtPc();
        TextView dp = (TextView) findViewById(R.id.pur_name);
        dp.setTextSize(23);
        dp.setText(datePur);

        //Last-Entered Mileage
        String mileage = EnterVehicle.getCurMile();
        TextView m = (TextView) findViewById(R.id.mile_name);
        m.setTextSize(23);
        m.setText(mileage);


        Button button2 = (Button) findViewById(R.id.btn_retHm);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), FullscreenActivity.class);
                view.getContext().startActivity(Intent);}
        });
    }
}