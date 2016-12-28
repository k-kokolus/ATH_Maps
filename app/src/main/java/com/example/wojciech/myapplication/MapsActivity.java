package com.example.wojciech.myapplication;

import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

import static com.example.wojciech.myapplication.R.id.SearchBox;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap)     //Pozycja (marker) startowa
    {
        mMap = googleMap;
        LatLng sydney = new LatLng(49.7836529,19.0577128);
        mMap.addMarker(new MarkerOptions().position(sydney).title("ATH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.setMinZoomPreference(18.5f);
    }

    public void onSearch(View view )    //Wyszukiwanie adresu
    {
        EditText location_tf = (EditText)findViewById(SearchBox);
        String location = location_tf.getText().toString();
        List<android.location.Address> addressList = null;

        if (location != null || !location.equals(""))
        {
            Geocoder geocoder = new Geocoder(this);
            try {
                addressList = geocoder.getFromLocationName(location, 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            android.location.Address address = addressList.get(0);
            LatLng latLng = new LatLng(address.getLatitude(),address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latLng).title("Znalazłem"));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
            mMap.setMinZoomPreference(18.5f);

        }
    }
}
