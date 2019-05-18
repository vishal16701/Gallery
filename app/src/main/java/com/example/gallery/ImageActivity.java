package com.example.gallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        Image adapter = new Image(this);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[position]);
    }
}
