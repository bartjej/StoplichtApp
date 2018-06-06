package com.example.bart.stoplichtapp.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.bart.stoplichtapp.R;
import com.example.bart.stoplichtapp.models.CourseModel;

import java.util.List;

public class CourseListAdapter extends ArrayAdapter<CourseModel> {
    public CourseListAdapter(Context context, int resource, List<CourseModel> objects){
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;

        if (convertView == null ) {
            vh = new ViewHolder();
            LayoutInflater li = LayoutInflater.from(getContext());
            convertView = li.inflate(R.layout.view_content_row, parent, false);
            vh.name = (TextView) convertView.findViewById(R.id.subject_name);
            vh.code = (TextView) convertView.findViewById(R.id.subject_code);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        CourseModel cm = getItem(position);
        vh.name.setText((CharSequence) cm.getName());
        vh.code.setText((CharSequence) cm.getEcts());
        return convertView;
    }

    private static class ViewHolder {
        TextView name;
        TextView code;
    }
}
