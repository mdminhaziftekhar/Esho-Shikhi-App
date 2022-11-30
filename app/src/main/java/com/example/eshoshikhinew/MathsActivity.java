package com.example.eshoshikhinew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MathsActivity extends AppCompatActivity {

    CardView add, mul, div, sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);

        add = findViewById(R.id.additionButton);
        mul = findViewById(R.id.multiplicationButton);
        div = findViewById(R.id.divisionButton);
        sub = findViewById(R.id.substractionButton);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MathsActivity.this, PlusActivity.class));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MathsActivity.this, MulActivity.class));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MathsActivity.this, MinusActivity.class));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MathsActivity.this, DivActivity.class));
            }
        });

    }
}