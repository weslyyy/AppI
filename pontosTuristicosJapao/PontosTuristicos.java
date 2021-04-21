package com.example.pontosturisticosjaponeses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class PontosTuristicos extends AppCompatActivity {
    private ImageButton btnVoltarPontosTuristicos;
    private ListView listaLinks;
    private String[] itensLinks = {"Akihabara - Bairro Comercial de Eletrônicos, Animes e Mangás", "Aokigahara - Floresta do Suicídio", "Monte Fuji", "Museu Dos Samurais", "O Templo Dourado De Kioto"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontos_turisticos);

        btnVoltarPontosTuristicos = findViewById(R.id.btn_voltar_video);
        listaLinks = findViewById(R.id.lista_links);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_activated_2,android.R.id.text1,itensLinks);

        listaLinks.setAdapter(adapter);

        listaLinks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 0:
                        abrirAkihabara();
                        break;

                    case 1:
                        abrirAokigahara();
                        break;

                    case 2:
                        abrirMonteFuji();
                        break;

                    case 3:
                        abrirMuseuDosSamurais();
                        break;

                    case 4:
                        abrirTemploDourado();
                        break;

                }
            }
        });

        btnVoltarPontosTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarPontosTuristicos();
            }
        });
    }

    private void abrirVoltarPontosTuristicos() {
        Intent janelaVoltarPontosTuristicos = new Intent(this, MainActivity.class);
        startActivity(janelaVoltarPontosTuristicos);

    }

    private void abrirAkihabara() {
        Intent akihabara = new Intent(Intent.ACTION_VIEW, Uri.parse("https://guia.melhoresdestinos.com.br/akihabara-199-5535-l.html"));
        startActivity(akihabara);
    }

    private void abrirAokigahara() {
        Intent aokigahara = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Aokigahara"));
        startActivity(aokigahara);
    }

    private void abrirMonteFuji() {
        Intent monteFuji = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Monte_Fuji"));
        startActivity(monteFuji);
    }

    private void abrirMuseuDosSamurais() {
        Intent museuDosSamurais = new Intent(Intent.ACTION_VIEW, Uri.parse("https://skdesu.com/conheca-o-museu-dos-samurais-em-tokyo/"));
        startActivity(museuDosSamurais);
    }

    private void abrirTemploDourado() {
        Intent temploDourado = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ideiasnamala.com/kioto-kinkaku-ji-o-templo-de-ouro/"));
        startActivity(temploDourado);
    }
}