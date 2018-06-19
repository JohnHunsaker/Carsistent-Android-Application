package com.john.carsistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MaintenanceHistory extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance_history);

        String mileage = EnterVehicle.getCurMile() + " miles";
        TextView mile = (TextView) findViewById(R.id.mile_name);
        mile.setTextSize(23);
        mile.setText(mileage);

        String oild = EnterVehicleHistory.getOild();
        String oilm = EnterVehicleHistory.getOilm();
        String oil;
        if (oilm.isEmpty() && !oild.isEmpty()) {oil = oild;}
        else if (oild.isEmpty() && oilm.isEmpty()) {oil = "";}
        else if (oild.isEmpty() && !oilm.isEmpty()) {oil = oilm + " miles";}
        else {oil = oilm + " miles, " + oild;}
        TextView oilchg = (TextView) findViewById(R.id.oil);
        oilchg.setTextSize(23);
        oilchg.setText(oil);

        String eafd = EnterVehicleHistory.getEafd();
        String eafm = EnterVehicleHistory.getEafm();
        String eaf;
        if (eafm.isEmpty() && !eafd.isEmpty()) {eaf = eafd;}
        else if (eafd.isEmpty() && eafm.isEmpty()) {eaf = "";}
        else if (eafd.isEmpty() && !eafm.isEmpty()) {eaf = eafm + " miles";}
        else {eaf = eafm + " miles, " + eafd;}
        TextView engf = (TextView) findViewById(R.id.eaf);
        engf.setTextSize(23);
        engf.setText(eaf);

        String transd = EnterVehicleHistory.getTransd();
        String transm = EnterVehicleHistory.getTransm();
        String trans;
        if (transm.isEmpty() && !transd.isEmpty()) {trans = transd;}
        else if (transd.isEmpty() && transm.isEmpty()) {trans = "";}
        else if (transd.isEmpty() && !transm.isEmpty()) {trans = transm + " miles";}
        else {trans = transm + " miles, " + transd;}
        TextView ts = (TextView) findViewById(R.id.trans);
        ts.setTextSize(23);
        ts.setText(trans);

        String steerd = EnterVehicleHistory.getSteerd();
        String steerm = EnterVehicleHistory.getSteerm();
        String steer;
        if (steerm.isEmpty() && !steerd.isEmpty()) {steer = steerd;}
        else if (steerd.isEmpty() && steerm.isEmpty()) {steer = "";}
        else if (steerd.isEmpty() && !steerm.isEmpty()) {steer = steerm + " miles";}
        else {steer = steerm + " miles, " + steerd;}
        TextView std = (TextView) findViewById(R.id.steer);
        std.setTextSize(23);
        std.setText(steer);

        String coold = EnterVehicleHistory.getEcoold();
        String coolm = EnterVehicleHistory.getEcoolm();
        String cool;
        if (coolm.isEmpty() && !coold.isEmpty()) {cool = coold;}
        else if (coold.isEmpty() && coolm.isEmpty()) {cool = "";}
        else if (coold.isEmpty() && !coolm.isEmpty()) {cool = coolm + " miles";}
        else {cool = coolm + " miles, " + coold;}
        TextView cl = (TextView) findViewById(R.id.cool);
        cl.setTextSize(23);
        cl.setText(cool);


        String throtd = EnterVehicleHistory.getThrottled();
        String throtm = EnterVehicleHistory.getThrottlem();
        String throt;
        if (throtm.isEmpty() && !throtd.isEmpty()) {throt = throtd;}
        else if (throtd.isEmpty() && throtm.isEmpty()) {throt = "";}
        else if (throtd.isEmpty() && !throtm.isEmpty()) {throt = throtm + " miles";}
        else {throt = throtm + " miles, " + throtd;}
        TextView tt = (TextView) findViewById(R.id.throt);
        tt.setTextSize(23);
        tt.setText(throt);

        String battd = EnterVehicleHistory.getBatteryd();
        String battm = EnterVehicleHistory.getBatterym();
        String batt;
        if (battm.isEmpty() && !battd.isEmpty()) {batt = battd;}
        else if (battd.isEmpty() && battm.isEmpty()) {batt = "";}
        else if (battd.isEmpty() && !battm.isEmpty()) {batt = battm + " miles";}
        else {batt = battm + " miles, " + battd;}
        TextView bt = (TextView) findViewById(R.id.batt);
        bt.setTextSize(23);
        bt.setText(batt);

        String plugsd = EnterVehicleHistory.getSparkd();
        String plugsm = EnterVehicleHistory.getSparkm();
        String plugs;
        if (plugsm.isEmpty() && !plugsd.isEmpty()) {plugs = plugsd;}
        else if (plugsd.isEmpty() && plugsm.isEmpty()) {plugs = "";}
        else if (plugsd.isEmpty() && !plugsm.isEmpty()) {plugs = plugsm + " miles";}
        else {plugs = plugsm + " miles, " + plugsd;}
        TextView pgs = (TextView) findViewById(R.id.plugs);
        pgs.setTextSize(23);
        pgs.setText(plugs);

        String rotated = EnterVehicleHistory.getRotated();
        String rotatem = EnterVehicleHistory.getRotatem();
        String rotate;
        if (rotatem.isEmpty() && !rotated.isEmpty()) {rotate = rotated;}
        else if (rotated.isEmpty() && rotatem.isEmpty()) {rotate = "";}
        else if (rotated.isEmpty() && !rotatem.isEmpty()) {rotate = rotatem + " miles";}
        else {rotate = rotatem + " miles, " + rotated;}
        TextView rot = (TextView) findViewById(R.id.rotate);
        rot.setTextSize(23);
        rot.setText(rotate);

        String alignd = EnterVehicleHistory.getAlignd();
        String alignm = EnterVehicleHistory.getAlignm();
        String align;
        if (alignm.isEmpty() && !alignd.isEmpty()) {align = alignd;}
        else if (alignd.isEmpty() && alignm.isEmpty()) {align = "";}
        else if (alignd.isEmpty() && !alignm.isEmpty()) {align = alignm + " miles";}
        else {align = alignm + " miles, " + alignd;}
        TextView aln = (TextView) findViewById(R.id.align);
        aln.setTextSize(23);
        aln.setText(align);

        String fpadsd = EnterVehicleHistory.getFpadsd();
        String fpadsm = EnterVehicleHistory.getFpadsm();
        String fpads;
        if (fpadsm.isEmpty() && !fpadsd.isEmpty()) {fpads = fpadsd;}
        else if (fpadsd.isEmpty() && fpadsm.isEmpty()) {fpads = "";}
        else if (fpadsd.isEmpty() && !fpadsm.isEmpty()) {fpads = fpadsm + " miles";}
        else {fpads = fpadsm + " miles, " + fpadsd;}
        TextView fps = (TextView) findViewById(R.id.fpads);
        fps.setTextSize(23);
        fps.setText(fpads);

        String rpadsd = EnterVehicleHistory.getRpadsd();
        String rpadsm = EnterVehicleHistory.getRpadsm();
        String rpads;
        if (rpadsm.isEmpty() && !rpadsd.isEmpty()) {rpads = rpadsd;}
        else if (rpadsd.isEmpty() && rpadsm.isEmpty()) {rpads = "";}
        else if (rpadsd.isEmpty() && !rpadsm.isEmpty()) {rpads = rpadsm + " miles";}
        else {rpads = rpadsm + " miles, " + rpadsd;}
        TextView rps = (TextView) findViewById(R.id.rpads);
        rps.setTextSize(23);
        rps.setText(rpads);

        String flushd = EnterVehicleHistory.getFlushd();
        String flushm = EnterVehicleHistory.getFlushm();
        String flush;
        if (flushm.isEmpty() && !flushd.isEmpty()) {flush = flushd;}
        else if (flushd.isEmpty() && flushm.isEmpty()) {flush = "";}
        else if (flushd.isEmpty() && !flushm.isEmpty()) {flush = flushm + " miles";}
        else {flush = flushm + " miles, " + flushd;}
        TextView fsh = (TextView) findViewById(R.id.flush);
        fsh.setTextSize(23);
        fsh.setText(flush);

        String aird = EnterVehicleHistory.getAird();
        String airm = EnterVehicleHistory.getAirm();
        String air;
        if (airm.isEmpty() && !aird.isEmpty()) {air = aird;}
        else if (aird.isEmpty() && airm.isEmpty()) {air = "";}
        else if (aird.isEmpty() && !airm.isEmpty()) {air = airm + " miles";}
        else {air = airm + " miles, " + aird;}
        TextView aire = (TextView) findViewById(R.id.air);
        aire.setTextSize(23);
        aire.setText(air);

        String wiperd = EnterVehicleHistory.getWiperd();
        String wiperm = EnterVehicleHistory.getWiperm();
        String wiper;
        if (wiperm.isEmpty() && !wiperd.isEmpty()) {wiper = wiperd;}
        else if (wiperd.isEmpty() && wiperm.isEmpty()) {wiper = "";}
        else if (wiperd.isEmpty() && !wiperm.isEmpty()) {wiper = wiperm + " miles";}
        else {wiper = wiperm + " miles, " + wiperd;}
        TextView wpr = (TextView) findViewById(R.id.wiper);
        wpr.setTextSize(23);
        wpr.setText(wiper);

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