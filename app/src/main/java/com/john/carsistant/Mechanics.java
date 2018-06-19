package com.john.carsistant;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.io.IOException;
import java.util.List;

public class Mechanics extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanics);
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
            addressList = geocoder.getFromLocationName("Auto Services near Fullerton, CA", 7);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Address address = addressList.get(0);
        LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
        mMap.addMarker(new MarkerOptions().position(latLng).title("Highest-Rated Auto Shop: ''Complete Auto'', 1890 W Commonwealth Ave"));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));

        try {
            addressList = geocoder.getFromLocationName("Car Dealership near Fullerton, CA", 7);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Address adrs = addressList.get(0);
        LatLng ltLng = new LatLng(adrs.getLatitude(), adrs.getLongitude());
        mMap.addMarker(new MarkerOptions().position(ltLng).title("Highest-Rated Dealership: ''OC Auto Exchange'', 1331 Euclid St."));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(ltLng));

        try {
            addressList = geocoder.getFromLocationName("Mobil near Fullerton, CA", 7);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Address adr = addressList.get(0);
        LatLng ltng = new LatLng(adr.getLatitude(), adr.getLongitude());
        mMap.addMarker(new MarkerOptions().position(ltng).title("Nearby Auto Shop: ''Meineke Car Repair'', 506 N State College Blvd"));
        mMap.animateCamera(CameraUpdateFactory.newLatLng(ltng));
    }
}
