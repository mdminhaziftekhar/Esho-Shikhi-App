package com.example.eshoshikhinew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NumbersActivity extends AppCompatActivity {
    LinearLayoutCompat one, two, three, four, five, six, seven, eight, nine, ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        one = findViewById(R.id.oneNumber);
        two = findViewById(R.id.twoNumber);
        three = findViewById(R.id.threeNumber);
        four = findViewById(R.id.fourNumber);
        five = findViewById(R.id.fiveNumber);
        six = findViewById(R.id.sixNumber);
        seven = findViewById(R.id.sevenNumber);
        eight = findViewById(R.id.eightNumber);
        nine = findViewById(R.id.nineNumber);
        ten = findViewById(R.id.tenNumber);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.onevid;
                Intent i = new Intent(NumbersActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.twovid;
                Intent i = new Intent(NumbersActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.threevid;
                Intent i = new Intent(NumbersActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.fourvid;
                Intent i = new Intent(NumbersActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.fivevid;
                Intent i = new Intent(NumbersActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.sixvid;
                Intent i = new Intent(NumbersActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.sevenvid;
                Intent i = new Intent(NumbersActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.eightvid;
                Intent i = new Intent(NumbersActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.ninevid;
                Intent i = new Intent(NumbersActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.tenvid;
                Intent i = new Intent(NumbersActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
    }
}