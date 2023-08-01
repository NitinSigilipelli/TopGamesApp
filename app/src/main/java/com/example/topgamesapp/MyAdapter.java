package com.example.topgamesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    //1-Data source
    Context context;
    ArrayList<GameModel> gamesList;
    //2-constructor
    public MyAdapter(Context context, ArrayList<GameModel> gamesList) {
        this.context = context;
        this.gamesList = gamesList;
    }
    //3-View Holder classes
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView gameTitle;
        private ImageView gameImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gameTitle =  itemView.findViewById(R.id.cardTextView);
            gameImage = itemView.findViewById(R.id.cardImagview);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GameModel model = gamesList.get(position);
        holder.gameTitle.setText(model.getGameName());
        holder.gameImage.setImageResource(model.getGameImage());
        // Handle the click events
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You choose :"+gamesList.get(position).getGameName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }
}
