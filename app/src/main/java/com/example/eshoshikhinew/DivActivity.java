package com.example.eshoshikhinew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DivActivity extends AppCompatActivity {

    Button button1, button4, button2, button3, button5;
    EditText text1, text4, text2, text3, text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);

        button1 = findViewById(R.id.ans1button);
        button3 = findViewById(R.id.ans3button);
        button4 = findViewById(R.id.ans4button);
        button5 = findViewById(R.id.ans5button);
        button2 = findViewById(R.id.ans2button);
        text1 = findViewById(R.id.ans1text);
        text3 = findViewById(R.id.ans3text);
        text4 = findViewById(R.id.ans4text);
        text2 = findViewById(R.id.ans2text);
        text5 = findViewById(R.id.ans5text);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(text1.getText().toString());

                if (i == 1){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctnew;
                    Intent intent = new Intent(DivActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongnew;
                    Intent intent = new Intent(DivActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i = Integer.parseInt(text3.getText().toString());

                if(i == 3){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctnew;
                    Intent intent = new Intent(DivActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongnew;
                    Intent intent = new Intent(DivActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i = Integer.parseInt(text4.getText().toString());

                if(i == 4){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctnew;
                    Intent intent = new Intent(DivActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongnew;
                    Intent intent = new Intent(DivActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int i = Integer.parseInt(text2.getText().toString());

                if(i == 2){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctnew;
                    Intent intent = new Intent(DivActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongnew;
                    Intent intent = new Intent(DivActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int i = Integer.parseInt(text5.getText().toString());

                if(i == 5){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctnew;
                    Intent intent = new Intent(DivActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongnew;
                    Intent intent = new Intent(DivActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });
    }
}