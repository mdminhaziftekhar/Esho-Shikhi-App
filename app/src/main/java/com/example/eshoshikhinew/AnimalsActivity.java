package com.example.eshoshikhinew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnimalsActivity extends AppCompatActivity {
    LinearLayoutCompat tiger, penguin, zebra, hen, elephant, snake, cow, goat, rabbit, cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        tiger = findViewById(R.id.tigerAnimal);
        penguin = findViewById(R.id.penguinAnimal);
        zebra = findViewById(R.id.zebraAnimal);
        hen = findViewById(R.id.HenAnimal);
        elephant = findViewById(R.id.elephantAnimal);
        snake = findViewById(R.id.snakeAnimal);
        cow = findViewById(R.id.cowAnimal);
        goat = findViewById(R.id.goatAnimal);
        rabbit = findViewById(R.id.rabbitAnimal);
        cat = findViewById(R.id.catAnimal);

        tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.tigervid;
                Intent i = new Intent(AnimalsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        penguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.penguinvid;
                Intent i = new Intent(AnimalsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.zebravid;
                Intent i = new Intent(AnimalsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        hen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.henvid;
                Intent i = new Intent(AnimalsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.elephantvid;
                Intent i = new Intent(AnimalsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.snakevid;
                Intent i = new Intent(AnimalsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.cowvid;
                Intent i = new Intent(AnimalsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        goat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.goatvid;
                Intent i = new Intent(AnimalsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.rabbitvid;
                Intent i = new Intent(AnimalsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.catvid;
                Intent i = new Intent(AnimalsActivity.this, VideoActivity.class);
                i.putExtra("vid", videoPath);
                startActivity(i);
            }
        });
    }
}