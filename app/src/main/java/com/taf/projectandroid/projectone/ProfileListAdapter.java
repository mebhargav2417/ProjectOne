package com.taf.projectandroid.projectone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by NitinKumar on 6/5/2018.
 */

public class ProfileListAdapter extends ArrayAdapter<String> {

private final Context context;
private final String[] values;

public ProfileListAdapter(Context context,String[] values) {
        super(context, R.layout.profilelist, values);
        this.context = context;
        this.values = values;
        }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.profilelist, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.plistName);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.plistImage);
        textView.setText(values[position]);
        // Change the icon for Windows and iPhone
        String s = values[position];
        if (s.startsWith("Name")) {
                imageView.setImageResource(R.drawable.account_outline);
        } else if (s.startsWith("Date")) {
                imageView.setImageResource(R.drawable.calendar);
        } else if(s.equalsIgnoreCase("Mobile")) {
                imageView.setImageResource(R.drawable.cellphone);
        } else if(s.equalsIgnoreCase("Address")) {
                imageView.setImageResource(R.drawable.map_marker);
        } else if(s.equalsIgnoreCase("Logout")) {
                imageView.setImageResource(R.drawable.logout);
        }

        return rowView;
    }
}
