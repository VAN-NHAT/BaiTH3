package com.example.app_th_passiocoffe.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app_th_passiocoffe.R;

public class Login4 extends AppCompatActivity {
Button btn_luu_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login4);

        btn_luu_4=(Button)findViewById(R.id.bt_luu_4);
        btn_luu_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Login4.this, MainActivity.class);
                startActivity(Dis2);
            }
        });
    }
}
