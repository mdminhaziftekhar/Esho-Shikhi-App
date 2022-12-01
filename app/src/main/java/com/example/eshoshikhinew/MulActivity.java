package com.example.eshoshikhinew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MulActivity extends AppCompatActivity {
    Button button4, button8, button50, button3, button20;
    EditText text4, text8, text50, text3, text20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul);

        button8 = findViewById(R.id.ans8button);
        button3 = findViewById(R.id.ans3button);
        button4 = findViewById(R.id.ans4button);
        button50 = findViewById(R.id.ans50button);
        button20 = findViewById(R.id.ans20button);
        text8 = findViewById(R.id.ans8text);
        text3 = findViewById(R.id.ans3text);
        text4 = findViewById(R.id.ans4text);
        text20 = findViewById(R.id.ans20text);
        text50 = findViewById(R.id.ans50text);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(text8.getText().toString());

                if (i == 8){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctnew;
                    Intent intent = new Intent(MulActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongnew;
                    Intent intent = new Intent(MulActivity.this, VideoActivity.class);
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
                    Intent intent = new Intent(MulActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongnew;
                    Intent intent = new Intent(MulActivity.this, VideoActivity.class);
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
                    Intent intent = new Intent(MulActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongnew;
                    Intent intent = new Intent(MulActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int i = Integer.parseInt(text20.getText().toString());

                if(i == 20){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctnew;
                    Intent intent = new Intent(MulActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongnew;
                    Intent intent = new Intent(MulActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int i = Integer.parseInt(text50.getText().toString());

                if(i == 50){
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.correctnew;
                    Intent intent = new Intent(MulActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }
                else{
                    String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.wrongnew;
                    Intent intent = new Intent(MulActivity.this, VideoActivity.class);
                    intent.putExtra("vid", videoPath);
                    startActivity(intent);
                }

            }
        });
    }
}