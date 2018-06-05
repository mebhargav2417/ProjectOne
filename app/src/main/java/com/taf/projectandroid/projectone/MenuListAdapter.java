package com.taf.projectandroid.projectone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by NitinKumar on 6/4/2018.
 */

public class MenuListAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;


    public MenuListAdapter(Context context,String[] values) {
        super(context, R.layout.listtextwithimage, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listtextwithimage, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.menuName);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.menuImage);
        textView.setText(values[position]);
        // Change the icon for Windows and iPhone
        String s = values[position];
        if (s.startsWith("Sales")) {
            imageView.setImageResource(R.drawable.chart_bar);
        } else if (s.startsWith("Purchases")) {
            imageView.setImageResource(R.drawable.chart_line);
        } else if(s.equalsIgnoreCase("Net Profit")) {
            imageView.setImageResource(R.drawable.finance);
        }
        return rowView;
    }
}
