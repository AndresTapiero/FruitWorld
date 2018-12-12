package com.example.andrestapiero.lab2fruitworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> fruits;
    private List<String> cityfruits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_fruit_round);

        listView= findViewById(R.id.listView);

        fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Strawberry");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Pear");
        fruits.add("Raspberry");

        cityfruits = new ArrayList<>();
        cityfruits.add("Gran canaria");
        cityfruits.add("Huelva");
        cityfruits.add("Sevilla");
        cityfruits.add("Madrid");
        cityfruits.add("Galicia");
        cityfruits.add("Zaragoza");
        cityfruits.add("Barcelona");


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "the best fruit from "+fruits.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        MyAdapter myAdapter = new MyAdapter(this, R.layout.list__fruit,fruits);
        listView.setAdapter(myAdapter);

    }
}
