package com.example.app_th_passiocoffe.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_th_passiocoffe.R;


public class Loading extends AppCompatActivity  {
    private static int SPLASH_SCREEN = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Loading.this, Login1.class);
                startActivity(intent);
            }
        }, SPLASH_SCREEN);

        overridePendingTransition(R.anim.trai_sang_phai,R.anim.phai_sang_trai);
    }

}