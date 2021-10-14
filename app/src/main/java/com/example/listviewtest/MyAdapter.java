package com.example.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter<LiaoTianKuang> {

    private Context context;
    private List<LiaoTianKuang> list = new ArrayList<LiaoTianKuang>();

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<LiaoTianKuang> objects) {
        super(context, resource, objects);
        this.list = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //创建一行
        View rowView = LayoutInflater.from(context).inflate(R.layout.activity_listview_iitem,null);
        //绑定数据
        ImageView imageView = rowView.findViewById(R.id.list_item_image);
        TextView name = rowView.findViewById(R.id.list_item_name);
        TextView message = rowView.findViewById(R.id.list_item_message);
        //返回一行
        imageView.setImageResource(list.get(position).getImageId());
        name.setText(list.get(position).getName());
        message.setText(list.get(position).getMessage());
        return rowView;
    }
}
