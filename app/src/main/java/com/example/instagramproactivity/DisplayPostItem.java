package com.example.instagramproactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayPostItem extends AppCompatActivity {

    ImageView cirpostdisaccimg;
    TextView txtdispostname;
    ImageView imgdispostphoto;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_post_item);

        cirpostdisaccimg = findViewById(R.id.cirpostdisaccimg);
        txtdispostname = findViewById(R.id.txtdispostname);
        imgdispostphoto = findViewById(R.id.imgdispostphoto);

        displaypostview();

    }

    private void displaypostview() {
        int photos = getIntent().getIntExtra("photos",0);
        String names = getIntent().getStringExtra("names");
        int accphoto = getIntent().getIntExtra("accphoto",0);

        cirpostdisaccimg.setImageResource(photos);
        txtdispostname.setText(names);
        imgdispostphoto.setImageResource(accphoto);

    }
}