package com.example.wojciech.myapplication;

import android.graphics.Color;
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
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.io.IOException;
import java.util.List;

import static com.example.wojciech.myapplication.R.id.SearchBox;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    public GoogleMap mMap;

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
        LatLng start = new LatLng(49.7836529,19.0577128);
        mMap.addMarker(new MarkerOptions().position(start).title("ATH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(start));
        mMap.setMinZoomPreference(18.5f);

        //InteriorL inter = new InteriorL();
       // inter.Draw_L_outside();

        Polyline lineL_outside0 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.783415, 19.056886), new LatLng(49.783593, 19.057136))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside1 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.782822, 19.058445), new LatLng(49.783593, 19.057136))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside2 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.782822, 19.058445), new LatLng(49.782815, 19.058435))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside3 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.782750, 19.058544), new LatLng(49.782815, 19.058435))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside4 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.782750, 19.058544), new LatLng(49.782598, 19.058329))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside5 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.782620, 19.058293), new LatLng(49.782598, 19.058329))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside6 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.782620, 19.058293), new LatLng(49.782611, 19.058280))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside7 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.782656, 19.058204), new LatLng(49.782611, 19.058280))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside8 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.782656, 19.058204), new LatLng(49.782647, 19.058191))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside9 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.782926, 19.057716), new LatLng(49.782647, 19.058191))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside10 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.782926, 19.057716), new LatLng(49.782814, 19.057559))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside11 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.783026, 19.057199), new LatLng(49.782814, 19.057559))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside12 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.783026, 19.057199), new LatLng(49.783145, 19.057368))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside13 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.783211, 19.057254), new LatLng(49.783145, 19.057368))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside14 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.783211, 19.057254), new LatLng(49.783204, 19.057243))
                .width(8)
                .color(Color.DKGRAY));
        Polyline lineL_outside15 = mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(49.783415, 19.056886), new LatLng(49.783204, 19.057243))
                .width(8)
                .color(Color.DKGRAY));

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
