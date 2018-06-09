package com.example.frank.uome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        listView = (ExpandableListView) findViewById(R.id.LVEXP);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();
        //add entries to the table by using
        //List<String> newEntry = new ArrayList<>();
        //newEntry.add(*content of the entry*);
    }

    public void openAddPersonPage(View view) {
        Intent intent = new Intent(this, addPersonPage.class);
        startActivity(intent);
    }
    public void openAddAmountPage(View view) {
        Intent intent = new Intent(this, addAmountPage.class);
        startActivity(intent);
    }



}
