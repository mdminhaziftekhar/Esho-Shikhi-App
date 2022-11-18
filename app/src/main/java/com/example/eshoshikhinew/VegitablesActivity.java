package com.example.eshoshikhinew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VegitablesActivity extends AppCompatActivity {

    LinearLayoutCompat cucumber, pumpkin, tomato, pepper, eggplant, spinach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegitables);

        cucumber = (LinearLayoutCompat) findViewById(R.id.cucumberVegi);
        pumpkin = (LinearLayoutCompat) findViewById(R.id.pumpkinVegi);
        tomato = (LinearLayoutCompat) findViewById(R.id.tomatoVegi);
        pepper = (LinearLayoutCompat) findViewById(R.id.PepperVegi);
        eggplant = (LinearLayoutCompat) findViewById(R.id.eggplantVegi);
        spinach = (LinearLayoutCompat) findViewById(R.id.spinachVegi);

        cucumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cucumbervid;
                Intent i = new Intent(VegitablesActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        pumpkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.pumpkinvid;
                Intent i = new Intent(VegitablesActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.tomatovid;
                Intent i = new Intent(VegitablesActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        pepper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.chillivid;
                Intent i = new Intent(VegitablesActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        eggplant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.eggplantvid;
                Intent i = new Intent(VegitablesActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        spinach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.spinachvid;
                Intent i = new Intent(VegitablesActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
    }
}