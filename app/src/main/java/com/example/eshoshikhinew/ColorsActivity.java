package com.example.eshoshikhinew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ColorsActivity extends AppCompatActivity {
    LinearLayoutCompat red, green, blue, yellow, orange, black, purple, brown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        red = findViewById(R.id.redColour);
        green = findViewById(R.id.greenColour);
        blue = findViewById(R.id.blueColour);
        yellow = findViewById(R.id.yellowColour);
        orange = findViewById(R.id.orangeColour);
        black = findViewById(R.id.blackColour);
        purple = findViewById(R.id.purpleColour);
        brown = findViewById(R.id.brownColour);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.redcolorvid;
                Intent i = new Intent(ColorsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.greencolorvid;
                Intent i = new Intent(ColorsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.bluecolorvid;
                Intent i = new Intent(ColorsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.yellowcolorvid;
                Intent i = new Intent(ColorsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.orangecolorvid;
                Intent i = new Intent(ColorsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.blackcolorvid;
                Intent i = new Intent(ColorsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.purplecolorvid;
                Intent i = new Intent(ColorsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.browncolorvid;
                Intent i = new Intent(ColorsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
    }
}