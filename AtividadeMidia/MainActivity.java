package com.example.androidmidia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_musica_TelaMain, btn_video_TelaMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_musica_TelaMain = findViewById(R.id.btn_musica_TelaMain);
        btn_video_TelaMain = findViewById(R.id.btn_video_TelaMain);

        btn_musica_TelaMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMusicaTelaMain();
            }
        });

        btn_video_TelaMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVideoTelaMain();
            }
        });
    }

    private void abrirMusicaTelaMain() {
        Intent janelaMusicaMain = new Intent(MainActivity.this, Musica.class);
        startActivity(janelaMusicaMain);
    }

    private void abrirVideoTelaMain() {
        Intent janelaVideoTelaMain = new Intent(this, Video.class);
        startActivity(janelaVideoTelaMain);
    }
}

