package com.example.a5alumno.dataadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by A5Alumno on 29/11/2016.
 */

public class MyListAdapter extends ArrayAdapter<Item> {

    private List<Item> mItemList;
    private Context mContext;

    public MyListAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
        this.mItemList = objects;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // super.getView(position, convertView, parent);

        //convertView = LayoutInflater.from(this.getContext()).inflate(R.layout.list_view_row_item, null);
        LayoutInflater inflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_view_row_item, null);

        ImageView imgRowItem = (ImageView) convertView.findViewById(R.id.img_list_view_row_item);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title_list_view_row_item);
        TextView txtBody = (TextView) convertView.findViewById(R.id.body_list_view_row_item);

        txtTitle.setText(this.mItemList.get(position).getmTitle());
        txtBody.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.");

        return convertView;
    }
}
