package com.example.atividadejogos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JogoDaVelha extends AppCompatActivity {

    private Button btnMenuJogoDaVelha;
    private TextView jogadorJogoDaVelha;
    private Button[] arrayButton = new Button[10];
    private String vez = "X", jogador = "Jogador 1";
    private int jogadas = 0;
    private String[] matriz = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_da_velha);

        btnMenuJogoDaVelha = findViewById(R.id.btn_menu_jogo_da_velha);
        jogadorJogoDaVelha = findViewById(R.id.jogador_jogo_da_velha);

        inicializarBotoes();
        onClickButton();

        jogadorJogoDaVelha.setText(jogador);

        btnMenuJogoDaVelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMenuTelaJogoDaVelha();
            }
        });
    }

    private void abrirMenuTelaJogoDaVelha() {
        Intent janelaMenuTelaJogoDaVelha = new Intent(this, MainActivity.class);
        startActivity(janelaMenuTelaJogoDaVelha);
    }

    private void inicializarBotoes() {
        arrayButton[1] = findViewById(R.id.btn1_jogo_da_velha);
        arrayButton[2] = findViewById(R.id.btn2_jogo_da_velha);
        arrayButton[3] = findViewById(R.id.btn3_jogo_da_velha);
        arrayButton[4] = findViewById(R.id.btn4_jogo_da_velha);
        arrayButton[5] = findViewById(R.id.btn5_jogo_da_velha);
        arrayButton[6] = findViewById(R.id.btn6_jogo_da_velha);
        arrayButton[7] = findViewById(R.id.btn7_jogo_da_velha);
        arrayButton[8] = findViewById(R.id.btn8_jogo_da_velha);
        arrayButton[9] = findViewById(R.id.btn9_jogo_da_velha);
    }

    private void onClickButton() {
        for (int x = 1; x < 10; x++) {
            final int finalX = x;
            arrayButton[finalX].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setJogadas(finalX);
                }
            });
            matriz[x] = "";
        }
    }

    private void setJogadas (int x) {
        if (matriz[x].equals("")) {
            matriz[x] = vez;
            jogadas++;
            if (vez.equals("X") ) {
                vez = "O";
                jogador = "Jogador 2";
            } else {
                vez = "X";
                jogador = "Jogador 1";
            }

            jogadorJogoDaVelha.setText(jogador);
        }
        getButton();
        verifica();
    }

    private void getButton() {
        for (int x = 1; x < 10; x++) {
            arrayButton[x].setText(matriz[x]);
        }
    }

    private void verifica(){
        if(matriz[1].equals(matriz[2]) && !matriz[1].equals("")){
            if(matriz[2].equals(matriz[3])){
                ganhador(matriz[1]);
                return;
            }
        }

        if(matriz[1].equals(matriz[4]) && !matriz[1].equals("")){
            if(matriz[4].equals(matriz[7])){
                ganhador(matriz[1]);
                return;
            }
        }

        if(matriz[1].equals(matriz[5]) && !matriz[1].equals("")){
            if(matriz[5].equals(matriz[9])){
                ganhador(matriz[1]);
                return;
            }
        }

        if(matriz[2].equals(matriz[5]) && !matriz[2].equals("")){
            if(matriz[5].equals(matriz[8])){
                ganhador(matriz[2]);
                return;
            }
        }

        if(matriz[3].equals(matriz[6]) && !matriz[3].equals("")){
            if(matriz[6].equals(matriz[9])){
                ganhador(matriz[3]);
                return;
            }
        }else if(matriz[3].equals(matriz[5]) && !matriz[3].equals("")) {
            if (matriz[5].equals(matriz[7])) {
                ganhador(matriz[3]);
                return;
            }
        }

        if(matriz[4].equals(matriz[5]) && !matriz[4].equals("")){
            if(matriz[5].equals(matriz[6])){
                ganhador(matriz[4]);
                return;
            }
        }

        if(matriz[7].equals(matriz[8]) && !matriz[7].equals("")){
            if(matriz[8].equals(matriz[9])){
                ganhador(matriz[7]);
                return;
            }
        }

        if(jogadas == 9){
            ganhador("");
            return;
        }

    }

    private void ganhador(String win){
        AlertDialog.Builder builder = new AlertDialog.Builder(JogoDaVelha.this);
        builder.setTitle("Resultado");
        if(win.equals("")){
            builder.setMessage("Empate");
        }else{
            if(win.equals("X")){
                builder.setMessage("\"X\" é o Vencedor");
            }else{
                builder.setMessage("\"O\" é o Vencedor");
            }
        }

        builder.setPositiveButton("Novo jogo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                jogadas = 0;
                for (int x=1;x<10;x++){
                    matriz[x] = "";
                }
                getButton();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}

