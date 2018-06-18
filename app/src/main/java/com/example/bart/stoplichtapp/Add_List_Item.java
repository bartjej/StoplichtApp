package com.example.bart.stoplichtapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bart.stoplichtapp.List.CourseListActivity;

public class Add_List_Item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__list__item);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Add_List_Item.this, CourseListActivity.class);

                EditText naamedit = (EditText) findViewById(R.id.editName);
                EditText infoedit = (EditText) findViewById(R.id.editInfo);
                String newnaam = naamedit.getText().toString();
                String newinfo = infoedit.getText().toString();

                back.putExtra("newnaam", newnaam);
                back.putExtra("newinfo", newinfo);

                startActivity(back);
                finish();
            }
        });
    }

}
