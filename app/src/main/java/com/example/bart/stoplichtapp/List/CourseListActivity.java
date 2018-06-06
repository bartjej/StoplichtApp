package com.example.bart.stoplichtapp.List;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
                                                 Toast t = Toast.makeText(CourseListActivity.this,"Click" + position,Toast.LENGTH_LONG);
                                                 t.show();
                                             }
                                         }
        );
        courseModels.add(new CourseModel("bijeenkomst 1",new Date()));
        courseModels.add(new CourseModel("bijeenkomst 2",new Date()));
        mAdapter = new CourseListAdapter(CourseListActivity.this, 0, courseModels);
        mListView.setAdapter(mAdapter);
    }
}
