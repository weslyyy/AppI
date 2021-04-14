 package com.example.vingadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class Som extends AppCompatActivity {

     private Button btnVoltars;
     private MediaPlayer som;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_som);

         btnVoltars = findViewById(R.id.btn_voltar_s);
         som = MediaPlayer.create(this, R.raw.tema);
         som.start();

         btnVoltars.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 abrirVoltarSom();
             }
         });
     }

     public void abrirVoltarSom() {
         Intent janela = new Intent(this, Escolha.class);
         startActivity(janela);
         som.stop();
     }
 }