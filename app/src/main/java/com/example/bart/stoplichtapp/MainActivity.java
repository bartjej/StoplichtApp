package com.example.bart.stoplichtapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.bart.stoplichtapp.List.CourseListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void naarLijst(View v){
        Intent naarlijst = new Intent(this, CourseListActivity.class);
        startActivity(naarlijst);
    }
}
