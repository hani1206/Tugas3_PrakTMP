package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFoto;
    TextView textView, textViewDate, textViewInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFoto = findViewById(R.id.imageViewFoto);
        textView = findViewById(R.id.textView);
        textViewDate = findViewById(R.id.textViewDate);
        textViewInfo = findViewById(R.id.textViewInfo);

        getIncomingExtra();
    }

    private void getIncomingExtra(){

        if (getIntent().hasExtra("image_url")&& getIntent().hasExtra("nama") && getIntent().hasExtra("date") && getIntent().hasExtra("info")){

            String fotoMovie = getIntent().getStringExtra("image_url");
            String namaMovie = getIntent().getStringExtra("nama");
            String dateMovie = getIntent().getStringExtra("date");
            String infoMovie = getIntent().getStringExtra("info");

            setDataActivity(fotoMovie, namaMovie, dateMovie, infoMovie);

        }
    }

    private void setDataActivity(String fotoMovie, String namaMovie, String dateMovie, String infoMovie){

        Glide.with(this).asBitmap().load(fotoMovie).into(imageViewFoto);

        textView.setText(namaMovie);
        textViewDate.setText(dateMovie);
        textViewInfo.setText(infoMovie);
    }
}