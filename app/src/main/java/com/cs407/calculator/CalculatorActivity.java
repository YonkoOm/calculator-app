package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);
        textview = findViewById(R.id.textView);
        Intent intent = getIntent();
        float finalValue = intent.getFloatExtra("finalValue", 0);
        String str = "The Final Value is: " + finalValue;
        textview.setText(str);
    }
}