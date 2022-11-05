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
                startActivity(new Intent(ColorsActivity.this, VideoActivity.class));
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ColorsActivity.this, VideoActivity.class));
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ColorsActivity.this, VideoActivity.class));
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ColorsActivity.this, VideoActivity.class));
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ColorsActivity.this, VideoActivity.class));
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ColorsActivity.this, VideoActivity.class));
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ColorsActivity.this, VideoActivity.class));
            }
        });
        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ColorsActivity.this, VideoActivity.class));
            }
        });
    }
}