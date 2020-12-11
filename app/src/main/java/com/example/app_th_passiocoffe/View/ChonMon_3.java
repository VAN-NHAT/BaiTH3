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


public class ChonMon_3 extends Fragment {
    GridView gridView3;
    ArrayList<Sup_ChonMon> arrayList3;
    Adapter_ChonMon adapter3;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.chonmon_3, container, false);
        gridView3= view.findViewById(R.id.gridview_frgm_3);
        arrayList3= new ArrayList<>();

        homeData();
        context = this.getActivity();
        adapter3= new Adapter_ChonMon(arrayList3,context);
        gridView3.setAdapter(adapter3);

        adapter3=new Adapter_ChonMon(getActivity(),R.layout.sup_chonmon,arrayList3);
        gridView3.setAdapter(adapter3);
        return  view;
    }
    public void homeData(){
        arrayList3.add(new Sup_ChonMon( "Trà sữa Dâu","55.000",R.drawable.sanpham3));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Cam","55.000",R.drawable.sanpham4));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Thái xanh","55.000",R.drawable.sanpham5));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Truyền thống","55.000",R.drawable.chgb_4));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Đặc biệt","55.000",R.drawable.chgb_1));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Nho","55.000",R.drawable.sanpham1));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Đặc biệt","55.000",R.drawable.chgb_1));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Nho","55.000",R.drawable.sanpham1));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Dâu","55.000",R.drawable.sanpham3));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Cam","55.000",R.drawable.sanpham4));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Thái xanh","55.000",R.drawable.sanpham5));
        arrayList3.add(new Sup_ChonMon( "Trà sữa Truyền thống","55.000",R.drawable.chgb_4));
        adapter3=new Adapter_ChonMon(arrayList3,this.getActivity());
        gridView3.setAdapter(adapter3);
    }

}