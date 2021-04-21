package com.example.pontosturisticosjaponeses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Danca extends AppCompatActivity implements SensorEventListener {
    private ImageButton btnVoltarDanca;
    private ImageView parada;
    private WebView dancando;
    private SensorManager sensorManager;
    private long ultimaAtualizacao;
    private boolean ativar = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danca);

        btnVoltarDanca = findViewById(R.id.btn_voltar_video);
        dancando = findViewById(R.id.dancando);
        parada = findViewById(R.id.parada);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        ultimaAtualizacao = System.currentTimeMillis();

        WebSettings gif = dancando.getSettings();
        gif.setJavaScriptEnabled(true);
        String caminho = "file:android_asset/dancando.gif";
        dancando.loadUrl(caminho);

        btnVoltarDanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarDanca();
            }
        });
    }

    private void abrirVoltarDanca() {
        Intent janelaVoltarDanca = new Intent(this, MainActivity.class);
        startActivity(janelaVoltarDanca);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            getAccelerometer(event);
        }

    }

    private void getAccelerometer(SensorEvent event) {
        float[] values = event.values;
        float x = values[0];
        float y = values[1];
        float z = values[2];

        float accelationSquareRoot = (x * x + y * y + z * z) /
                (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);

        long tempo = System.currentTimeMillis();

        if (accelationSquareRoot >= 2) {
            if (tempo - ultimaAtualizacao < 200) {
                return;
            }

            ultimaAtualizacao = tempo;
            if (ativar) {
                parada.setVisibility(ImageView.INVISIBLE);
                dancando.setVisibility(WebView.VISIBLE);
            } else {
                parada.setVisibility(ImageView.VISIBLE);
                dancando.setVisibility(WebView.INVISIBLE);
            }
            ativar = !ativar;
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}