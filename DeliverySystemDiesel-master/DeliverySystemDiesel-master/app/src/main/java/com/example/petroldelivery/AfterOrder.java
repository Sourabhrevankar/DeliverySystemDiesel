package com.example.petroldelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;

public class AfterOrder extends AppCompatActivity {

    LottieAnimationView lottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_order);

        lottie = findViewById(R.id.lottie);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),Homepage.class);
                startActivity(i);
            }
        },5000);
    }
}