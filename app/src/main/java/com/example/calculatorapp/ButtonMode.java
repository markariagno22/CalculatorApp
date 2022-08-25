package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ButtonMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_mode);
    }

    public void addNumber0(View view){
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setText(resultTV.getText() + "0");
    }

    public void addNumber1(View view){
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setText(resultTV.getText() + "1");
    }

    public void addNumber2(View view){
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setText(resultTV.getText() + "2");
    }

    public void addNumber3(View view){
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setText(resultTV.getText() + "3");
    }

    public void addNumber4(View view){
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setText(resultTV.getText() + "4");
    }

    public void addNumber5(View view){
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setText(resultTV.getText() + "5");
    }

    public void addNumber6(View view){
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setText(resultTV.getText() + "6");
    }

    public void addNumber7(View view){
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setText(resultTV.getText() + "7");
    }

    public void addNumber8(View view){
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setText(resultTV.getText() + "8");
    }

    public void addNumber9(View view){
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setText(resultTV.getText() + "9");
    }



}