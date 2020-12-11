package com.example.app_th_passiocoffe.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_th_passiocoffe.R;

public class Thanhvien extends AppCompatActivity {
    ImageView img_backHome_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thanhvien);

        img_backHome_1 = (ImageView)findViewById(R.id.img_back_home_1);
        img_backHome_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thanhvien.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}