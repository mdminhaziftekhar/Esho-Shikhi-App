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
                startActivity(new Intent(VegitablesActivity.this, VideoActivity.class));
            }
        });

        pumpkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VegitablesActivity.this, VideoActivity.class));
            }
        });

        tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VegitablesActivity.this, VideoActivity.class));
            }
        });

        pepper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VegitablesActivity.this, VideoActivity.class));
            }
        });
        eggplant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VegitablesActivity.this, VideoActivity.class));
            }
        });
        spinach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VegitablesActivity.this, VideoActivity.class));
            }
        });
    }
}