package com.example.roya.shawnsportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    //first step:declaring variables
    private EditText Num1, Num2;
    private ImageButton add_B, sub_B, mul_B, div_B;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //second step:finding the variables
        Num1 = findViewById(R.id.first_input);
        Num2 = findViewById(R.id.second_input);
        add_B = findViewById(R.id.add);
        sub_B = findViewById(R.id.subtraction);
        mul_B = findViewById(R.id.multiplication);
        div_B = findViewById(R.id.divider);
        Result = findViewById(R.id.result);

        //third step: set on click listener
        add_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //fourth step: converting the numbers to string
                String num1 = Num1.getText().toString();
                String num2 = Num2.getText().toString();

                //fifth step: converting the strings into doubles
                Double number1 = Double.parseDouble(num1);
                Double number2 = Double.parseDouble(num2);

                //sixth step:doing the addition
                if (view.getId() == R.id.add) {
                    double sum = number1 + number2;
                    Result.setText("Result: " + sum);
                }
            }
        });
        sub_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //fourth step: converting the numbers to string
                String num1 = Num1.getText().toString();
                String num2 = Num2.getText().toString();

                //fifth step: converting the strings into doubles
                Double number1 = Double.parseDouble(num1);
                Double number2 = Double.parseDouble(num2);

                if (view.getId() == R.id.subtraction) {
                    double subtraction = number1 - number2;
                    Result.setText("Result: " + subtraction);
                }
            }
        });
        mul_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //fourth step: converting the numbers to string
                String num1 = Num1.getText().toString();
                String num2 = Num2.getText().toString();

                //fifth step: converting the strings into doubles
                Double number1 = Double.parseDouble(num1);
                Double number2 = Double.parseDouble(num2);

                //eight step:doing the multiplication
                if (view.getId() == R.id.multiplication) {
                    double multiply = number1 * number2;
                    Result.setText("Result: " + multiply);
                }
            }
        });
        div_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //fourth step: converting the numbers to string
                String num1 = Num1.getText().toString();
                String num2 = Num2.getText().toString();

                //fifth step: converting the strings into doubles
                Double number1 = Double.parseDouble(num1);
                Double number2 = Double.parseDouble(num2);

                //ninth step:doing the division part
                if (view.getId() == R.id.divider) {
                    double division = number1 / number2;
                    Result.setText("Result: " + division);
                }
            }
        });
    }
}
