package com.daniel.adopcion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ventana_confirmacion extends AppCompatActivity {

    TextView tv_nombres, tv_apellidopat, tv_apellidomat, tv_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_confirmacion);

        tv_nombres = (TextView)findViewById(R.id.edit_text_nombres);
        tv_apellidopat = (TextView)findViewById(R.id.edit_text_apellidop);
        tv_apellidomat= (TextView)findViewById(R.id.edit_text_apellidom);
        tv_email = (TextView)findViewById(R.id.edit_text_correo);

        String Nombress = getIntent().getStringExtra("NOMBRES");
        String apellidopatt = getIntent().getStringExtra("ApellidoP");
        String apellidomatt = getIntent().getStringExtra("ApellidoM");
        String emaill = getIntent().getStringExtra("Correo");
        tv_nombres.setText("UD ES:" + Nombress);
        tv_apellidopat.setText("su apellido paterno es:" + apellidopatt);
        tv_apellidomat.setText("su apellido materno es:" + apellidomatt);
        tv_email.setText("su correo es: " + emaill);

    }
}