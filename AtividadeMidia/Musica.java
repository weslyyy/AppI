package com.example.androidmidia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class Musica extends AppCompatActivity {
    Button btn_video_TelaMusica, btn_menu_TelaMusica;
    private ImageButton btn_pause_TelaMusica;
    private SeekBar seek_bar_TelaMusica;
    MediaPlayer reprodutor_TelaMusica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);

        btn_video_TelaMusica = findViewById(R.id.btn_video_TelaMusica);
        btn_menu_TelaMusica = findViewById(R.id.btn_menu_TelaMusica  );

        btn_pause_TelaMusica = findViewById(R.id.btn_pause_TelaMusica);
        reprodutor_TelaMusica = MediaPlayer.create(this, R.raw.siege_engine);
        seek_bar_TelaMusica = findViewById(R.id.seek_bar_TelaMusica);

        btn_video_TelaMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVideoTelaMusica();
            }
        });

        btn_menu_TelaMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMenuTelaMusica();
            }
        });

    }

    public void abrirVideoTelaMusica() {
        Intent janelaVideoTelaMusica = new Intent(Musica.this, Video.class);
        startActivity(janelaVideoTelaMusica);
    }

    public void abrirMenuTelaMusica() {
        Intent janelaMenuTelaMusica = new Intent(Musica.this, MainActivity.class);
        startActivity(janelaMenuTelaMusica);
    }

    public void playMusicaTelaMusica(View v) {
        if (!reprodutor_TelaMusica.isPlaying()) {
            reprodutor_TelaMusica.start();
            btn_pause_TelaMusica.setBackgroundResource(R.drawable.pause);
        } else {
            reprodutor_TelaMusica.pause();
            btn_pause_TelaMusica.setBackgroundResource(R.drawable.play);
        }
    }


}