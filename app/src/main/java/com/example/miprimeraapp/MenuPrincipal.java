package com.example.miprimeraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Intent intent = getIntent();
        String miusuario = intent.getStringExtra("usuarioNombre");
        TextView miTexto = findViewById(R.id.txtMensaje);
        miTexto.setText(miusuario);
    }


}