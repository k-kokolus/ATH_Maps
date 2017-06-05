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
<<<<<<< HEAD
                alertDialog.setMessage("Autorzy: \n\nWojciech Kaczmarczyk \nKornelia Kokolus \nKamil Pieczka");
=======
                alertDialog.setMessage("Autorzy: \n\nWojciech Kaczmarczyk \nKamil Pieczka \n\nSpecjalne podziękowania: \nKornelia Kokolus");
>>>>>>> test2
                alertDialog.show();

                final Timer timer2 = new Timer();
                timer2.schedule(new TimerTask() {
                    public void run() {
                        alertDialog.dismiss();
                        timer2.cancel();
                    }
                }, 4000); // timer odliczający 4 sekundy wyświetlania okna

            }});

<<<<<<< HEAD
=======
        final EditText ed=(EditText)findViewById(R.id.floor_number);

        Button bm3 = (Button) findViewById(R.id.button_up);
        bm3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                floor += 1;
                floor_choose();
                int a=Integer.parseInt(ed.getText().toString());
                floor_view=a+1;
                ed.setText(new Integer(floor_view).toString());

            }
        });

        Button bm4 = (Button) findViewById(R.id.button_down);
        bm4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                floor -= 1;
                floor_choose();
                int a=Integer.parseInt(ed.getText().toString());
                floor_view=a-1;
                ed.setText(new Integer(floor_view).toString());

            }
        });

>>>>>>> test2
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
            //zaczyna się budynek A
            Polyline lineA_outside16 = mMap.addPolyline(new PolylineOptions()                    //kontury budynku A
                    .add(new LatLng(49.783518, 19.058161), new LatLng(49.783055, 19.058947))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside17 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783055, 19.058947), new LatLng(49.782955, 19.058808))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside18 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782955, 19.058808), new LatLng(49.783417, 19.058015))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside19 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783417, 19.058015), new LatLng(49.783518, 19.058161))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor1 = mMap.addPolyline(new PolylineOptions()                      //wnętrze budynku A
                    .add(new LatLng(49.783487, 19.058119), new LatLng(49.783144, 19.058709))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor2 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783144, 19.058709), new LatLng(49.783174, 19.058749))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor3 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783143, 19.058798), new LatLng(49.783114, 19.058765))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor4 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783114, 19.058765), new LatLng(49.783029, 19.058912))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor5 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783449, 19.058058), new LatLng(49.782989, 19.058857))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor6 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783430, 19.058313), new LatLng(49.783399, 19.058275))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor7 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783401, 19.058359), new LatLng(49.783366, 19.058317))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor8 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783360, 19.058429), new LatLng(49.783327, 19.058384))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor9 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783332, 19.058478), new LatLng(49.783300, 19.058436))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor10 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783299, 19.058535), new LatLng(49.783266, 19.058497))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor11 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783269, 19.058586), new LatLng(49.783239, 19.058545))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor12 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783246, 19.058624), new LatLng(49.783215, 19.058578))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor13 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783230, 19.058653), new LatLng(49.783197, 19.058606))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor14 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783195, 19.058712), new LatLng(49.783163, 19.058674))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor15 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783318, 19.058501), new LatLng(49.783289, 19.058466))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor16 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783417, 19.058314), new LatLng(49.783404, 19.058337))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor17 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783409, 19.058307), new LatLng(49.783394, 19.058334))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor18 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783401, 19.058295), new LatLng(49.783385, 19.058322))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor19 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783185, 19.058706), new LatLng(49.783172, 19.058732))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor20 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783177, 19.058697), new LatLng(49.783165, 19.058722))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor21 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783168, 19.058687), new LatLng(49.783155, 19.058718))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor22 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783100, 19.058870), new LatLng(49.783072, 19.058841))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor23 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783360, 19.058112), new LatLng(49.783389, 19.058158))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor24 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783272, 19.058261), new LatLng(49.783308, 19.058303))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor25 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783255, 19.058293), new LatLng(49.783287, 19.058333))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor26 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783235, 19.058327), new LatLng(49.783265, 19.058373))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor27 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783180, 19.058422), new LatLng(49.783212, 19.058466))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor28 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783138, 19.058495), new LatLng(49.783169, 19.058540))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor29 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783089, 19.058580), new LatLng(49.783123, 19.058627))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor30 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783064, 19.058621), new LatLng(49.783097, 19.058669))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor31 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783038, 19.058668), new LatLng(49.783069, 19.058709))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_indoor32 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782999, 19.058733), new LatLng(49.783031, 19.058787))
                    .width(8)
                    .color(Color.DKGRAY));
            //zaczyna się budynek B
            Polyline lineB_outside20 = mMap.addPolyline(new PolylineOptions()                   //kontury budynku B
                    .add(new LatLng(49.783841, 19.058612), new LatLng(49.783376, 19.059395))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside21 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783376, 19.059395), new LatLng(49.783274, 19.059248))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside22 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783274, 19.059248), new LatLng(49.783740, 19.058470))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside23 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783740, 19.058470), new LatLng(49.783841, 19.058612))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor33 = mMap.addPolyline(new PolylineOptions()                    // wnętrze budynku B
                    .add(new LatLng(49.783651, 19.058617), new LatLng(49.783684, 19.058658))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor34 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783684, 19.058658), new LatLng(49.783770, 19.058512))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor35 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783624, 19.058664), new LatLng(49.783652, 19.058709))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor36 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783652, 19.058709), new LatLng(49.783304, 19.059290))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor37 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783345, 19.059349), new LatLng(49.783811, 19.058571))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor38 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783713, 19.058516), new LatLng(49.783742, 19.058552))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor39 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783686, 19.058562), new LatLng(49.783714, 19.058599))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor40 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783601, 19.058702), new LatLng(49.783632, 19.058745))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor41 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783561, 19.058769), new LatLng(49.783594, 19.058810))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor42 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783541, 19.058805), new LatLng(49.783571, 19.058845))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor43 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783518, 19.058840), new LatLng(49.783546, 19.058881))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor44 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783492, 19.058885), new LatLng(49.783518, 19.058928))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor45 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783464, 19.058932), new LatLng(49.783493, 19.058971))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor46 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783437, 19.058978), new LatLng(49.783465, 19.059016))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor47 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783413, 19.059017), new LatLng(49.783440, 19.059055))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor48 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783392, 19.059053), new LatLng(49.783420, 19.059096))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor49 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783363, 19.059100), new LatLng(49.783389, 19.059138))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor50 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783336, 19.059147), new LatLng(49.783364, 19.059184))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor51 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783311, 19.059189), new LatLng(49.783338, 19.059223))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor52 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783294, 19.059220), new LatLng(49.783317, 19.059258))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor53 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783733, 19.058794), new LatLng(49.783698, 19.058752))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor54 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783668, 19.058902), new LatLng(49.783639, 19.058870))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor55 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783646, 19.058939), new LatLng(49.783613, 19.058907))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor56 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783623, 19.058979), new LatLng(49.783591, 19.058935))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor57 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783603, 19.059011), new LatLng(49.783571, 19.058975))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor58 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783586, 19.059041), new LatLng(49.783555, 19.059001))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor59 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783570, 19.059065), new LatLng(49.783537, 19.059026))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor60 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783552, 19.059097), new LatLng(49.783519, 19.059054))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor61 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783536, 19.059125), new LatLng(49.783501, 19.059081))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor62 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783520, 19.059151), new LatLng(49.783488, 19.059115))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor63 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783493, 19.059197), new LatLng(49.783459, 19.059158))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor64 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783467, 19.059239), new LatLng(49.783434, 19.059200))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor65 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783445, 19.059277), new LatLng(49.783412, 19.059233))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor66 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783420, 19.059319), new LatLng(49.783388, 19.059270))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor67 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783399, 19.059353), new LatLng(49.783365, 19.059317))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor68 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783393, 19.059068), new LatLng(49.783376, 19.059096))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor69 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783399, 19.059077), new LatLng(49.783384, 19.059104))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor70 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783407, 19.059085), new LatLng(49.783390, 19.059112))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor71 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783627, 19.058677), new LatLng(49.783614, 19.058704))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor72 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783633, 19.058687), new LatLng(49.783620, 19.058711))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_indoor73 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783643, 19.058693), new LatLng(49.783630, 19.058719))
                    .width(8)
                    .color(Color.DKGRAY));
        }

        if (floor == 1)
        {
            mMap.clear();

            Polyline lineA_outside16 = mMap.addPolyline(new PolylineOptions()                    //kontury budynku A
                    .add(new LatLng(49.783518, 19.058161), new LatLng(49.783055, 19.058947))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside17 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783055, 19.058947), new LatLng(49.782955, 19.058808))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside18 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782955, 19.058808), new LatLng(49.783417, 19.058015))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside19 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783417, 19.058015), new LatLng(49.783518, 19.058161))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside20 = mMap.addPolyline(new PolylineOptions()                   //kontury budynku B
                    .add(new LatLng(49.783841, 19.058612), new LatLng(49.783376, 19.059395))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside21 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783376, 19.059395), new LatLng(49.783274, 19.059248))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside22 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783274, 19.059248), new LatLng(49.783740, 19.058470))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside23 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783740, 19.058470), new LatLng(49.783841, 19.058612))
                    .width(8)
                    .color(Color.DKGRAY));
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

            Polyline lineA_outside16 = mMap.addPolyline(new PolylineOptions()                    //kontury budynku A
                    .add(new LatLng(49.783518, 19.058161), new LatLng(49.783055, 19.058947))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside17 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783055, 19.058947), new LatLng(49.782955, 19.058808))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside18 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782955, 19.058808), new LatLng(49.783417, 19.058015))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside19 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783417, 19.058015), new LatLng(49.783518, 19.058161))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside20 = mMap.addPolyline(new PolylineOptions()                   //kontury budynku B
                    .add(new LatLng(49.783841, 19.058612), new LatLng(49.783376, 19.059395))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside21 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783376, 19.059395), new LatLng(49.783274, 19.059248))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside22 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783274, 19.059248), new LatLng(49.783740, 19.058470))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside23 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783740, 19.058470), new LatLng(49.783841, 19.058612))
                    .width(8)
                    .color(Color.DKGRAY));
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
        if (floor == 3)
        {
            mMap.clear();

            Polyline lineA_outside16 = mMap.addPolyline(new PolylineOptions()                    //kontury budynku A
                    .add(new LatLng(49.783518, 19.058161), new LatLng(49.783055, 19.058947))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside17 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783055, 19.058947), new LatLng(49.782955, 19.058808))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside18 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782955, 19.058808), new LatLng(49.783417, 19.058015))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside19 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783417, 19.058015), new LatLng(49.783518, 19.058161))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside20 = mMap.addPolyline(new PolylineOptions()                   //kontury budynku B
                    .add(new LatLng(49.783841, 19.058612), new LatLng(49.783376, 19.059395))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside21 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783376, 19.059395), new LatLng(49.783274, 19.059248))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside22 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783274, 19.059248), new LatLng(49.783740, 19.058470))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside23 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783740, 19.058470), new LatLng(49.783841, 19.058612))
                    .width(8)
                    .color(Color.DKGRAY));
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
            Polyline lineL_indoor15 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78276, 19.058), new LatLng(49.78293, 19.05825))
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
        if (floor == 4)
        {
            mMap.clear();

            Polyline lineA_outside16 = mMap.addPolyline(new PolylineOptions()                    //kontury budynku A
                    .add(new LatLng(49.783518, 19.058161), new LatLng(49.783055, 19.058947))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside17 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783055, 19.058947), new LatLng(49.782955, 19.058808))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside18 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.782955, 19.058808), new LatLng(49.783417, 19.058015))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineA_outside19 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783417, 19.058015), new LatLng(49.783518, 19.058161))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside20 = mMap.addPolyline(new PolylineOptions()                   //kontury budynku B
                    .add(new LatLng(49.783841, 19.058612), new LatLng(49.783376, 19.059395))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside21 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783376, 19.059395), new LatLng(49.783274, 19.059248))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside22 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783274, 19.059248), new LatLng(49.783740, 19.058470))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineB_outside23 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.783740, 19.058470), new LatLng(49.783841, 19.058612))
                    .width(8)
                    .color(Color.DKGRAY));
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
                    .add(new LatLng(49.78309, 19.05765), new LatLng(49.78315, 19.05754))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor5_1 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78309, 19.05765), new LatLng(49.78303, 19.05755))
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
            Polyline lineL_indoor10_1 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78279, 19.05794), new LatLng(49.78285, 19.05804))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor11 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78298, 19.05783), new LatLng(49.7829, 19.05795))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor12 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78298, 19.05783), new LatLng(49.78291, 19.05774))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor13 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7829, 19.05795), new LatLng(49.78284, 19.05786))
                    .width(8)
                    .color(Color.DKGRAY));
            Polyline lineL_indoor15 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.78276, 19.058), new LatLng(49.78293, 19.05825))
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
            Polyline lineL_indoor46 = mMap.addPolyline(new PolylineOptions()
                    .add(new LatLng(49.7832, 19.05727), new LatLng(49.78326, 19.05736))
                    .width(8)
                    .color(Color.DKGRAY));

        }
    }

    public int floor_view =0;
    public int floor = 0;

    @Override
    public void onMapReady(GoogleMap googleMap)     //Pozycja (marker) startowa
    {
        mMap = googleMap;
        LatLng start = new LatLng(49.7831977,19.0585397);
        mMap.addMarker(new MarkerOptions().position(start).title("ATH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(start));
        mMap.setMinZoomPreference(17.5f);
        floor_choose();
    }


    public void onSearch(View view )    //Wyszukiwanie adresu
    {
        EditText location_tf = (EditText)findViewById(SearchBox);
        String location = location_tf.getText().toString();
        List<android.location.Address> addressList = null;

<<<<<<< HEAD
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
=======
        if (location == "L120" || location.equals("L120") || location.equals("l120"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78324, 19.05729)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78324, 19.05729))
                    .title("L120"));
        }
        if (location == "L128" || location.equals("L128") || location.equals("l128") || location.equals("Aula") || location.equals("aula"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78291, 19.05755)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78291, 19.05755))
                    .title("L128"));
        }
        if (location == "L131" || location.equals("L131") || location.equals("l131"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78299, 19.05769)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78299, 19.05769))
                    .title("L131"));
        }
        if (location == "L132" || location.equals("L132") || location.equals("l132"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.7829, 19.05782)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.7829, 19.05782))
                    .title("L132"));
        }
        if (location == "L134" || location.equals("L134") || location.equals("l134"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78285, 19.05794)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78285, 19.05794))
                    .title("L134"));
        }
        if (location == "L135" || location.equals("L135") || location.equals("l135"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78276, 19.05809)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78276, 19.05809))
                    .title("L135"));
        }
        if (location == "L136" || location.equals("L136") || location.equals("l136"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78267, 19.05826)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78267, 19.05826))
                    .title("L136"));
        }
        if (location == "L137" || location.equals("L137") || location.equals("l137"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78274, 19.05843)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78274, 19.05843))
                    .title("L137"));
        }
        if (location == "L138" || location.equals("L138") || location.equals("l138"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78284, 19.05828)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78284, 19.05828))
                    .title("L138"));
        }
        if (location == "L142" || location.equals("L142") || location.equals("l142"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78295, 19.05809)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78295, 19.05809))
                    .title("L146"));
        }
        if (location == "L143" || location.equals("L143") || location.equals("l143"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78301, 19.05799)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78301, 19.05799))
                    .title("L143"));
        }
        if (location == "L145" || location.equals("L145") || location.equals("l145"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78308, 19.05788)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78308, 19.05788))
                    .title("L145"));
        }
        if (location == "L146" || location.equals("L146") || location.equals("l146"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78312, 19.05782)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78312, 19.05782))
                    .title("L146"));
        }
        if (location == "L147" || location.equals("L147") || location.equals("l147"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78315, 19.05777)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78315, 19.05777))
                    .title("L147"));
        }
        if (location == "L148" || location.equals("L148") || location.equals("l148"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78318, 19.05772)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78318, 19.05772))
                    .title("L148"));
        }
        if (location == "L152" || location.equals("L152") || location.equals("l152"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78334, 19.05746)));
            floor = 1;
            floor_view = 1;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78334, 19.05746))
                    .title("L152"));
        }
        if (location == "L221" || location.equals("L221") || location.equals("l221"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78324, 19.05729)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78324, 19.05729))
                    .title("L221"));
        }
        if (location == "L224" || location.equals("L224") || location.equals("l224"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78308, 19.05754)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78308, 19.05754))
                    .title("L224"));
        }
        if (location == "L227" || location.equals("L227") || location.equals("l227"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78299, 19.05769)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78299, 19.05769))
                    .title("L227"));
        }
        if (location == "L229" || location.equals("L229") || location.equals("l229")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.7829, 19.05782)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.7829, 19.05782))
                    .title("L229"));
        }
        if (location == "L230" || location.equals("L230") || location.equals("l230"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78276, 19.05809)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78276, 19.05809))
                    .title("L230"));
        }
        if (location == "L231" || location.equals("L231") || location.equals("l231"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78267, 19.05826)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78267, 19.05826))
                    .title("L231"));
        }
        if (location == "L232" || location.equals("L232") || location.equals("l232"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78274, 19.05843)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78274, 19.05843))
                    .title("L232"));
        }
        if (location == "L233" || location.equals("L233") || location.equals("l233"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78284, 19.05828)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78284, 19.05828))
                    .title("L233"));
        }
        if (location == "L238" || location.equals("L238") || location.equals("l238"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78301, 19.05799)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78301, 19.05799))
                    .title("L238"));
        }
        if (location == "L241" || location.equals("L241") || location.equals("l241"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78312, 19.05782)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78312, 19.05782))
                    .title("L241"));
        }
        if (location == "L245" || location.equals("L245") || location.equals("l245"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78334, 19.05746)));
            floor = 2;
            floor_view = 2;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78334, 19.05746))
                    .title("L245"));
        }
        if (location == "L318" || location.equals("L318") || location.equals("l318"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78324, 19.05729)));
            floor = 3;
            floor_view = 3;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78324, 19.05729))
                    .title("L318"));
        }
        if (location == "L323" || location.equals("L323") || location.equals("l323"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78308, 19.05754)));
            floor = 3;
            floor_view = 3;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78308, 19.05754))
                    .title("L323"));
        }
        if (location == "L324" || location.equals("L324") || location.equals("l324"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78299, 19.05769)));
            floor = 3;
            floor_view = 3;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78299, 19.05769))
                    .title("L324"));
        }
        if (location == "L325" || location.equals("L325") || location.equals("l325"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.7829, 19.05782)));
            floor = 3;
            floor_view = 3;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.7829, 19.05782))
                    .title("L324"));
        }
        if (location == "Stołówka" || location.equals("Stołówka") || location.equals("stołówka") || location.equals("stolowka"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78275, 19.05826)));
            floor = 3;
            floor_view = 3;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78275, 19.05826))
                    .title("Stołówka"));
        }
        if (location == "L331" || location.equals("L331") || location.equals("l331"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78301, 19.05799)));
            floor = 3;
            floor_view = 3;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78301, 19.05799))
                    .title("L331"));
        }
        if (location == "L334" || location.equals("L334") || location.equals("l334"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78312, 19.05782)));
            floor = 3;
            floor_view = 3;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78312, 19.05782))
                    .title("L334"));
        }
        if (location == "L339" || location.equals("L339") || location.equals("l339"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78334, 19.05746)));
            floor = 3;
            floor_view = 3;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78334, 19.05746))
                    .title("L339"));
        }




        if (location == "L412" || location.equals("L412") || location.equals("l412"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78326, 19.05723)));
            floor = 4;
            floor_view = 4;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78326, 19.05723))
                    .title("L412"));
        }
        if (location == "L413" || location.equals("L413") || location.equals("l413"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.7832, 19.05734)));
            floor = 4;
            floor_view = 4;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.7832, 19.05734))
                    .title("L413"));
        }
        if (location == "Sala senatu" || location.equals("Sala senatu") || location.equals("senat"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78308, 19.05754)));
            floor = 4;
            floor_view = 4;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78308, 19.05754))
                    .title("Sala senatu"));
        }
        if (location == "L420" || location.equals("L420") || location.equals("l420"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78299, 19.05769)));
            floor = 4;
            floor_view = 4;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78299, 19.05769))
                    .title("L420"));
        }
        if (location == "L420A" || location.equals("L420A") || location.equals("l420a"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.7829, 19.05782)));
            floor = 4;
            floor_view = 4;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.7829, 19.05782))
                    .title("L420A"));
        }
        if (location == "L428" || location.equals("L428") || location.equals("l428"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78301, 19.05799)));
            floor = 4;
            floor_view = 4;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78301, 19.05799))
                    .title("L428"));
        }
        if (location == "L431" || location.equals("L431") || location.equals("l431"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78312, 19.05782)));
            floor = 4;
            floor_view = 4;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78312, 19.05782))
                    .title("L431"));
        }
        if (location == "L433" || location.equals("L433") || location.equals("l433"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.78334, 19.05746)));
            floor = 4;
            floor_view = 4;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.78334, 19.05746))
                    .title("L433"));
        }
        if (location == "Katedra A" || location.equals("Katedra A") || location.equals("katedra a"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783469, 19.058205)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783469, 19.058205))
                    .title("Katedra A"));
        }
        if (location == "A9" || location.equals("A9") || location.equals("a9"))
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783362, 19.058374)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed=(EditText)findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783362, 19.058374))
                    .title("A9"));
        }
        if (location == "A8" || location.equals("A8") || location.equals("a8")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783322, 19.058448)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783322, 19.058448))
                    .title("A8"));
        }
        if (location == "A7" || location.equals("A7") || location.equals("a7")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783313, 19.058472)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783313, 19.058472))
                    .title("A7"));
        }
        if (location == "WC A" || location.equals("WC A") || location.equals("wc a")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783300, 19.058501)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783300, 19.058501))
                    .title("WC A"));
        }
        if (location == "A5" || location.equals("A5") || location.equals("a5")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783260, 19.058539)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783260, 19.058539))
                    .title("A5"));
        }
        if (location == "A4" || location.equals("A4") || location.equals("a4")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783241, 19.058574)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783241, 19.058574))
                    .title("A4"));
        }
        if (location == "A3" || location.equals("A3") || location.equals("a3")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783218, 19.058616)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783218, 19.058616))
                    .title("A3"));
        }
        if (location == "A2" || location.equals("A2") || location.equals("a2")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783193, 19.058653)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783193, 19.058653))
                    .title("A2"));
        }
        if (location == "A26" || location.equals("A26") || location.equals("a26")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783104, 19.058816)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783104, 19.058816))
                    .title("A26"));
        }
        if (location == "A25" || location.equals("A25") || location.equals("a25")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783063, 19.058879)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783063, 19.058879))
                    .title("A25"));
        }
        if (location == "A15a" || location.equals("A15a") || location.equals("a15a")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783402, 19.058091)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783402, 19.058091))
                    .title("A15a"));
        }
        if (location == "A15" || location.equals("A15") || location.equals("a15")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783327, 19.058239)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783327, 19.058239))
                    .title("A15"));
        }
        if (location == "A16" || location.equals("A16") || location.equals("a16")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783287, 19.058304)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783287, 19.058304))
                    .title("A16"));
        }
        if (location == "A17" || location.equals("A17") || location.equals("a17")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783266, 19.058337)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783266, 19.058337))
                    .title("A17"));
        }
        if (location == "A18" || location.equals("A18") || location.equals("a18")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783231, 19.058395)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783231, 19.058395))
                    .title("A18"));
        }
        if (location == "A19" || location.equals("A19") || location.equals("a19")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783179, 19.058489)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783179, 19.058489))
                    .title("A19"));
        }
        if (location == "A20" || location.equals("A20") || location.equals("a20")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783137, 19.058564)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783137, 19.058564))
                    .title("A20"));
        }
        if (location == "A21" || location.equals("A21") || location.equals("a21")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783099, 19.058619)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783099, 19.058619))
                    .title("A21"));
        }
        if (location == "A22" || location.equals("A22") || location.equals("a22")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783069, 19.058678)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783069, 19.058678))
                    .title("A22"));
        }
        if (location == "A23" || location.equals("A23") || location.equals("a23")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783039, 19.058736)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783039, 19.058736))
                    .title("A23"));
        }
        if (location == "A24" || location.equals("A24") || location.equals("a24")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783000, 19.058793)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783000, 19.058793))
                    .title("A24"));
        }
        if (location == "A24" || location.equals("A24") || location.equals("a24")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783000, 19.058793)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783000, 19.058793))
                    .title("A24"));
        }
        if (location == "Las Vegas" || location.equals("Las Vegas") || location.equals("las vegas")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(36.171868, -115.146642)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(36.171868, -115.146642))
                    .title("Las Vegas"));
        }
        if (location == "B25" || location.equals("B25") || location.equals("b25")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783747, 19.058510)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783747, 19.058510))
                    .title("B25"));
        }
        if (location == "B23" || location.equals("B23") || location.equals("b23")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783713, 19.058562)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783713, 19.058562))
                    .title("B23"));
        }
        if (location == "B22" || location.equals("B22") || location.equals("b22")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783689, 19.058609)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783689, 19.058609))
                    .title("B22"));
        }
        if (location == "B19" || location.equals("B19") || location.equals("b19")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783600, 19.058754)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783600, 19.058754))
                    .title("B19"));
        }
        if (location == "B17" || location.equals("B17") || location.equals("b17")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783570, 19.058815)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783570, 19.058815))
                    .title("B17"));
        }
        if (location == "B16" || location.equals("B16") || location.equals("b16")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783548, 19.058853)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783548, 19.058853))
                    .title("B16"));
        }
        if (location == "Toaleta B" || location.equals("Toaleta B") || location.equals("toaleta b")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783527, 19.058886)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783527, 19.058886))
                    .title("Toaleta B"));
        }
        if (location == "B11" || location.equals("B11") || location.equals("b11")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783500, 19.058943)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783500, 19.058943))
                    .title("B11"));
        }
        if (location == "B10" || location.equals("B10") || location.equals("b10")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783472, 19.058981)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783472, 19.058981))
                    .title("B10"));
        }
        if (location == "B9" || location.equals("B9") || location.equals("b9")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783447, 19.059017)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783447, 19.059017))
                    .title("B9"));
        }
        if (location == "B8" || location.equals("B8") || location.equals("b8")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783418, 19.059054)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783418, 19.059054))
                    .title("B8"));
        }
        if (location == "Katedry B" || location.equals("Katedry B") || location.equals("katedry b")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783335, 19.059193)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783335, 19.059193))
                    .title("Katedry B"));
        }
        if (location == "B26" || location.equals("B26") || location.equals("b26")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783756, 19.058693)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783756, 19.058693))
                    .title("B26"));
        }
        if (location == "B27" || location.equals("B27") || location.equals("b27")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783671, 19.058823)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783671, 19.058823))
                    .title("B27"));
        }
        if (location == "B29" || location.equals("B29") || location.equals("b29")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783636, 19.058904)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783636, 19.058904))
                    .title("B29"));
        }
        if (location == "B31" || location.equals("B31") || location.equals("b31")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783616, 19.058941)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783616, 19.058941))
                    .title("B31"));
        }
        if (location == "B32" || location.equals("B32") || location.equals("b32")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783595, 19.058976)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783595, 19.058976))
                    .title("B32"));
        }
        if (location == "B33" || location.equals("B33") || location.equals("b33")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783574, 19.059010)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783574, 19.059010))
                    .title("B33"));
        }
        if (location == "B34" || location.equals("B34") || location.equals("b34")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783556, 19.059039)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783556, 19.059039))
                    .title("B34"));
        }
        if (location == "B35" || location.equals("B35") || location.equals("b35")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783542, 19.059065)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783542, 19.059065))
                    .title("B35"));
        }
        if (location == "B36" || location.equals("B36") || location.equals("b36")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783524, 19.059100)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783524, 19.059100))
                    .title("B36"));
        }
        if (location == "B37" || location.equals("B37") || location.equals("b37")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783510, 19.059124)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783510, 19.059124))
                    .title("B37"));
        }
        if (location == "B38" || location.equals("B38") || location.equals("b38")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783492, 19.059156)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783492, 19.059156))
                    .title("B38"));
        }
        if (location == "B40" || location.equals("B40") || location.equals("b40")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783462, 19.059203)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783462, 19.059203))
                    .title("B40"));
        }
        if (location == "B41" || location.equals("B41") || location.equals("b41")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783440, 19.059236)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783440, 19.059236))
                    .title("B41"));
        }
        if (location == "B42" || location.equals("B42") || location.equals("b42")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783420, 19.059269)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783420, 19.059269))
                    .title("B42"));
        }
        if (location == "B43" || location.equals("B43") || location.equals("b43")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783392, 19.059309)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783392, 19.059309))
                    .title("B43"));
        }
        if (location == "B44" || location.equals("B44") || location.equals("b44")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(49.783369, 19.059352)));
            floor = 0;
            floor_view = 0;
            floor_choose();
            final EditText ed = (EditText) findViewById(R.id.floor_number);
            ed.setText(new Integer(floor_view).toString());
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(49.783369, 19.059352))
                    .title("B44"));
>>>>>>> test2
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




