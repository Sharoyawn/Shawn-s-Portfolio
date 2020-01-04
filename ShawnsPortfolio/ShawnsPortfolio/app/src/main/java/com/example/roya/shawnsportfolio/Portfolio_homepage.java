package com.example.roya.shawnsportfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Portfolio_homepage extends AppCompatActivity {
    //declaring variables
    private ImageButton myself;
    private ImageButton education;
    private ImageButton skills;
    private ImageButton projects;
    private ImageButton family;
    private ImageButton contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_homepage);
        //finding the image id
        myself=findViewById(R.id.myself_icon);
        education=findViewById(R.id.education_icon);
        skills=findViewById(R.id.skills_icon);
        projects=findViewById(R.id.projects_icon);
        family=findViewById(R.id.family_icon);
        contacts=findViewById(R.id.contacts_icon);
        //set on click listener for myself Img.button
        myself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portfolio_homepage.this,myself.class);
                startActivity(intent);
            }
        });
        //set on click listener for education img.button
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portfolio_homepage.this,education.class);
                startActivity(intent);
            }
        });
        //set on click listener for skills img.button
        skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portfolio_homepage.this,skills.class);
                startActivity(intent);
            }
        });
        //set on click listener for projects img.button
        projects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portfolio_homepage.this, com.example.roya.shawnsportfolio.projects.class);
                startActivity(intent);
            }
        });
        //set on click listener for family img.button
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portfolio_homepage.this,family.class);
                startActivity(intent);
            }
        });
        //set on click listener for contacts img.button
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portfolio_homepage.this,contacts.class);
                startActivity(intent);
            }
        });

    }
}

