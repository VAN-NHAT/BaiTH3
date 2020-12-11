package com.example.app_th_passiocoffe.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_th_passiocoffe.R;

public class GioHang extends AppCompatActivity {
   ImageView img_back_chonMON;
   Button btn_gioHang2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giohang);


        img_back_chonMON= (ImageView)findViewById(R.id.img_back_chonMon1);
        img_back_chonMON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GioHang.this, ChonMon.class);
                startActivity(intent);
            }
        });
        btn_gioHang2=(Button)findViewById(R.id.bt_datHang);
        btn_gioHang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(GioHang.this, ChonMon.class);
                startActivity(Dis2);
            }
        });
    }
}