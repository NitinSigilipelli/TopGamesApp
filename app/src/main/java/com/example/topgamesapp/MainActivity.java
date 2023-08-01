package com.example.topgamesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //1-Data source
    ArrayList gamesList;
    //2-AdapterView
    RecyclerView recyclerView;
    //3-Adapter
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        gamesList = new ArrayList<>();
        gamesList.add(new GameModel("Horizon Chase",R.drawable.card1));
        gamesList.add(new GameModel("Pubg",R.drawable.card2));
        gamesList.add(new GameModel("Head Bolly 2",R.drawable.card3));
        gamesList.add(new GameModel("Hooked On You",R.drawable.card4));
        gamesList.add(new GameModel("FIFA 2022",R.drawable.card5));
        gamesList.add(new GameModel("Fortnite",R.drawable.card6));

        adapter = new MyAdapter(this,gamesList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}