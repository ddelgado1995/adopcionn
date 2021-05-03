package com.daniel.adopcion;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {

    EditText Nombres;
    EditText ApellidoP;
    EditText ApellidoM;
    EditText Correo;
    EditText Contraseña;
    EditText RepContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        try {
            Nombres = (EditText)findViewById(R.id.edit_text_nombres);
            ApellidoP = (EditText)findViewById(R.id.edit_text_apellidop);
            ApellidoM = (EditText)findViewById(R.id.edit_text_apellidom);
            Correo = (EditText)findViewById(R.id.edit_text_correo);
            Contraseña = (EditText)findViewById(R.id.edit_text_contraseña);
            RepContraseña = (EditText)findViewById(R.id.edit_text_contraseña1);
        }catch(Exception e) {
            //Log.e("Error", "Debe ingresar información", e);
            System.out.println("Error" +e);
        }
    }

    public void EnviarInformacion(View v)
    {
        String name = Nombres.getText().toString();
        String apep = ApellidoP.getText().toString();
        String apem = ApellidoM.getText().toString();
        String email = Correo.getText().toString();
        String pass = Contraseña.getText().toString();
        String pass1 = RepContraseña.getText().toString();


        Intent I = new Intent(getApplicationContext(),ventana_confirmacion.class);
        I.putExtra("NOMBRES", name);
        I.putExtra("ApellidoP", apep);
        I.putExtra("ApellidoM", apem);
        I.putExtra("Correo",email);

        startActivity(I);

        Log.e("Error", "debe llenar los campos..." + Nombres);
        Log.e("Error", "debe llenar los campos..." + ApellidoP);
        Log.e("Error", "debe llenar los campos..." + ApellidoM);
        Log.e("Error", "debe llenar los campos..." + Correo);
        Log.e("Error", "debe llenar los campos..." + Contraseña);
        Log.e("Error", "debe llenar los campos..." + RepContraseña);
    }
    }
