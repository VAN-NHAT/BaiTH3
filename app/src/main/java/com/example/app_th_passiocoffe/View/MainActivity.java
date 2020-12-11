package com.example.app_th_passiocoffe.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.app_th_passiocoffe.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btn_chon_mon;
    ImageView img_chonmon,img_thanhvien;

    private RecyclerView rcv1;
    private Context context;
    private RecycleView_Adapter_home recycleView_adapter;
    FloatingActionButton actionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_thanhvien = (ImageView)findViewById(R.id.img_tichdiem);
        img_thanhvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Thanhvien.class);
                startActivity(intent);
            }
        });


        img_chonmon = (ImageView)findViewById(R.id.img_chon_mon);
        img_chonmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChiTiet.class);
                startActivity(intent);
            }
        });

        actionButton = findViewById(R.id.flt_order_107);
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChonMon.class));
            }
        });




        BottomNavigationView btnview;
        btnview = (BottomNavigationView) findViewById(R.id.Top_ProFile);
        btnview.setSelectedItemId(R.id.menu_profile2);
        btnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.menu_profile1:
                        startActivity(new Intent(getApplicationContext(), Profile.class));
                        overridePendingTransition(0, 0);
                    case R.id.menu_profile2:
                        return true;
                    case R.id.menu_gift:
                        startActivity(new Intent(getApplicationContext(), Login1.class));
                        overridePendingTransition(0, 0);
                    case R.id.menu_map:
                        startActivity(new Intent(getApplicationContext(), Maps_Activity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.menu_thongbao:
                        startActivity(new Intent(getApplicationContext(), ThongBao.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });

        rcv1 = findViewById(R.id.RecyclerView_home);
        rcv1.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context, RecyclerView.VERTICAL, false);
        rcv1.setLayoutManager(linearLayoutManager2);
        recycleView_adapter = new RecycleView_Adapter_home();
        recycleView_adapter.setData(getListMonAn());
        rcv1.setAdapter(recycleView_adapter);


    }
    private List<RecycleView_Sup_Home> getListMonAn() {
        List<RecycleView_Sup_Home> list_MonAn = new ArrayList<>();
        list_MonAn.add(new RecycleView_Sup_Home("THƯỞNG THỨC KEM GELATO NGON CHUẨN TẠI PASIO VỚI GI Á CHỈ 29.000đ",
                    " Đâu cần di Ý để thưởng thức kem Gelato, vì ngay tại Passio 77", R.drawable.ic_home1));
        list_MonAn.add(new RecycleView_Sup_Home("THƯỞNG THỨC KEM GELATO NGON CHUẨN TẠI PASIO VỚI GI Á CHỈ 29.000đ",
                " Đâu cần di Ý để thưởng thức kem Gelato, vì ngay tại Passio 77", R.drawable.ic_passio_address_1));
        list_MonAn.add(new RecycleView_Sup_Home("THƯỞNG THỨC KEM GELATO NGON CHUẨN TẠI PASIO VỚI GI Á CHỈ 29.000đ",
                " Đâu cần di Ý để thưởng thức kem Gelato, vì ngay tại Passio 77", R.drawable.sanpham2));
        list_MonAn.add(new RecycleView_Sup_Home("THƯỞNG THỨC KEM GELATO NGON CHUẨN TẠI PASIO VỚI GI Á CHỈ 29.000đ",
                " Đâu cần di Ý để thưởng thức kem Gelato, vì ngay tại Passio 77", R.drawable.ic_passio_address_1));
        list_MonAn.add(new RecycleView_Sup_Home("THƯỞNG THỨC KEM GELATO NGON CHUẨN TẠI PASIO VỚI GI Á CHỈ 29.000đ",
                " Đâu cần di Ý để thưởng thức kem Gelato, vì ngay tại Passio 77", R.drawable.ic_home1));

        return list_MonAn;
    }
}