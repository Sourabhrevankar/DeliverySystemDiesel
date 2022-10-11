package com.example.petroldelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity {
    public Button OrderButton,AboutUsButton,ContactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        OrderButton = (Button) findViewById(R.id.orderButton);
        OrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        ContactButton = (Button) findViewById(R.id.contactButton);
        ContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this,Contact.class);
                startActivity(intent);
            }
        });

        AboutUsButton = (Button) findViewById(R.id.aboutusButton);
        AboutUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this,AboutUs.class);
                startActivity(intent);
            }
        });


    }
}