package com.example.playingaudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageView playPauseIcon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playPauseIcon = findViewById(R.id.goSongIcon);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.stuff);


    }

    public void previous(View view) {
    }

    public void play(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            playPauseIcon.setImageResource(R.drawable.ic_play_arrow_blue_24dp);
        } else {
            mediaPlayer.start();
            playPauseIcon.setImageResource(R.drawable.ic_pause_blue_24dp);
        }

    }
        public void next (View view) {
        }
    }