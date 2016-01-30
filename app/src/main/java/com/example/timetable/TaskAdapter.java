package com.example.timetable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Lewis on 28/08/2015.
 */
public class TaskAdapter extends ArrayAdapter{

    public TaskAdapter(Context context, String[] values){
        super(context, R.layout.fragment_tasks, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.task_row, parent, false);

        String mobiles = (String) getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.task_list);

        theTextView.setText(mobiles);

        return theView;
    }
}
