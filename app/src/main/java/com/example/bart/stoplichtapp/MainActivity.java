package com.example.bart.stoplichtapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bart.stoplichtapp.List.CourseListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button naarlijst = (Button) findViewById(R.id.button);
        naarlijst.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CourseListActivity.class);
                startActivity(i);

            }

        });
    }

//    public void naarLijst(View v){
//        Intent intent = new Intent(this, CourseListActivity.class);
//        startActivity(intent);
//    }
}
