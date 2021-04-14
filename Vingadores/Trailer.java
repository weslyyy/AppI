package com.example.vingadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Trailer extends AppCompatActivity {

    private VideoView olhar;
    private Button btnVoltart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer);

        btnVoltart = findViewById(R.id.btn_voltar_t);
        olhar = findViewById(R.id.olhar);

        Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.trailer);
        olhar.setVideoURI(caminho);
        olhar.start();

        btnVoltart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltar();
            }
        });
    }

    public void abrirVoltar() {
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
    }
}