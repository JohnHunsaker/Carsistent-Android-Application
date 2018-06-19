package com.john.carsistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;


public class Carsistant extends AppCompatActivity {

    static int i;
    public static int getI() {return i;}
    public static void setI(int a) {i = a;}

    private final int SPLASH_LENGTH = 1000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carsistant);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(Carsistant.this,Signin.class);
                Carsistant.this.startActivity(mainIntent);
                Carsistant.this.finish();
            }
        }, SPLASH_LENGTH);
    }
}