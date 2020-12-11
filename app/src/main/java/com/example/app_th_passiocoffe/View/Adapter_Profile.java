package com.example.app_th_passiocoffe.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app_th_passiocoffe.R;

import java.util.List;



public class Adapter_Profile extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Sup_Profile> hinhanhList;

    public Adapter_Profile(Context context, int layout, List<Sup_Profile> hinhanhList) {
        this.context = context;
        this.layout = layout;
        this.hinhanhList = hinhanhList;
    }

    public Adapter_Profile(Adapter_Profile gridView_adapter_profile, List<Sup_Profile> image_details) {
    }

    @Override
    public int getCount() {
        return hinhanhList.size();
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
        ImageView imgIcon;
        TextView tenView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.imgIcon = (ImageView)convertView.findViewById(R.id.img_icon);
            holder.tenView = (TextView)convertView.findViewById(R.id.title_profile);


            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        Sup_Profile hinhanh = hinhanhList.get(position);
        holder.imgIcon.setImageResource(hinhanh.getIcon());
        holder.tenView.setText(hinhanhList.get(position).getTitle());


        return convertView;
    }
}
