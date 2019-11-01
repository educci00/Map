package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import android.os.Bundle;

import java.util.Map;


public class mapLine extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap nMap ;
    //public static final LatLng ROKUBUN = new LatLng(41.4025209,2.194333);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_line);
        //instance SupportMapFragment
        SupportMapFragment mSupportMapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mSupportMapFragment.getMapAsync((OnMapReadyCallback) this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        nMap = googleMap;

        setMarkers(Positions.ROKUBUN, "Rokubun","Accurate & Scalable Navigation Solutions");

        nMap.moveCamera(CameraUpdateFactory.newLatLng(Positions.ROKUBUN));
        drawLines(Positions.polyline);
        //nMap.addMarker(new MarkerOptions().position(ROKUBUN).title("Marker"));

    }

    private void setMarkers(LatLng position, String title, String info){
        Marker myMarker = nMap.addMarker(new MarkerOptions()
                .position(position)
                .title(title)
                .snippet(info));

    }
    private void drawLines(PolylineOptions options){
        Polyline polyline = nMap.addPolyline(options);
    }

}
