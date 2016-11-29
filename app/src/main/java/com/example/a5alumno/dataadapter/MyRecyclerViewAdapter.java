package com.example.a5alumno.dataadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by A5Alumno on 29/11/2016.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>{

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImgList;
        public TextView mTxtTitle;
        public TextView mTxtBody;
        public ViewHolder(View itemView) {
            super(itemView);
            this.mImgList = (ImageView) itemView.findViewById(R.id.img_list_view_row_item);
            this.mTxtTitle = (TextView) itemView.findViewById(R.id.title_list_view_row_item);
            this.mTxtBody = (TextView) itemView.findViewById(R.id.body_list_view_row_item);
        }
    }

    private Context mContext;
    private List<Item> mItemList;

    public MyRecyclerViewAdapter(Context context, List<Item> listItem){
        this.mContext = context;
        this.mItemList = listItem;
    }

    @Override
    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewRow = LayoutInflater.from(this.mContext).inflate(R.layout.list_view_row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(viewRow);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.mImgList.setImageResource(R.drawable.androidicon);
        holder.mTxtTitle.setText(this.mItemList.get(position).getmTitle());
        holder.mTxtBody.setText(this.mItemList.get(position).getmBody());
    }

    @Override
    public int getItemCount() {
        return this.mItemList.size();
    }
}
