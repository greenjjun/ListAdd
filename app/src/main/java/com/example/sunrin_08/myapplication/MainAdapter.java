package com.example.sunrin_08.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainAdapter extends BaseAdapter {
    ArrayList<Item> arrayList;

    MainAdapter() {
        arrayList = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Item getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.content_main, parent, false);
        }
        TextView name = convertView.findViewById(R.id.name);
        TextView number = convertView.findViewById(R.id.number);
        TextView birth = convertView.findViewById(R.id.birth);

        Item item = getItem(position);
        name.setText(item.getName());
        number.setText(item.getNumber());
        birth.setText(item.getBirth());
        return convertView;
    }
    public void addContent(String name, String number, String birth){
        Item item = new Item();
        item.setBirth(birth);
        item.setNumber(number);
        item.setName(name);

        arrayList.add(item);
    }
}
