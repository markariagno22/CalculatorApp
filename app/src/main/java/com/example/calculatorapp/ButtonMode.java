package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ButtonMode extends AppCompatActivity {

    final int ADD = 0;
    final int SUBTRACT = 1;
    final int MULTIPLY = 2;
    final int DIVIDE = 3;

    int num1 = 0;
    int operation = -1;
    boolean equalsPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_mode);
    }

    public void switchScreens(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clear(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);

        num1 = 0;
        resultTV.setText("");
        resultTV.setHint("Enter an Integer");

    }

    public void switchSigns(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(!resultTV.getText().equals("") && !resultTV.getText().equals(0)) {
            resultTV.setText("" + (-1) * Integer.parseInt(resultTV.getText().toString()));
        }
    }

    public void add(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setHint("Select an Integer");
        try{
            num1 = Integer.parseInt(resultTV.getText().toString());
            resultTV.setText("");
            operation = ADD;
        } catch (Exception e){
            resultTV.setText("");
            resultTV.setHint("Try Again");
        }
    }

    public void subtract(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setHint("Select an Integer");
        try{
            num1 = Integer.parseInt(resultTV.getText().toString());
            resultTV.setText("");
            operation = SUBTRACT;
        } catch (Exception e){
            resultTV.setText("");
            resultTV.setHint("Try Again");
        }
    }

    public void multiply(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setHint("Select an Integer");
        try{
            num1 = Integer.parseInt(resultTV.getText().toString());
            resultTV.setText("");
            operation = MULTIPLY;
        } catch (Exception e){
            resultTV.setText("");
            resultTV.setHint("Try Again");
        }
    }

    public void divide(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        resultTV.setHint("Select an Integer");
        try{
            num1 = Integer.parseInt(resultTV.getText().toString());
            resultTV.setText("");
            operation = DIVIDE;
        } catch (Exception e){
            resultTV.setText("");
            resultTV.setHint("Try Again");
        }
    }

    public void equals(View view){
        TextView resultTV = findViewById(R.id.resultTVB);

        try {
            if(!equalsPressed){
                int num2 = Integer.parseInt(resultTV.getText().toString());
                int total = 0;
                if (operation == ADD) {
                    total = num1 + num2;
                } else if (operation == SUBTRACT) {
                    total = num1 - num2;
                } else if (operation == MULTIPLY) {
                    total = num1 * num2;
                } else if (operation == DIVIDE) {
                    total = num1 / num2;
                }

                resultTV.setText("" + total);
                equalsPressed = true;
            }

        } catch (Exception e){
            resultTV.setHint("Enter an Integer");
        }
    }




    public void addNumber0(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(!resultTV.getText().equals("0")){
            resultTV.setText(resultTV.getText() + "0");
        }
    }

    public void addNumber1(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(resultTV.getText().equals("0")) {
            resultTV.setText("");
        }
        resultTV.setText(resultTV.getText() + "1");
    }

    public void addNumber2(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(resultTV.getText().equals("0")) {
            resultTV.setText("");
        }
        resultTV.setText(resultTV.getText() + "2");
    }

    public void addNumber3(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(resultTV.getText().equals("0")) {
            resultTV.setText("");
        }
        resultTV.setText(resultTV.getText() + "3");
    }

    public void addNumber4(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(resultTV.getText().equals("0")) {
            resultTV.setText("");
        }
        resultTV.setText(resultTV.getText() + "4");
    }

    public void addNumber5(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(resultTV.getText().equals("0")) {
            resultTV.setText("");
        }
        resultTV.setText(resultTV.getText() + "5");
    }

    public void addNumber6(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(resultTV.getText().equals("0")) {
            resultTV.setText("");
        }
        resultTV.setText(resultTV.getText() + "6");
    }

    public void addNumber7(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(resultTV.getText().equals("0")) {
            resultTV.setText("");
        }
        resultTV.setText(resultTV.getText() + "7");
    }

    public void addNumber8(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(resultTV.getText().equals("0")) {
            resultTV.setText("");
        }
        resultTV.setText(resultTV.getText() + "8");
    }

    public void addNumber9(View view){
        equalsPressed = false;
        TextView resultTV = findViewById(R.id.resultTVB);
        if(resultTV.getText().equals("0")) {
            resultTV.setText("");
        }
        resultTV.setText(resultTV.getText() + "9");
    }



}