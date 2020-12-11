package com.example.app_th_passiocoffe.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_th_passiocoffe.R;

import java.util.ArrayList;

public class Profile extends AppCompatActivity {
    GridView gridView;
    ArrayList<Sup_Profile> arrayList;
    Adapter_Profile adapter;
    ImageView img_backHome_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        img_backHome_3= (ImageView)findViewById(R.id.img_back_home_3);
        img_backHome_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
            }
        });


        gridView =(GridView) findViewById(R.id.grw_profile);
        arrayList=new ArrayList<>();

        arrayList.add(new Sup_Profile( R.drawable.ic_profile2,"Thông tin cá nhân"));
        arrayList.add(new Sup_Profile( R.drawable.ic_shipping_address,"Địa chỉ giao hàng"));
        arrayList.add(new Sup_Profile( R.drawable.ic_coupon,"Coupon của tôi"));
        arrayList.add(new Sup_Profile( R.drawable.ic_order_history,"Lịch sử đặt hàng"));
        arrayList.add(new Sup_Profile( R.drawable.ic_about,"Thông tin về chúng tôi"));
        arrayList.add(new Sup_Profile( R.drawable.ic_telephone_grey,"Liên hệ"));
        arrayList.add(new Sup_Profile( R.drawable.ic_document,"Điều khoản sử dụng"));
        adapter =new Adapter_Profile(this,R.layout.sup_profile,arrayList);
        gridView.setAdapter(adapter);

    }
}
