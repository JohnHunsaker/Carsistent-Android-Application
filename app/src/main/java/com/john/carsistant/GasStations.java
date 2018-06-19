package com.john.carsistant;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.location.Address;
import android.location.Geocoder;
import java.io.IOException;
import java.util.List;

public class GasStations extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_stations);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker.
        LatLng oc = new LatLng(33.8823435, -117.882655699);
        mMap.addMarker(new MarkerOptions().position(oc).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)).title("Current Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(oc));
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(new LatLng(33.8823435, -117.882655699) , 12.0f) );

        List<Address> addressList = null;

        Geocoder geocoder = new Geocoder(this);
        try {
            addressList = geocoder.getFromLocationName("Mobil near Fullerton, CA", 7);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Address address = addressList.get(0);
        LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
        mMap.addMarker(new MarkerOptions().position(latLng).title("Cheapest Gas #1 - Mobil Gas Station"));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));

        try {
            addressList = geocoder.getFromLocationName("Chevron near Fullerton, CA", 7);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Address adrs = addressList.get(0);
        LatLng ltLng = new LatLng(adrs.getLatitude(), adrs.getLongitude());
        mMap.addMarker(new MarkerOptions().position(ltLng).title("Cheapest Gas #2 - Chevron Gas Station"));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(ltLng));

        try {
            addressList = geocoder.getFromLocationName("Extra Mile near Fullerton, CA", 7);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Address adr = addressList.get(0);
        LatLng ltng = new LatLng(adr.getLatitude(), adr.getLongitude());
        mMap.addMarker(new MarkerOptions().position(ltng).title("Cheapest Gas #3 - Extra Mile Gas Station"));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(ltng));

        try {
            addressList = geocoder.getFromLocationName("ARCO near Fullerton, CA", 7);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Address ad = addressList.get(0);
        LatLng lng = new LatLng(ad.getLatitude(), ad.getLongitude());
        mMap.addMarker(new MarkerOptions().position(lng).title("Cheapest Gas #4 - ARCO Gas Station"));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(lng));

        try {
            addressList = geocoder.getFromLocationName("World Oil near Fullerton, CA", 7);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Address ar = addressList.get(0);
        LatLng l = new LatLng(ar.getLatitude(), ar.getLongitude());
        mMap.addMarker(new MarkerOptions().position(l).title("Cheapest Gas #5 - World Oil Gas Station"));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(l));
    }
}
