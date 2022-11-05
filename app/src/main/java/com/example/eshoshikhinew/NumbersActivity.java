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
                startActivity(new Intent(NumbersActivity.this, VideoActivity.class));
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumbersActivity.this, VideoActivity.class));
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumbersActivity.this, VideoActivity.class));
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumbersActivity.this, VideoActivity.class));
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumbersActivity.this, VideoActivity.class));
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumbersActivity.this, VideoActivity.class));
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumbersActivity.this, VideoActivity.class));
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumbersActivity.this, VideoActivity.class));
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumbersActivity.this, VideoActivity.class));
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumbersActivity.this, VideoActivity.class));
            }
        });
    }
}