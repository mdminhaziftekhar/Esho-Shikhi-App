package com.example.eshoshikhinew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MinusActivity extends AppCompatActivity {

    Button button0, button3, button6, button7, button4;
    EditText text0, text3, text6, text7, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minus);

        button0 = findViewById(R.id.ans0button);
        button3 = findViewById(R.id.ans3button);
        button4 = findViewById(R.id.ans4button);
        button6 = findViewById(R.id.ans6button);
        button7 = findViewById(R.id.ans7button);
        text0 = findViewById(R.id.ans0text);
        text3 = findViewById(R.id.ans3text);
        text4 = findViewById(R.id.ans4text);
        text6 = findViewById(R.id.ans6text);
        text7 = findViewById(R.id.ans7text);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(text0.getText().toString());

                if (i == 0){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctvid;
                    Intent intent = new Intent(MinusActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongvid;
                    Intent intent = new Intent(MinusActivity.this, VideoActivity.class);
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
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctvid;
                    Intent intent = new Intent(MinusActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongvid;
                    Intent intent = new Intent(MinusActivity.this, VideoActivity.class);
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
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctvid;
                    Intent intent = new Intent(MinusActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongvid;
                    Intent intent = new Intent(MinusActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int i = Integer.parseInt(text6.getText().toString());

                if(i == 6){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctvid;
                    Intent intent = new Intent(MinusActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongvid;
                    Intent intent = new Intent(MinusActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int i = Integer.parseInt(text7.getText().toString());

                if(i == 7){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctvid;
                    Intent intent = new Intent(MinusActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongvid;
                    Intent intent = new Intent(MinusActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });

    }
}