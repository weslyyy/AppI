package com.example.pontosturisticosjaponeses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    private ImageButton btnVoltarVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView video = (VideoView)findViewById(R.id.videoView);
        btnVoltarVideo = findViewById(R.id.btn_voltar_video);


        String uri = "android.resource://" + getPackageName() + "/" + R.raw.video;

        if (video != null) {
            video.setVideoURI(Uri.parse(uri));
            video.start();

            video.setMediaController(new MediaController(this));
        }

        btnVoltarVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarVideo();
            }
        });
    }

    private void abrirVoltarVideo() {
        Intent janelaVoltarVideo = new Intent(this, MainActivity.class);
        startActivity(janelaVoltarVideo);

    }
}