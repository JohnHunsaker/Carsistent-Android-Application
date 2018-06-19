package com.john.carsistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class RepairInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair_info);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void goToAirFlt (View view) {
        goToUrl ( "http://www.cartalk.com/content/service-your-car");
    }

    public void goToBrakes (View view) {
        goToUrl ( "http://www.cartalk.com/content/service-your-car-0");
    }

    public void goToCool (View view) {
        goToUrl ( "http://www.cartalk.com/content/service-your-car-1");
    }

    public void goToDrvBlt (View view) {
        goToUrl ( "http://www.cartalk.com/content/service-your-car-5");
    }

    public void goToOil (View view) {
        goToUrl ( "http://www.cartalk.com/content/service-your-car-8");
    }

    public void goToPowStr (View view) {
        goToUrl ( "http://www.cartalk.com/content/service-your-car-9");
    }

    public void goToTire (View view) {
        goToUrl ( "http://www.cartalk.com/content/service-your-car-10");
    }

    public void goToPlugs (View view) {
        goToUrl ( "http://www.cartalk.com/content/service-your-car-11");
    }

    public void goToTrPress (View view) {
        goToUrl ( "http://www.cartalk.com/content/service-your-car-13");
    }

    public void goToTrans (View view) {
        goToUrl ( "http://www.cartalk.com/content/service-your-car-14");
    }

}
