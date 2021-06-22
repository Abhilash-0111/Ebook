package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Listenbook extends AppCompatActivity {
    MediaPlayer mediaPlayer ;
    ImageView fast, slow ;
    float speed = 1.0f ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listenbook);
        mediaPlayer = MediaPlayer.create(this,R.raw.ramnamkirtan);

        fast  = (ImageView) findViewById(R.id.fast);
        slow  = (ImageView) findViewById(R.id.slow);

        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speed += 0.25f;
                speedcontrol(speed);
            }
        });

        slow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speed -= 0.25f;
                speedcontrol(speed);
            }
        });

        ImageView play = (ImageView)findViewById(R.id.play) ;
        ImageView pause = (ImageView)findViewById(R.id.pause) ;
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playsong(v);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopsong(v);
            }
        });


    }


    public void playsong(View v){
        //  MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.ramnamkirtan);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }
    public void stopsong(View v){
        //MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.ramnamkirtan);
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this,R.raw.ramnamkirtan);
    }

    void speedcontrol(float s){
        float speed = s;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(speed));
        }
    }


}