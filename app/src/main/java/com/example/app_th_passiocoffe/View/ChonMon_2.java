package com.example.app_th_passiocoffe.View;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.app_th_passiocoffe.R;

import java.util.ArrayList;


public class ChonMon_2 extends Fragment {
    GridView gridView2;
    ArrayList<Sup_ChonMon> arrayList2;
    Adapter_ChonMon adapter2;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.chonmon_2, container, false);
        gridView2= view.findViewById(R.id.gridview_frgm_2);
        arrayList2= new ArrayList<>();

        homeData();
        context = this.getActivity();
        adapter2= new Adapter_ChonMon(arrayList2,context);
        gridView2.setAdapter(adapter2);

        adapter2=new Adapter_ChonMon(getActivity(),R.layout.sup_chonmon,arrayList2);
        gridView2.setAdapter(adapter2);
        return  view;
    }
    public void homeData(){
        arrayList2.add(new Sup_ChonMon( "Trà sữa Dâu","55.000",R.drawable.sanpham3));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Cam","55.000",R.drawable.sanpham4));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Thái xanh","55.000",R.drawable.sanpham5));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Truyền thống","55.000",R.drawable.chgb_4));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Đặc biệt","55.000",R.drawable.chgb_1));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Nho","55.000",R.drawable.sanpham1));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Dâu","55.000",R.drawable.sanpham3));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Cam","55.000",R.drawable.sanpham4));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Thái xanh","55.000",R.drawable.sanpham5));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Truyền thống","55.000",R.drawable.chgb_4));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Đặc biệt","55.000",R.drawable.chgb_1));
        arrayList2.add(new Sup_ChonMon( "Trà sữa Nho","55.000",R.drawable.sanpham1));
        adapter2=new Adapter_ChonMon(arrayList2,this.getActivity());
        gridView2.setAdapter(adapter2);
    }

}