package com.example.atividadejogos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnJogoDaVelha, btnQuebraCabeca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogoDaVelha = findViewById(R.id.btn_jogo_da_velha);
        btnQuebraCabeca = findViewById(R.id.btn_quebra_cabeca);

        btnJogoDaVelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirJogoDaVelha();
            }
        });

        btnQuebraCabeca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirQuebraCabeca();
            }
        });

    }

    private void abrirJogoDaVelha() {
        Intent janelaJogoDaVelha = new Intent(this, JogoDaVelha.class);
        startActivity(janelaJogoDaVelha);
    }

    private void abrirQuebraCabeca() {
        Intent janelaQuebraCabeca = new Intent(this, QuebraCabeca.class);
        startActivity(janelaQuebraCabeca);
    }
}