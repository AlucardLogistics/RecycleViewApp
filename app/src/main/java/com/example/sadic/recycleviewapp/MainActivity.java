package com.example.sadic.recycleviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyRecycleAdapter adapter;
    ArrayList<Movie> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new MyRecycleAdapter(movies);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(manager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);

        setMovieData();


    }

    private void setMovieData() {

        Movie movieItem1 = new Movie("Movie1", "drama", "1471");
        Movie movieItem2 = new Movie("Movie2", "drama", "1488");
        Movie movieItem3 = new Movie("Movie3", "drama", "1271");
        Movie movieItem4 = new Movie("Movie4", "drama", "1371");
        Movie movieItem5 = new Movie("Movie5", "drama", "1771");
        Movie movieItem6 = new Movie("Movie6", "drama", "1171");

        movies.add(movieItem1);
        movies.add(movieItem2);
        movies.add(movieItem3);
        movies.add(movieItem4);
        movies.add(movieItem5);
        movies.add(movieItem6);
        adapter.notifyDataSetChanged(); //refresh recycler when data is changed

    }


}
