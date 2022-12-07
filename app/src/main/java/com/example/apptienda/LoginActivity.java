package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt1,edt2;
    Button btn5,btn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

            edt1 = (EditText)findViewById(R.id.edtUsuario);
            edt2 = (EditText)findViewById(R.id.edtPassword);
            btn5 = (Button)findViewById(R.id.btnIniciar);
            btn6 = (Button)findViewById(R.id.btnRegistrar);
            btn5.setOnClickListener(this);
            btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == btn5){
            if(edt1.getText().toString().equals("Jean") && edt2.getText().toString().equals("Pruebas")){
                Toast.makeText(this, "Bienvenido " + edt1.getText(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }else
                Toast.makeText(this, "Error de credenciales " + edt1.getText(), Toast.LENGTH_SHORT).show();
        }
        if(view == btn6){
            Intent intent = new Intent(LoginActivity.this,Registrar.class);
            startActivity(intent);

        }
    }
}