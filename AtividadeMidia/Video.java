package com.example.androidmidia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    Button btn_musica_TelaVideo, btn_menu_TelaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView nya_arigato = (VideoView)findViewById(R.id.video_view);
        btn_musica_TelaVideo = findViewById(R.id.btn_musica_TelaVideo);
        btn_menu_TelaVideo = findViewById(R.id.btn_menu_TelaVideo  );

        String uri = "android.resource://" + getPackageName() + "/" + R.raw.nya_arigato;

        if (nya_arigato != null) {
            nya_arigato.setVideoURI(Uri.parse(uri));
            nya_arigato.start();

            nya_arigato.setMediaController(new MediaController(this));
        }

        btn_musica_TelaVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMusicaTelaVideo();
            }
        });

        btn_menu_TelaVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMenuTelaVideo();
            }
        });
    }

    private void abrirMusicaTelaVideo() {
        Intent janelaMusicaTelaVideo = new Intent(Video.this, Musica.class);
        startActivity(janelaMusicaTelaVideo);
    }

    private void abrirMenuTelaVideo() {
        Intent janelaMenuTelaVideo = new Intent(Video.this, MainActivity.class);
        startActivity(janelaMenuTelaVideo);
    }
}