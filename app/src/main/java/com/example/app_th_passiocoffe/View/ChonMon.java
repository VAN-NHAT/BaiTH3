package com.example.app_th_passiocoffe.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.app_th_passiocoffe.R;
import com.google.android.material.tabs.TabLayout;

public class ChonMon extends AppCompatActivity {
ImageView img_backHome_6;
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chonmon);

        img_backHome_6= (ImageView)findViewById(R.id.img_back_home_6);
        img_backHome_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChonMon.this, MainActivity.class);
                startActivity(intent);
            }
        });

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new Fragment_ChonMon(getSupportFragmentManager()));

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);



    }
}
