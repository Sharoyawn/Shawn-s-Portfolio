package com.example.roya.shawnsportfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Home extends AppCompatActivity {
    //declaring variables
    private Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__home);
        //finding the variables
        logout=findViewById(R.id.Logout);
        //set on click listener
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login_Home.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}