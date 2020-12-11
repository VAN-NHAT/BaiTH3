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


public class ChonMon_4 extends Fragment {
    GridView gridView4;
    ArrayList<Sup_ChonMon> arrayList4;
    Adapter_ChonMon adapter4;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.chonmon_4, container, false);
        gridView4= view.findViewById(R.id.gridview_frgm_4);
        arrayList4= new ArrayList<>();

        homeData();
        context = this.getActivity();
        adapter4= new Adapter_ChonMon(arrayList4,context);
        gridView4.setAdapter(adapter4);

        adapter4=new Adapter_ChonMon(getActivity(),R.layout.sup_chonmon,arrayList4);
        gridView4.setAdapter(adapter4);
        return  view;
    }
    public void homeData(){
        arrayList4.add(new Sup_ChonMon( "Trà sữa Cam","55.000",R.drawable.sanpham4));
        arrayList4.add(new Sup_ChonMon( "Trà sữa Thái xanh","55.000",R.drawable.sanpham5));
        arrayList4.add(new Sup_ChonMon( "Trà sữa Đặc biệt","55.000",R.drawable.chgb_1));
        arrayList4.add(new Sup_ChonMon( "Trà sữa Nho","55.000",R.drawable.sanpham1));
        arrayList4.add(new Sup_ChonMon( "Trà sữa Dâu","55.000",R.drawable.sanpham3));
        arrayList4.add(new Sup_ChonMon( "Trà sữa Cam","55.000",R.drawable.sanpham4));
        arrayList4.add(new Sup_ChonMon( "Trà sữa Thái xanh","55.000",R.drawable.sanpham5));
        arrayList4.add(new Sup_ChonMon( "Trà sữa Truyền thống","55.000",R.drawable.chgb_4));
        adapter4=new Adapter_ChonMon(arrayList4,this.getActivity());
        gridView4.setAdapter(adapter4);
    }

}