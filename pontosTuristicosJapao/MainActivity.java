package com.example.pontosturisticosjaponeses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private String[] itens = {"Dança","Links De Pontos Turísticos","Mapa De Tokyo", "Vídeo De Pontos Turísticos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_activated_2,android.R.id.text1,itens);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 0:
                        abrirDanca();
                        break;

                    case 1:
                        abrirPontosTuristicos();
                        break;

                    case 2:
                        abrirMapaTokyo();
                        break;

                    case 3:
                        abrirVideo();
                        break;
                }

            }
        });

    }

    private void abrirPontosTuristicos() {
        Intent janelaInformacoes = new Intent(this, PontosTuristicos.class);
        startActivity(janelaInformacoes);
    }

    public void abrirDanca() {
        Intent janelaDanca = new Intent(this, Danca.class);
        startActivity(janelaDanca);
    }

    public void abrirMapaTokyo() {
        Intent janelaMapaTokyo = new Intent(this, MapaTokyo.class);
        startActivity(janelaMapaTokyo);
    }

    private void abrirVideo() {
        Intent janelaVideo = new Intent(this, Video.class);
        startActivity(janelaVideo);
    }

}
