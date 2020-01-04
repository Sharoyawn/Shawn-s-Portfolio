package com.example.roya.shawnsportfolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    //declaring the variables
    private ImageView clickable_image_toast;
    private Button my_portfolio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //finding the variables by the id
        clickable_image_toast=findViewById(R.id.Clickable_Image_Toast);
        my_portfolio=findViewById(R.id.my_portfolio);
        //setting on click listener for toast image
        clickable_image_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId()==R.id.Clickable_Image_Toast)//checking if the id of the image is equal to id of getId method of the view on click listener
                {
                    Toast.makeText(MainActivity.this, "Hello,I'm SHAWN! What's Up", Toast.LENGTH_LONG).show();//making toast for showing the text and making it long
                }
            }
        });
        //setting on click listener for my_portfolio button
        my_portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setting the intent for going to my portfolio homepage
                Intent intent=new Intent(MainActivity.this,Portfolio_homepage.class);
                startActivity(intent);
            }
        });
    }



}
