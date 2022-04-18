package com.foysaldev.androidgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int [] districticon;
    String [] districtName;
    LayoutInflater inflater;

    public CustomAdapter(Context context,String[] districtName, int[] districticon) {
        this.context = context;
        this.districtName = districtName;
        this.districticon = districticon;
    }

    @Override
    public int getCount() {
        return districtName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view =  inflater.inflate(R.layout.grid_item,viewGroup,false);
        }

        ImageView imageView = view.findViewById(R.id.ImageViewId);
        TextView textView = view.findViewById(R.id.TextViewId);

        imageView.setImageResource(districticon[i]);
        textView.setText(districtName[i]);

        return view;
    }
}
