package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Registrar extends AppCompatActivity implements View.OnClickListener {
    Button btnRegistar0,btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        btnRegistar0 = (Button)findViewById(R.id.btnRegistar0);
        btnCancelar = (Button)findViewById(R.id.btnCancelar0);
        btnRegistar0.setOnClickListener(this);
        btnCancelar.setOnClickListener(this);
    }

   // @Override
    public void onClick(View view) {
        if(view == btnRegistar0){
                Intent intent = new Intent(Registrar.this,MainActivity.class);
                startActivity(intent);
            Toast.makeText(this, "Usuario Creado Con Exito " , Toast.LENGTH_SHORT).show();
        }
        if(view == btnCancelar){
            Intent intent = new Intent(Registrar.this,LoginActivity.class);
            startActivity(intent);
        }
    }
}