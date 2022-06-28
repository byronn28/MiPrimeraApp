package com.example.miprimeraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button miBotonIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miBotonIngresar=findViewById(R.id.btnIniciar);
        iniciaControl();
    }

    private void iniciaControl(){
        miBotonIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText miTxtUsuario=findViewById(R.id.txtEmail);
                String usuario = miTxtUsuario.getText().toString();
                Intent intent = new Intent(getApplicationContext(),MenuPrincipal.class);
                intent.putExtra("usuarioNombre",usuario);
                startActivity(intent);
            }
        });
    }
}