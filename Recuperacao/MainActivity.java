package com.example.recuperacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtNome, txtTelefone, txtEmail, txtQuestionario;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txt_nome);
        txtTelefone = findViewById(R.id.txt_telefone);
        txtEmail = findViewById(R.id.txt_email);
        txtQuestionario = findViewById(R.id.txt_questionario);
        enviar = findViewById(R.id.enviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent janelaActivity1 = new Intent(MainActivity.this, Activity2.class);
                janelaActivity1.putExtra("passarNome", txtNome.getText().toString());
                janelaActivity1.putExtra("passarTelefone", txtTelefone.getText().toString());
                janelaActivity1.putExtra("passarEmail", txtEmail.getText().toString());
                janelaActivity1.putExtra("passarQuestionario", txtQuestionario.getText().toString());
                startActivity(janelaActivity1);
            }
        });
    }
}