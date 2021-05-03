package com.daniel.adopcion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class IngresoMascota extends AppCompatActivity {

    EditText textocajon, numero_cajon;
    CheckBox chk1,chk2,chk3;
    RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_mascota);

        textocajon = (EditText)findViewById(R.id.editTextTextPersonName2);
        numero_cajon = (EditText)findViewById(R.id.editTextNumber);

        chk1 = (CheckBox)findViewById(R.id.chk1);
        chk2 = (CheckBox)findViewById(R.id.chk2);
        chk3 = (CheckBox)findViewById(R.id.chk3);

        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);

        rb2.setChecked(true);

    }


    public void EnviarDatos(View v)
    {

        Intent I = new Intent(getApplicationContext(),RecibirMascota.class);
        startActivity(I);
        }
}