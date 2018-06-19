package com.john.carsistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GasMetrics extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gas_metrics);

        //MPG Since Last Fillup
        String mileage = GasMileage.getMileage();
        String gallons = GasMileage.getGallons();
        double MPG = Double.parseDouble(mileage);
        double gals = Double.parseDouble(gallons);
        MPG = (MPG/gals);
        String mPerg = String.valueOf(MPG) + " miles";

        TextView mpg = (TextView) findViewById(R.id.in1);
        mpg.setTextSize(23);
        mpg.setText(mPerg);

        //MPG This Month
        TextView g = (TextView) findViewById(R.id.in2);
        g.setTextSize(23);
        g.setText(mPerg);

        //Price Per Gallon
        String price = GasMileage.getPrice();
        double expense = Double.parseDouble(price);
        expense = expense * gals;
        TextView p = (TextView) findViewById(R.id.in3);
        p.setTextSize(23);
        String exp = "$" + (String.valueOf(expense));
        p.setText(exp);

        TextView y = (TextView) findViewById(R.id.in4);
        y.setTextSize(23);
        y.setText(mPerg);

        TextView e = (TextView) findViewById(R.id.in5);
        e.setTextSize(23);
        e.setText(exp);

        Button button1 = (Button) findViewById(R.id.btn_hmpg);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), FullscreenActivity.class);
                view.getContext().startActivity(Intent);
            }
        });
    }
}