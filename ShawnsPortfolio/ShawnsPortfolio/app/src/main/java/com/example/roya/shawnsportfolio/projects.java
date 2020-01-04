package com.example.roya.shawnsportfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class projects extends AppCompatActivity {
    //declaring variables
    private Button calculator;
    private Button registration;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        //finding the variables
        calculator = findViewById(R.id.calculator);
        registration = findViewById(R.id.Registration_Form);
        login=findViewById(R.id.log_button);
        //set on click listener
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(projects.this, calculator.class);
                startActivity(intent);
            }
        });
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(projects.this, registration.class);
                startActivity(intent1);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(projects.this, com.example.roya.shawnsportfolio.login.class);
                startActivity(intent);
            }
        });
    }
}