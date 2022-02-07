package com.futuregeic.jameltraders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListData[] myListData = new MyListData[]{
                new MyListData("Grocery ", R.drawable.n1),
                new MyListData("Fresh & Dairy ", R.drawable.n2),
                new MyListData("Bakery & Snacks", R.drawable.g3),
                new MyListData("Beverages ", R.drawable.n5),
                new MyListData("Baby & Kids ", R.drawable.g5),
                new MyListData("Household Needs ", R.drawable.g6),



        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ryclerview);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }



}
