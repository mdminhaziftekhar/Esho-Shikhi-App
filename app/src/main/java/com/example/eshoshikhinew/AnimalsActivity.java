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
                startActivity(new Intent(AnimalsActivity.this, VideoActivity.class));
            }
        });

        penguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalsActivity.this, VideoActivity.class));
            }
        });

        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalsActivity.this, VideoActivity.class));
            }
        });

        hen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalsActivity.this, VideoActivity.class));
            }
        });

        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalsActivity.this, VideoActivity.class));
            }
        });

        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalsActivity.this, VideoActivity.class));
            }
        });

        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalsActivity.this, VideoActivity.class));
            }
        });

        goat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalsActivity.this, VideoActivity.class));
            }
        });

        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalsActivity.this, VideoActivity.class));
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalsActivity.this, VideoActivity.class));
            }
        });
    }
}