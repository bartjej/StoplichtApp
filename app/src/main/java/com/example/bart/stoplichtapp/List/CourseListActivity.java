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
        courseModels.add(new CourseModel("IOPR1", "8", "10", "1"));
        courseModels.add(new CourseModel("IOPR2", "6", "10", "3"));
        courseModels.add(new CourseModel("IPMEDT4", "7", "10", "4"));
        courseModels.add(new CourseModel("IMTD1", "3", "10", "2"));
        courseModels.add(new CourseModel("IKSE", "7", "10", "3"));
        mAdapter = new CourseListAdapter(CourseListActivity.this, 0, courseModels);
        mListView.setAdapter(mAdapter);
    }
}
