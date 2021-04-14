package com.example.vingadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Escolha extends AppCompatActivity {
    private TextView resposta;
    private Button btnTeaser, btnSom;
    private WebView imagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        resposta = findViewById(R.id.resposta);
        btnTeaser = findViewById(R.id.btn_trailer);
        btnSom = findViewById(R.id.btn_som);
        imagens = findViewById(R.id.imagens);

        String recebe = getIntent().getStringExtra("dados");
        resposta.setText("Olá " + recebe + ", escolha uma opção");

        WebSettings gif = imagens.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/vingadores1.gif";
        imagens.loadUrl(caminho);

        btnTeaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTrailer();

            }
        });

        btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSom();
            }
        });
    }

    public void abrirTrailer() {
        Intent janelat = new Intent(this, Trailer.class);
        startActivity(janelat);
    }

    public void abrirSom() {
        Intent janelas = new Intent(this, Som.class);
        startActivity(janelas);
    }
}



