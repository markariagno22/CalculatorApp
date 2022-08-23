package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void invertColors(View view){

    }

    public void findSum(View view){
        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(num1ET.getText().toString());
        int num2 = Integer.parseInt(num2ET.getText().toString());
        int sum = num1 + num2;

        resultTV.setText("" + sum);

    }

    public void findDifference(View view){
        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(num1ET.getText().toString());
        int num2 = Integer.parseInt(num2ET.getText().toString());
        int difference = num1 - num2;

        resultTV.setText("" + difference);
    }

    public void findProduct(View view){
        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(num1ET.getText().toString());
        int num2 = Integer.parseInt(num2ET.getText().toString());
        int product = num1 * num2;

        resultTV.setText("" + product);
    }

    public void findDivision(View view){
        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(num1ET.getText().toString());
        int num2 = Integer.parseInt(num2ET.getText().toString());
        int div = num1 / num2;

        resultTV.setText("" + div);
    }

    public void findSquare(View view){
        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(num1ET.getText().toString());
        int num2 = Integer.parseInt(num2ET.getText().toString());
        int square = (int) (Math.pow((double)(num1), (double)(num2)));

        resultTV.setText("" + square);
        
    }


}