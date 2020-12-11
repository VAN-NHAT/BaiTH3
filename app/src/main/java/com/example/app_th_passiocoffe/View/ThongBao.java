package com.example.app_th_passiocoffe.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_th_passiocoffe.R;

public class ThongBao extends AppCompatActivity {
ImageView img_backHome_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongbao);
        img_backHome_2= (ImageView)findViewById(R.id.img_back_home_2);
        img_backHome_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThongBao.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}