package com.example.bart.stoplichtapp.List;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.bart.stoplichtapp.R;

public class ListItemInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle waardes = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.nameTag);
        TextView date = (TextView) findViewById(R.id.dateTag);
        if (waardes != null) {
            String naam = waardes.getString("name");
            String datum = waardes.getString("date");
            name.setText(naam);
            date.setText(datum);

        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(ListItemInfo.this, CourseListActivity.class);
                startActivity(back);
            }
        });
    }

}
