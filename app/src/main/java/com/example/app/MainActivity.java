package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText,editText1;
    Button add,sub,div,mul;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.usertext);
        editText1 = findViewById(R.id.usertext1);
        add = findViewById(R.id.button);
        sub= findViewById(R.id.button1);
        div= findViewById(R.id.button3);
        mul= findViewById(R.id.button2);
        result = findViewById(R.id.result);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);



//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String text = editText.getText().toString();
//                String text1 = editText1.getText().toString();
//                int a= Integer.parseInt(text);
//                int b= Integer.parseInt(text1);
//                int c = a + b;
//                result.setText(String.valueOf(c));
//
//            }
//        });
//        sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String text = editText.getText().toString();
//                String text1 = editText1.getText().toString();
//                int a= Integer.parseInt(text);
//                int b= Integer.parseInt(text1);
//                int c = a - b;
//                result.setText(String.valueOf(c));
//
//            }
//        });
//        mul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String text = editText.getText().toString();
//                String text1 = editText1.getText().toString();
//                int a= Integer.parseInt(text);
//                int b= Integer.parseInt(text1);
//                int c = a * b;
//                result.setText(String.valueOf(c));
//
//            }
//        });
//        div.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String text = editText.getText().toString();
//                String text1 = editText1.getText().toString();
//                int a= Integer.parseInt(text);
//                int b= Integer.parseInt(text1);
//                int c = a /  b;
//                result.setText(String.valueOf(c));
//
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button)
        {
            String text = editText.getText().toString();
            String text1 = editText1.getText().toString();
            int a= Integer.parseInt(text);
            int b= Integer.parseInt(text1);
            int c = a + b;
            result.setText(String.valueOf(c));
        }
        else if(view.getId() == R.id.button1)
        {
            String text = editText.getText().toString();
            String text1 = editText1.getText().toString();
            int a= Integer.parseInt(text);
            int b= Integer.parseInt(text1);
            int c = a - b;
            result.setText(String.valueOf(c));
        }
        else if(view.getId() == R.id.button2)
        {
            String text = editText.getText().toString();
            String text1 = editText1.getText().toString();
            int a= Integer.parseInt(text);
            int b= Integer.parseInt(text1);
            int c = a * b;
            result.setText(String.valueOf(c));
        }
        else if(view.getId() == R.id.button3)
        {
            String text = editText.getText().toString();
            String text1 = editText1.getText().toString();
            int a= Integer.parseInt(text);
            int b= Integer.parseInt(text1);
            int c = a / b;
            result.setText(String.valueOf(c));
        }
    }
}