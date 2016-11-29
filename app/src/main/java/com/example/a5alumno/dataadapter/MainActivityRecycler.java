package com.example.a5alumno.dataadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivityRecycler extends AppCompatActivity{

    private static final String TAG = "MainActivityRecycler";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        final RecyclerView recycler = (RecyclerView) findViewById(R.id.recyclerViewMain);

        String[] listValues = {"Android", "iPhone", "WindowsMobile ", "Blackberry ", "WebOS ",
                "Ubuntu", "Windows 7 ", "Max OS X", "Linux", "OS/2 ", "Ubuntu", "Windows 7 ",
                "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows 7 ", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile "};

        List<Item> arrayListValues = new ArrayList<>();
        for(int i=0; i<listValues.length; i++){
            arrayListValues.add(new Item("@mipmap/ic_launcher", listValues[i], ""));
        }

        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recycler.setAdapter(new MyRecyclerViewAdapter(this, arrayListValues));
    }
}
