package com.example.pontosturisticosjaponeses;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaTokyo extends FragmentActivity implements OnMapReadyCallback {

    private ImageButton btnVoltarMapaTokyo;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_tokyo);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        btnVoltarMapaTokyo = findViewById(R.id.btn_voltar_mapa_tokyo);

        btnVoltarMapaTokyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirVoltarMapaTokyo();
            }
        });
    }

    private void abrirVoltarMapaTokyo() {
        Intent janelaVoltarMapaTokyo = new Intent(this, MainActivity.class);
        startActivity(janelaVoltarMapaTokyo);
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
        LatLng tokyo = new LatLng(35.69360270221237, 139.74450943357866);
        mMap.addMarker(new MarkerOptions().position(tokyo).title("Tokyo, próximo ao Santuário Yasukuni").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tokyo, 10));
    }
}