package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    RadioButton radioButton1, radioButton2, radioButton3;
    ImageView imageView;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        radioButton1 = findViewById(R.id.btnBird);
        radioButton2 = findViewById(R.id.btnTiger);
        radioButton3 = findViewById(R.id.btnSnake);
        imageView = findViewById(R.id.ivShowing);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnBird:
                imageView.setImageResource(R.drawable.bird);
                break;
            case R.id.btnTiger:
                imageView.setImageResource(R.drawable.tiger);
                break;

            case R.id.btnSnake:
                imageView.setImageResource(R.drawable.snake);
                break;
        }
    }
}

