package com.john.carsistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vehicles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles);

        //Button Name
        String buttonName = EnterVehicle.getYear() + " " + EnterVehicle.getManufacturer() + " "
                + EnterVehicle.getModel();
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setText(buttonName);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), VehicleInformation.class);
                view.getContext().startActivity(Intent);}
        });
    }
}
