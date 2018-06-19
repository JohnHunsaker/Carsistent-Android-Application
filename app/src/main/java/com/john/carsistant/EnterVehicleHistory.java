package com.john.carsistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class EnterVehicleHistory extends AppCompatActivity {

    static String oild;
    public static String getOild() {return oild;}
    public static void setOild(String a) {oild = a;}

    static String oilm;
    public static String getOilm() {return oilm;}
    public static void setOilm(String a) {oilm = a;}

    static String eafd;
    public static String getEafd() {return eafd;}
    public static void setEafd(String a) {eafd = a;}

    static String eafm;
    public static String getEafm() {return eafm;}
    public static void setEafm(String a) {eafm = a;}

    static String transd;
    public static String getTransd() {return transd;}
    public static void setTransd(String a) {transd = a;}

    static String transm;
    public static String getTransm() {return transm;}
    public static void setTransm(String a) {transm = a;}

    static String steerd;
    public static String getSteerd() {return steerd;}
    public static void setSteerd(String a) {steerd = a;}

    static String steerm;
    public static String getSteerm() {return steerm;}
    public static void setSteerm(String a) {steerm = a;}

    static String ecoold;
    public static String getEcoold() {return ecoold;}
    public static void setEcoold(String a) {ecoold = a;}

    static String ecoolm;
    public static String getEcoolm() {return ecoolm;}
    public static void setEcoolm(String a) {ecoolm = a;}

    static String throttled;
    public static String getThrottled() {return throttled;}
    public static void setThrottled(String a) {throttled = a;}

    static String throttlem;
    public static String getThrottlem() {return throttlem;}
    public static void setThrottlem(String a) {throttlem = a;}

    static String batteryd;
    public static String getBatteryd() {return batteryd;}
    public static void setBatteryd(String a) {batteryd = a;}

    static String batterym;
    public static String getBatterym() {return batterym;}
    public static void setBatterym(String a) {batterym = a;}

    static String sparkd;
    public static String getSparkd() {return sparkd;}
    public static void setSparkd(String a) {sparkd = a;}

    static String sparkm;
    public static String getSparkm() {return sparkm;}
    public static void setSparkm(String a) {sparkm = a;}

    static String rotated;
    public static String getRotated() {return rotated;}
    public static void setRotated(String a) {rotated = a;}

    static String rotatem;
    public static String getRotatem() {return rotatem;}
    public static void setRotatem(String a) {rotatem = a;}

    static String alignd;
    public static String getAlignd() {return alignd;}
    public static void setAlignd(String a) {alignd = a;}

    static String alignm;
    public static String getAlignm() {return alignm;}
    public static void setAlignm(String a) {alignm = a;}

    static String fpadsd;
    public static String getFpadsd() {return fpadsd;}
    public static void setFpadsd(String a) {fpadsd = a;}

    static String fpadsm;
    public static String getFpadsm() {return fpadsm;}
    public static void setFpadsm(String a) {fpadsm = a;}

    static String rpadsd;
    public static String getRpadsd() {return rpadsd;}
    public static void setRpadsd(String a) {rpadsd = a;}

    static String rpadsm;
    public static String getRpadsm() {return rpadsm;}
    public static void setRpadsm(String a) {rpadsm = a;}

    static String flushd;
    public static String getFlushd() {return flushd;}
    public static void setFlushd(String a) {flushd = a;}

    static String flushm;
    public static String getFlushm() {return flushm;}
    public static void setFlushm(String a) {flushm = a;}

    static String aird;
    public static String getAird() {return aird;}
    public static void setAird(String a) {aird = a;}

    static String airm;
    public static String getAirm() {return airm;}
    public static void setAirm(String a) {airm = a;}

    static String wiperd;
    public static String getWiperd() {return wiperd;}
    public static void setWiperd(String a) {wiperd = a;}

    static String wiperm;
    public static String getWiperm() {return wiperm;}
    public static void setWiperm(String a) {wiperm = a;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_vehicle_history);

        Button button1 = (Button) findViewById(R.id.btn_save);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), FullscreenActivity.class);

                EditText oild = (EditText) findViewById(R.id.input_oild);
                String od = oild.getText().toString();
                setOild(od);

                EditText oilm = (EditText) findViewById(R.id.input_oilm);
                String om = oilm.getText().toString();
                setOilm(om);

                EditText engd = (EditText) findViewById(R.id.input_engd);
                String ed = engd.getText().toString();
                setEafd(ed);

                EditText engm = (EditText) findViewById(R.id.input_engm);
                String em = engm.getText().toString();
                setEafm(em);

                EditText transd = (EditText) findViewById(R.id.input_transd);
                String td = transd.getText().toString();
                setTransd(td);

                EditText transm = (EditText) findViewById(R.id.input_transm);
                String tm = transm.getText().toString();
                setTransm(tm);

                EditText steerd = (EditText) findViewById(R.id.input_steerd);
                String sd = steerd.getText().toString();
                setSteerd(sd);

                EditText steerm = (EditText) findViewById(R.id.input_steerm);
                String sm = steerm.getText().toString();
                setSteerm(sm);

                EditText coold = (EditText) findViewById(R.id.input_coold);
                String cd = coold.getText().toString();
                setEcoold(cd);

                EditText coolm = (EditText) findViewById(R.id.input_coolm);
                String cm = coolm.getText().toString();
                setEcoolm(cm);

                EditText throtd = (EditText) findViewById(R.id.input_throtd);
                String trd = throtd.getText().toString();
                setThrottled(trd);

                EditText throtm = (EditText) findViewById(R.id.input_throtm);
                String trm = throtm.getText().toString();
                setThrottlem(trm);

                EditText battd = (EditText) findViewById(R.id.input_battd);
                String btd = battd.getText().toString();
                setBatteryd(btd);

                EditText battm = (EditText) findViewById(R.id.input_battm);
                String btm = battm.getText().toString();
                setBatterym(btm);

                EditText plugsd = (EditText) findViewById(R.id.input_plugsd);
                String pgd = plugsd.getText().toString();
                setSparkd(pgd);

                EditText plugsm = (EditText) findViewById(R.id.input_plugsm);
                String pgm = plugsm.getText().toString();
                setSparkm(pgm);

                EditText rotatd = (EditText) findViewById(R.id.input_rotatd);
                String rd = rotatd.getText().toString();
                setRotated(rd);

                EditText rotatm = (EditText) findViewById(R.id.input_rotatm);
                String rm = rotatm.getText().toString();
                setRotatem(rm);

                EditText alignd = (EditText) findViewById(R.id.input_alignd);
                String ad = alignd.getText().toString();
                setAlignd(ad);

                EditText alignm = (EditText) findViewById(R.id.input_alignm);
                String am = alignm.getText().toString();
                setAlignm(am);

                EditText fpadsd = (EditText) findViewById(R.id.input_fpadsd);
                String fd = fpadsd.getText().toString();
                setFpadsd(fd);

                EditText fpadsm = (EditText) findViewById(R.id.input_fpadsm);
                String fm = fpadsm.getText().toString();
                setFpadsm(fm);

                EditText rpadsd = (EditText) findViewById(R.id.input_rpadsd);
                String rpd = rpadsd.getText().toString();
                setRpadsd(rpd);

                EditText rpadsm = (EditText) findViewById(R.id.input_rpadsm);
                String rpm = rpadsm.getText().toString();
                setRpadsm(rpm);

                EditText flushd = (EditText) findViewById(R.id.input_flushd);
                String fhd = flushd.getText().toString();
                setFlushd(fhd);

                EditText flushm = (EditText) findViewById(R.id.input_flushm);
                String fhm = flushm.getText().toString();
                setFlushm(fhm);

                EditText aird = (EditText) findViewById(R.id.input_aird);
                String aid = aird.getText().toString();
                setAird(aid);

                EditText airm = (EditText) findViewById(R.id.input_airm);
                String aim = airm.getText().toString();
                setAirm(aim);

                EditText wiperd = (EditText) findViewById(R.id.input_wiperd);
                String wpd = wiperd.getText().toString();
                setWiperd(wpd);

                EditText wiperm = (EditText) findViewById(R.id.input_wiperm);
                String wpm = wiperm.getText().toString();
                setWiperm(wpm);

                view.getContext().startActivity(Intent);}
        });
    }
}