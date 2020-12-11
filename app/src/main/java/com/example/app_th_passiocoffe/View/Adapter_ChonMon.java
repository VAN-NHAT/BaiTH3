package com.example.app_th_passiocoffe.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app_th_passiocoffe.R;

import java.util.ArrayList;
import java.util.List;


public class Adapter_ChonMon extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Sup_ChonMon> ListMonAn;

    public Adapter_ChonMon(Context context, int layout, List<Sup_ChonMon>ListMonAn) {
        this.context = context;
        this.layout = layout;
        this.ListMonAn = ListMonAn;
    }

    public Adapter_ChonMon(ArrayList<Sup_ChonMon> mListenerList, Context context) {
        context = context;
        this. ListMonAn = new ArrayList<Sup_ChonMon>();
        this. ListMonAn =mListenerList;
    }

    public Adapter_ChonMon(Adapter_ChonMon gridView_adapter_ChonMon, List<Sup_ChonMon> image_details) {
    }

    @Override
    public int getCount() {
        return ListMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgAnh;
        TextView tv_tenMon;
        TextView tv_giaTien;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.tv_tenMon = (TextView)convertView.findViewById(R.id.text_ten_mon);
            holder.tv_giaTien = (TextView)convertView.findViewById(R.id.text_giatien);
            holder.imgAnh = (ImageView)convertView.findViewById(R.id.img_chonmon_1);


            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        Sup_ChonMon hinhanh =  ListMonAn.get(position);
        holder.tv_tenMon.setText( ListMonAn.get(position).getTenMon());
        holder.tv_giaTien.setText( ListMonAn.get(position).getGiaTien());
        holder.imgAnh.setImageResource(hinhanh.getImg_mon());

        return convertView;
    }
}
