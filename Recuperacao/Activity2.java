package com.example.recuperacao;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Activity2 extends FragmentActivity implements OnMapReadyCallback {

    private Button btnVoltar;
    private GoogleMap mMap;
    private TextView resposta, oi, recado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        btnVoltar = findViewById(R.id.btn_voltar);

        resposta = findViewById(R.id.resposta);
        oi = findViewById(R.id.oi);
        recado = findViewById(R.id.recado);


        String nome = getIntent().getStringExtra("passarNome");
        String telefone = getIntent().getStringExtra("passarTelefone");
        String email = getIntent().getStringExtra("passarNome");
        String questionario = getIntent().getStringExtra("passarQuestionario");
        oi.setText("Oi " + nome + "!");
        resposta.setText("Seu telefone é: " + telefone
        + "\nSeu email é: " + email
        + "\nPrazer mostre a sua casa");
        recado.setText("Recado que você deixou:\n" + questionario);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent janelaVoltar = new Intent(Activity2.this, MainActivity.class);
                startActivity(janelaVoltar);
            }
        });

    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng qi = new LatLng(-29.904009169644663, -51.17815845884736);
        mMap.addMarker(new MarkerOptions().position(qi).title("Marcador na QI").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(qi, 10));
    }
}