package com.example.sadic.recycleviewapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder>{

    List<Movie> movieList;

    public MyRecycleAdapter(List<Movie> list) { //pass list form main activity
        movieList = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View rootView =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Movie movies = movieList.get(position);

        holder.tvMovie.setText(movies.getTitle());
        holder.tvGenre.setText(movies.getGenre());
        holder.tvYear.setText(movies.getYear());


    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvMovie, tvGenre, tvYear;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvMovie = itemView.findViewById(R.id.tvMovie);
            tvGenre = itemView.findViewById(R.id.tvGenre);
            tvYear = itemView.findViewById(R.id.tvYear);


        }


    }
}
