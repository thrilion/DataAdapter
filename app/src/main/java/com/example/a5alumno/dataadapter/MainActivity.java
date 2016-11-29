package com.example.a5alumno.dataadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) this.findViewById(R.id.listViewMain);
        listView.setOnItemClickListener(this);

        String[] listValues = {"Android", "iPhone", "WindowsMobile ", "Blackberry ", "WebOS ",
                "Ubuntu", "Windows 7 ", "Max OS X", "Linux", "OS/2 ", "Ubuntu", "Windows 7 ",
                "Max OS X", "Linux", "OS/2", "Ubuntu", "Windows 7 ", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile "};

        // mListView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listValues));

        List<Item> arrayListValues = new ArrayList<>();
        for(int i=0; i<listValues.length; i++){
            arrayListValues.add(new Item("@mipmap/ic_launcher", listValues[i], ""));
        }
        // listView.setAdapter(new MyListAdapter(this, 0, arrayListValues));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
        Log.e(TAG, "Item nº:" + pos+1 + ". Id: " + id);
        Toast.makeText(this, "Item nº:" + pos+1 + ". Id: " + id, Toast.LENGTH_SHORT).show();
    }
}
