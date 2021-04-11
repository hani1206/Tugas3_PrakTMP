package com.example.tugas3;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.ViewHolder> {

    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> date = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();
    private Context context;

    public AdapterData(ArrayList<String> foto, ArrayList<String> nama, ArrayList<String> date, ArrayList<String> info,Context context) {
        this.foto = foto;
        this.nama = nama;
        this.date = date;
        this.info = info;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(foto.get(position)).into(holder.movieImage);
        holder.textViewName.setText(nama.get(position));
        holder.textViewDate.setText(date.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //Toast.makeText(context,nama.get(position),Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image_url", foto.get(position));
                intent.putExtra("nama", nama.get(position));
                intent.putExtra("date", date.get(position));
                intent.putExtra("info", info.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nama.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewName;
        TextView textViewDate;
        ImageView movieImage;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieImage = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.dataTitle);
            textViewDate = itemView.findViewById(R.id.dataDate);
            constraintLayout = itemView.findViewById(R.id.constrainLayout);
        }
    }
}
