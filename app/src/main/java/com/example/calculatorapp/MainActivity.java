package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchScreens(View view){
        Intent intent = new Intent(this, ButtonMode.class);
        startActivity(intent);
    }


    public void findSum(View view){
        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        try{

            int num1 = Integer.parseInt(num1ET.getText().toString());
            int num2 = Integer.parseInt(num2ET.getText().toString());
            int sum = num1 + num2;

            resultTV.setText("" + sum);

        } catch(Exception e){
            resultTV.setText("Please input 2 integers");
        }

    }

    public void findDifference(View view){
        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        try{

            int num1 = Integer.parseInt(num1ET.getText().toString());
            int num2 = Integer.parseInt(num2ET.getText().toString());
            int dif = num1 - num2;

            resultTV.setText("" + dif);

        } catch(Exception e){
            resultTV.setText("Please input 2 integers");
        }
    }

    public void findProduct(View view){
        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        try{

            int num1 = Integer.parseInt(num1ET.getText().toString());
            int num2 = Integer.parseInt(num2ET.getText().toString());
            int product = num1 * num2;

            resultTV.setText("" + product);

        } catch(Exception e){
            resultTV.setText("Please input 2 integers");
        }
    }

    public void findDivision(View view){

        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        try{

            int num1 = Integer.parseInt(num1ET.getText().toString());
            int num2 = Integer.parseInt(num2ET.getText().toString());
            int div = num1 / num2;

            resultTV.setText("" + div);

        } catch(Exception e){
            resultTV.setText("Please input 2 integers");
        }

    }

    public void findSquare(View view){

        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        try{

            int num1 = Integer.parseInt(num1ET.getText().toString());
            int num2 = Integer.parseInt(num2ET.getText().toString());
            int square = (int) (Math.pow((double)(num1), (double)(num2)));

            resultTV.setText("" + square);

        } catch(Exception e){
            resultTV.setText("Please input 2 integers");
        }

    }

    /*
    ************************** ADD COMMENT FOR SOURCE HERE ******************************
     */
    public void findFactorial(View view){
        EditText num1ET = findViewById(R.id.num1ET);
        EditText num2ET = findViewById(R.id.num2ET);
        TextView resultTV = findViewById(R.id.resultTV);

        try{
            int num = Integer.parseInt(num1ET.getText().toString());
            num2ET.setText("");

            if (num < 21){
                long fact = 1;
                for (int i = 2; i <= num; i++) {
                    fact = fact * i;
                }
                resultTV.setText("" + fact);
            }else{
                resultTV.setText("Choose an integer under 21");
            }

        } catch(Exception e){
            resultTV.setText("Enter a valid integer");
        }

    }


}