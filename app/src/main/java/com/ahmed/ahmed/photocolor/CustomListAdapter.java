package com.ahmed.ahmed.photocolor;

import android.app.Activity;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 18/07/15.
 */
public class CustomListAdapter extends ArrayAdapter<String> {


    private final Activity context;
    private final ArrayList<String> itemname;
    private final ArrayList<Integer> imgid;

    public CustomListAdapter(Activity context, ArrayList<String> itemname, ArrayList<Integer> imgid) {
        super(context, R.layout.list, itemname);


        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list, null, true);


        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.color);

        txtTitle.setText(itemname.get(position));
        imageView.setBackgroundColor(imgid.get(position));


        return rowView;
    }







}



