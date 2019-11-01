package com.example.map;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.model.Marker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void drawMapLine(View v){
        Intent intent = new Intent(this, mapLine.class);
        startActivity(intent);

    }



}
