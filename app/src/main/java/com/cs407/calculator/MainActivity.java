package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public float[] getNumbers() {
       EditText firstNumber = findViewById(R.id.firstNumber);
       EditText secondNumber = findViewById(R.id.secondNumber);
       float first = Float.parseFloat(firstNumber.getText().toString());
       float second = Float.parseFloat(secondNumber.getText().toString());
       return new float[] {first, second};
   }
    public void add(View view) {
        float[] nums = getNumbers();
        float sum = nums[0] + nums[1];
        goToActivity(sum);
    }

    public void subtract(View view) {
        float[] nums = getNumbers();
        float sub = nums[0] - nums[1];
        goToActivity(sub);
    }
    public void multiply(View view) {
        float[] nums = getNumbers();
        float product = nums[0] * nums[1];
        goToActivity(product);
    }
    public void divide(View view) {
        float[] nums = getNumbers();
        if (nums[1] == 0) {
            Toast.makeText(this, "Cannot divide by zero, put a different number", Toast.LENGTH_LONG).show();
            return;
        }
        float quotient = nums[0] / nums[1];
        goToActivity(quotient);
    }


    public void goToActivity(float finalValue) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("finalValue", finalValue);
        startActivity(intent);
    }
}