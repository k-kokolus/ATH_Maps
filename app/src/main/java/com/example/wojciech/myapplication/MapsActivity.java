package com.example.wojciech.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

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

        Button bm1 = (Button) findViewById(R.id.About);
        bm1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
            final AlertDialog alertDialog = new AlertDialog.Builder(MapsActivity.this).create();
            alertDialog.setMessage("O programie:\n\nProjekt przedstawiający mapę Akademii Techniczno-Humanistycznej za pomocą wizualizacji 2D");
            alertDialog.show();

            final Timer timer2 = new Timer();
            timer2.schedule(new TimerTask() {
                public void run() {
                    alertDialog.dismiss();
                    timer2.cancel();
                }
            }, 4000); // timer odliczający 4 sekundy wyświetlania okna
        }});

        Button bm2 = (Button) findViewById(R.id.Authors);
        bm2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                final AlertDialog alertDialog = new AlertDialog.Builder(MapsActivity.this).create();
                alertDialog.setMessage("Autorzy: \n\nWojciech Kaczmarczyk \nKamil Pieczka \n\nSpecjalne podziękowania: \nKornelia Kokolus");
                alertDialog.show();

                final Timer timer2 = new Timer();
                timer2.schedule(new TimerTask() {
                    public void run() {
                        alertDialog.dismiss();
                        timer2.cancel();
                    }
                }, 4000); // timer odliczający 4 sekundy wyświetlania okna

            }});

        final EditText ed=(EditText)findViewById(R.id.floor_number);

        Button bm3 = (Button) findViewById(R.id.button_up);
        bm3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                floor += 1;
                floor_choose();
                int a=Integer.parseInt(ed.getText().toString());
                int b=a+1;
                ed.setText(new Integer(b).toString());

            }
        });

        Button bm4 = (Button) findViewById(R.id.button_down);
        bm4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                floor -= 1;
                floor_choose();
                int a=Integer.parseInt(ed.getText().toString());
                int b=a-1;
                ed.setText(new Integer(b).toString());

            }
        });

    }

    public void floor_choose()
    {
        if (floor == 0)
        {
            mMap.clear();
            Polyline lineL_outside0 = mMap.addPolyline(new PolylineOptions()                    //kontury budynku L
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

        if (floor == 1)
        {
            mMap.clear();

            Polyline lineL_outside0 = mMap.addPolyline(new PolylineOptions()                    //kontury budynku L
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


            Polyline lineL_indoor0 = mMap.addPolyline(new PolylineOptions()                   //wnętrze 1 piętro budynek L
                    .add(new LatLng(49.783079, 19.057466), new LatLng(49.782967, 19.057300))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor1 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783079, 19.057466), new LatLng(49.782926, 19.057716))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor2 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78268, 19.05844), new LatLng(49.78286, 19.05815))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor2_1 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7829, 19.05809), new LatLng(49.78319, 19.0576))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor3 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78264, 19.05839), new LatLng(49.78282, 19.05809))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor3_1 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78285, 19.05804), new LatLng(49.78298, 19.05783))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor3_2 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78301, 19.05778), new LatLng(49.78309, 19.05765))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor4 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78302, 19.05756), new LatLng(49.78309, 19.05765))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor5 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7832, 19.05762), new LatLng(49.78318, 19.05766))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor6 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78319, 19.0576), new LatLng(49.7832, 19.05762))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor7 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78318, 19.05766), new LatLng(49.78323, 19.05773))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor8 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78325, 19.0577), new LatLng(49.78323, 19.05773))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor9 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78322, 19.05765), new LatLng(49.78325, 19.0577))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor10 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78321, 19.05766), new LatLng(49.78322, 19.05765))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor11 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78321, 19.05766), new LatLng(49.78322, 19.05768))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor12 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78322, 19.05768), new LatLng(49.78323, 19.05767))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor13 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78328, 19.05766), new LatLng(49.78321, 19.05756))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor14 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78328, 19.05745), new LatLng(49.78321, 19.05756))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor15 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78328, 19.05745), new LatLng(49.78329, 19.05747))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor16 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7834, 19.05728), new LatLng(49.78329, 19.05747))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor17 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7834, 19.05728), new LatLng(49.783415, 19.0573))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor18 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7835, 19.05714), new LatLng(49.783415, 19.0573))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor19 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7835, 19.05714), new LatLng(49.78341, 19.05701))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor20 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78333, 19.05715), new LatLng(49.78341, 19.05701))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor21 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78333, 19.05715), new LatLng(49.783355, 19.05719))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor22 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7832, 19.05745), new LatLng(49.783355, 19.05719))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor23 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7832, 19.05745), new LatLng(49.78314, 19.05736))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor24 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78329, 19.05747), new LatLng(49.78335, 19.05755))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor25 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78334, 19.05738), new LatLng(49.7834, 19.05746))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor26 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78338, 19.05731), new LatLng(49.78344, 19.0574))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor27 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783415, 19.0573), new LatLng(49.783455, 19.05737))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor28 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78345, 19.05724), new LatLng(49.78349, 19.05731))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor29 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783485, 19.05718), new LatLng(49.783525, 19.05725))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor30 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78348, 19.0571), new LatLng(49.78352, 19.05703))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor31 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78344, 19.057045), new LatLng(49.78348, 19.056975))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor32 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78345, 19.05694), new LatLng(49.78341, 19.05701))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor33 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78339, 19.056925), new LatLng(49.78343, 19.05698))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor34 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7834, 19.05703), new LatLng(49.78336, 19.056975))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor35 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78335, 19.057113), new LatLng(49.78331, 19.057057))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor36 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783325, 19.057235), new LatLng(49.78326, 19.057144))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor37 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783225, 19.05776), new LatLng(49.78316, 19.05765))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor38 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78313, 19.0577), new LatLng(49.7832, 19.0578))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor39 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78317, 19.05785), new LatLng(49.7831, 19.05775))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor40 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78314, 19.0579), new LatLng(49.78307, 19.0578))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor41 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78301, 19.05778), new LatLng(49.78294, 19.05769))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor42 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782915, 19.057735), new LatLng(49.78298, 19.05783))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor43 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78291, 19.057955), new LatLng(49.78284, 19.057855))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor44 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78309, 19.057985), new LatLng(49.78302, 19.05788))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor45 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78301, 19.05812), new LatLng(49.78294, 19.05801))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor46 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78285, 19.05804), new LatLng(49.78279, 19.05794))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor47 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782965, 19.05819), new LatLng(49.7829, 19.05809))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor48 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78276, 19.058), new LatLng(49.78282, 19.05809))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor49 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78293, 19.05825), new LatLng(49.78286, 19.05815))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor50 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78275, 19.05833), new LatLng(49.782815, 19.058435))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor51 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78269, 19.05811), new LatLng(49.78276, 19.0582))
                    .width(8)
                    .color(Color.DKGRAY));

            PolygonOptions rectOptions = new PolygonOptions()
                    .add(new LatLng(49.78341, 19.05721),
                            new LatLng(49.78338, 19.05715),
                            new LatLng(49.78342, 19.05708),
                            new LatLng(49.783455, 19.05714));
            Polygon polygon = mMap.addPolygon(rectOptions);
        }
        if (floor == 2)
        {
            mMap.clear();
            Polyline lineL_outside0 = mMap.addPolyline(new PolylineOptions()                    //kontury budynku L
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
                    .add(new LatLng(49.782926, 19.057716), new LatLng(49.783145, 19.057368))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_outside11 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783211, 19.057254), new LatLng(49.783145, 19.057368))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_outside12 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783211, 19.057254), new LatLng(49.783204, 19.057243))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_outside13 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783415, 19.056886), new LatLng(49.783204, 19.057243))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor1 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783265, 19.05714), new LatLng(49.78344, 19.0574))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor2 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78333, 19.05724), new LatLng(49.7832, 19.05745))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor3 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78314, 19.057365), new LatLng(49.7832, 19.05745))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor4 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78309, 19.05745), new LatLng(49.78315, 19.05754))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor5 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78299, 19.05781), new LatLng(49.78315, 19.05754))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor6 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78299, 19.05781), new LatLng(49.78292, 19.057715))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor7 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78291, 19.05774), new LatLng(49.78298, 19.05783))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor8 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7829, 19.05796), new LatLng(49.78298, 19.05783))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor9 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7829, 19.05796), new LatLng(49.78284, 19.05786))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor10 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7829, 19.05796), new LatLng(49.78285, 19.05804))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor11 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78279, 19.05794), new LatLng(49.78285, 19.05804))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor12 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78276, 19.058), new LatLng(49.78282, 19.05809))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor13 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78276, 19.0582), new LatLng(49.78282, 19.05809))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor14 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78276, 19.0582), new LatLng(49.78269, 19.0581))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor15 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78276, 19.0582), new LatLng(49.782645, 19.05839))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor16 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78268, 19.05844), new LatLng(49.78275, 19.05833))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor17 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782813, 19.05843), new LatLng(49.78275, 19.05833))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor18 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78286, 19.05815), new LatLng(49.78275, 19.05833))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor19 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78286, 19.05815), new LatLng(49.78293, 19.05825))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor20 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78297, 19.0582), new LatLng(49.7829, 19.05809))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor21 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782945, 19.05801), new LatLng(49.7829, 19.05809))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor22 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782945, 19.05801), new LatLng(49.78301, 19.05812))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor23 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782945, 19.05801), new LatLng(49.78302, 19.05788))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor24 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78309, 19.05798), new LatLng(49.78302, 19.05788))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor25 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78314, 19.0579), new LatLng(49.78307, 19.0578))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor26 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7831, 19.05775), new LatLng(49.78307, 19.0578))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor27 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7831, 19.05775), new LatLng(49.78317, 19.05785))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor28 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7831, 19.05775), new LatLng(49.78316, 19.05765))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor29 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78316, 19.05765), new LatLng(49.78323, 19.05776))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor30 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78319, 19.0576), new LatLng(49.7832, 19.05762))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor31 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78318, 19.05766), new LatLng(49.78323, 19.05773))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor32 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78325, 19.0577), new LatLng(49.78323, 19.05773))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor33 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78322, 19.05765), new LatLng(49.78325, 19.0577))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor34 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78321, 19.05766), new LatLng(49.78322, 19.05765))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor35 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78321, 19.05766), new LatLng(49.78322, 19.05768))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor36 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78322, 19.05768), new LatLng(49.78323, 19.05767))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor37 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78328, 19.05766), new LatLng(49.78321, 19.05756))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor38 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78328, 19.05745), new LatLng(49.78321, 19.05756))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor39 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78328, 19.05745), new LatLng(49.78329, 19.05747))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor40 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78302, 19.05756), new LatLng(49.78309, 19.05765))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor41 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7832, 19.05762), new LatLng(49.78318, 19.05766))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor42 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78319, 19.0576), new LatLng(49.78316, 19.05765))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor43 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78329, 19.05747), new LatLng(49.78335, 19.05755))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor44 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78329, 19.05747), new LatLng(49.78334, 19.05738))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor45 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7834, 19.05746), new LatLng(49.78334, 19.05738))
                    .width(8)
                    .color(Color.DKGRAY));

        }
    }

    public int floor = 0;

    @Override
    public void onMapReady(GoogleMap googleMap)     //Pozycja (marker) startowa
    {
        mMap = googleMap;
        LatLng start = new LatLng(49.78317, 19.05755);
        mMap.addMarker(new MarkerOptions().position(start).title("ATH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(start));
        mMap.setMinZoomPreference(18.5f);
        floor_choose();




    }


    public void onSearch(View view )    //Wyszukiwanie adresu
    {
        EditText location_tf = (EditText)findViewById(SearchBox);
        String location = location_tf.getText().toString();
        List<android.location.Address> addressList = null;

        if (location == "L134" || location.equals("L134"))
        {
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783210, 19.057343))
                    .title("L134"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783210, 19.057343)));
        }

        if (location == "L120" || location.equals("L120"))
        {
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783314, 19.057127))
                    .title("L120"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783314, 19.057127)));
        }

        if (location == "Dziekanat" || location.equals("Dziekanat"))
        {
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783450, 19.057308))
                    .title("Dziekanat"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783450, 19.057308)));
        }

        if (location == "L135" || location.equals("L135"))
        {
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.782959, 19.057495))
                    .title("L135"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.782959, 19.057495)));
        }

        if (location == "Prodziekan" || location.equals("Prodziekan"))
        {
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783528, 19.057143))
                    .title("Prodziekan"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783528, 19.057143)));
        }

        if (location == "Toaleta" || location.equals("Toaleta"))
        {
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.782960, 19.058136))
                    .title("Toaleta"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.782960, 19.058136)));
        }

    }
}




