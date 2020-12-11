package com.example.app_th_passiocoffe.View;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.app_th_passiocoffe.R;

import java.util.ArrayList;


public class ChonMon_1 extends Fragment {

    GridView gridView1;
    ArrayList<Sup_ChonMon> arrayList1;
    Adapter_ChonMon adapter1;
    Context context;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.chonmon_1, container, false);



        gridView1 = view.findViewById(R.id.gridview_frgm_1);
        arrayList1 = new ArrayList<>();

        homeData();
        context = this.getActivity();
        adapter1 = new Adapter_ChonMon(arrayList1,context);
        gridView1.setAdapter(adapter1);
        adapter1 =new Adapter_ChonMon(getActivity(),R.layout.sup_chonmon,arrayList1);
        gridView1.setAdapter(adapter1);
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    Intent i = new Intent(getActivity(), DatHang.class);
//                    startActivity(i);
                DialogLogin();
            }
        });

        return  view;

    }
    public void homeData(){
        arrayList1.add(new Sup_ChonMon( "Trà sữa Đặc biệt","55.000",R.drawable.chgb_1));
        arrayList1.add(new Sup_ChonMon( "Trà sữa Nho","55.000",R.drawable.sanpham1));
        arrayList1.add(new Sup_ChonMon( "Trà sữa Dâu","55.000",R.drawable.sanpham3));
        arrayList1.add(new Sup_ChonMon( "Trà sữa Cam","55.000",R.drawable.sanpham4));
        arrayList1.add(new Sup_ChonMon( "Trà sữa Thái xanh","55.000",R.drawable.sanpham5));
        arrayList1.add(new Sup_ChonMon( "Trà sữa Truyền thống","55.000",R.drawable.chgb_4));
        adapter1=new Adapter_ChonMon(arrayList1,this.getActivity());
        gridView1.setAdapter(adapter1);
    }
    private void DialogLogin() {
        Dialog dialog= new Dialog(getActivity());
        dialog.setContentView(R.layout.dathang);
        dialog.show();
    }
}