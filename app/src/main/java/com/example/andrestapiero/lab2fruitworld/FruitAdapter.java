package com.example.andrestapiero.lab2fruitworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andrestapiero.lab2fruitworld.models.Fruit;

import java.util.List;

public class FruitAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Fruit> list;



    public FruitAdapter(MainActivity context, int layout, List<Fruit> fruits) {
        this.context = context;
        this.layout = layout;
        this.list = fruits;

    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(this.layout, null);
            //Creamos instancia
            holder = new ViewHolder();
            holder.nameTextview = (TextView) convertView.findViewById(R.id.textViewName);
            holder.origin = (TextView) convertView.findViewById(R.id.textViewOrigin);
            holder.icon = (ImageView) convertView.findViewById(R.id.imageViewIcon);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final Fruit currentFruit = (Fruit) getItem(position);
        holder.nameTextview.setText(currentFruit.getName());
        holder.origin.setText(currentFruit.getOrigin());
        holder.icon.setImageResource(currentFruit.getIcon());
        return convertView;
    }

    static class ViewHolder {
        private TextView nameTextview;
        private TextView origin;
        private ImageView icon;
    }




}
