package com.example.bart.stoplichtapp.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bart.stoplichtapp.Add_List_Item;
import com.example.bart.stoplichtapp.R;
import com.example.bart.stoplichtapp.models.CourseModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseListActivity extends AppCompatActivity {

    private ListView mListView;
    private CourseListAdapter mAdapter;
    private List<CourseModel> courseModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courselist);

        mListView = (ListView) findViewById(R.id.my_list_view);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                             @Override
                                             public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                                                 Intent showInfo = new Intent(CourseListActivity.this, ListItemInfo.class);

                                                 TextView selected = (TextView) findViewById(R.id.subject_name);
                                                 CharSequence waarde = selected.getText();
                                                 TextView selected2 = (TextView) findViewById(R.id.subject_code);
                                                 CharSequence waarde2 = selected2.getText();

                                                 String naam = waarde.toString();
                                                 showInfo.putExtra("name", naam);
                                                 String date = waarde2.toString();
                                                 showInfo.putExtra("date", date);
                                                 startActivity(showInfo);
                                                 finish();
                                             }
                                         }
        );

        Bundle newmodel = getIntent().getExtras();
        if (newmodel != null) {
            String info = newmodel.getString("newinfo");

            courseModels.add(new CourseModel(newmodel.getString("newnaam") ,new Date()));

        }
        courseModels.add(new CourseModel("bijeenkomst 1",new Date()));
        courseModels.add(new CourseModel("bijeenkomst 2",new Date()));
        courseModels.add(new CourseModel("bijeenkomst 3",new Date()));
<<<<<<< HEAD
        courseModels.add(new CourseModel("bijeenkomst 4",new Date()));
        courseModels.add(new CourseModel("bijeenkomst 5",new Date()));
=======
>>>>>>> 065c549a4b96ce33a5fca1e8a0b102b3178746b5
        mAdapter = new CourseListAdapter(CourseListActivity.this, 0, courseModels);
        mListView.setAdapter(mAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(CourseListActivity.this, Add_List_Item.class);
                startActivity(i);

            }

        });

    }


}
