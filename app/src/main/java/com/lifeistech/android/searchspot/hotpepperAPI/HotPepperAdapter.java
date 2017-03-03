package com.lifeistech.android.searchspot.hotpepperAPI;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.lifeistech.android.searchspot.R;
import com.lifeistech.android.searchspot.hotpepperAPI.models.Results;
import com.lifeistech.android.searchspot.hotpepperAPI.models.Shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Masashi Hamaguchi on 2017/03/03.
 */

public class HotPepperAdapter extends ArrayAdapter<Shop> {

    ArrayList<Shop> items;

    public HotPepperAdapter(Context context, int resource, ArrayList<Shop> objects) {
        super(context, resource, objects);
        items = objects;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Shop getItem(int position) {
        return items.get(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Shop item = getItem(position);
        final ViewHolder viewHolder;

        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rest_list, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.textView = (TextView) convertView.findViewById(R.id.nameText);
            viewHolder.textView.setTextColor(Color.BLACK);
            viewHolder.textView2 = (TextView) convertView.findViewById(R.id.addressText);
            viewHolder.textView2.setTextColor(Color.BLACK);
            viewHolder.textView3 = (TextView) convertView.findViewById(R.id.idText);
            viewHolder.textView3.setTextColor(Color.BLACK);

            convertView.setTag(viewHolder);
        }


        viewHolder.textView.setText(item.getName());
        viewHolder.textView2.setText(item.getAddress());
        viewHolder.textView3.setText(item.getId());


        return convertView;
    }

    static class ViewHolder {
        TextView textView;
        TextView textView2;
        TextView textView3;
    }
}
