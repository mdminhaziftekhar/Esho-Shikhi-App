package com.example.eshoshikhinew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FruitsActivity extends AppCompatActivity {

    LinearLayoutCompat banana, mango, pineapple, peach, melon, orange, kiwi, avocado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        banana = findViewById(R.id.bananaFruit);
        mango = findViewById(R.id.mangoFruit);
        pineapple = findViewById(R.id.pineappleFruit);
        peach = findViewById(R.id.peachFruit);
        melon = findViewById(R.id.MelonFruit);
        orange = findViewById(R.id.OrangeFruit);
        kiwi = findViewById(R.id.KiwiFruit);
        avocado = findViewById(R.id.avocadoFruit);

        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.bananavid;
                Intent i = new Intent(FruitsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.mangovid;
                Intent i = new Intent(FruitsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        pineapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsActivity.this, VideoActivity.class));
            }
        });
        peach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsActivity.this, VideoActivity.class));
            }
        });
        melon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsActivity.this, VideoActivity.class));
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.orangevid;
                Intent i = new Intent(FruitsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        kiwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.kiwivid;
                Intent i = new Intent(FruitsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
        avocado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FruitsActivity.this, VideoActivity.class));
            }
        });
    }
}