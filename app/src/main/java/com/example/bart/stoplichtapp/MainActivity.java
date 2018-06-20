package com.example.bart.stoplichtapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
<<<<<<< HEAD
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
=======
import android.widget.Button;
>>>>>>> 065c549a4b96ce33a5fca1e8a0b102b3178746b5

import com.example.bart.stoplichtapp.List.CourseListActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

//    ArrayAdapter adapter;
    private EditText mChildValueEditText;
    private Button mAddButton, mRemoveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        mChildValueEditText = (EditText) findViewById(R.id.childValueEditText);
        mAddButton = (Button) findViewById(R.id.addButton);
        mRemoveButton = (Button) findViewById(R.id.removeButton);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference mRef = database.getReference("Hello");

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String childValue = mChildValueEditText.getText().toString();
            }
        });

        mRemoveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRef.removeValue();
            }
        });
//        EditText theFilter = (EditText) findViewById(R.id.searchFilter);

//        adapter = new ArrayAdapter(this, R.layout.activity_courselist, names);
//
//        theFilter.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                (MainActivity.this)
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

//        Button login = (Button) findViewById(R.id.button);
//
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Character care = new Character("klote", "5", "10", "100", "50");
//                writeToFirebase(care);
//            }
//
//            public void writeToFirebase(Character c) {
//
//                FirebaseDatabase database = FirebaseDatabase.getInstance();
//                DatabaseReference myRef = database.getReference("server");
//                DatabaseReference charRef = myRef.child("chars");
//                Map<String, Character> chars = new HashMap<>();
//                chars.put(c.name, c);
//                chars.put("jeroen", new Character("Jeroen","11","10","10","10"));
//                charRef.setValue(chars);
//            }
//        });

    }



//    public void naarLijst(View v){
//        Intent naarlijst = new Intent(this, CourseListActivity.class);
//        startActivity(naarlijst);
//    }
=======
        Button naarlijst = (Button) findViewById(R.id.button);
        naarlijst.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CourseListActivity.class);
                startActivity(i);

            }

        });
    }

>>>>>>> 065c549a4b96ce33a5fca1e8a0b102b3178746b5
}
