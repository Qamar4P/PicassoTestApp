package com.github.qamar4p.testapp;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageView imageView2;
    private Picasso picasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);

        picasso = new Picasso.Builder(getApplicationContext())
                .loggingEnabled(true).listener((picasso1, uri, exception) -> {
                    Log.wtf("Picasso","Url: "+uri,exception);
                }).indicatorsEnabled(true)
                .build();

        picasso.load("http://i.imgur.com/DvpvklR.png")
                .into(imageView);

        picasso.load("https://d19dnii6y7cwuc.cloudfront.net/uploads/media/3342/original/5b1a2bc8c3863.png")
                .into(imageView);
    }
}
