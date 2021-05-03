package com.daniel.adopcion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class RecibirMascota extends AppCompatActivity {

    Spinner MASCOTA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_mascota);

        MASCOTA = (Spinner)findViewById(R.id.MASCOTA);

    }
    public void MostrarMascota(View v)
    {

        String Opcion = MASCOTA.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(), "usted selecciono la opcion..."+Opcion, Toast.LENGTH_LONG).show();

    }
}