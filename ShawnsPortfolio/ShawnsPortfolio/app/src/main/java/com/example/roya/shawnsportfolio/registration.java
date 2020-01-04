package com.example.roya.shawnsportfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registration extends AppCompatActivity {
//declaring variables submit;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        //finding the variables
        submit=findViewById(R.id.submit);
        //set on click listener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(registration.this,Registration_Confirmation.class);
                startActivity(intent);
            }
        });

    }
}
