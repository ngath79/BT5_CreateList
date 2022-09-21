package com.google.bt5_createlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int  layout;
    private List<MonAn> araylist;

    public Adapter(Context context, int layout, List<MonAn> araylist) {
        this.context = context;
        this.layout = layout;
        this.araylist = araylist;
    }

    @Override
    public int getCount() {

        return araylist.size();
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
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(layout, null);

        MonAn monan = araylist.get(i);

        TextView textV1 = view.findViewById(R.id.tv_name);
        TextView textV2 = view.findViewById(R.id.note);
        ImageView textimg = view.findViewById(R.id.imghinh);

        textV1.setText(monan.getTenmon());
        textV2.setText(monan.getNota());
        textimg.setImageResource(monan.getHinh());

        return view;
    }
}
