package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Comprar extends AppCompatActivity implements View.OnClickListener {

    Button btnCS,btnSC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprar);

        btnCS = (Button)findViewById(R.id.btnCS);
        btnSC = (Button) findViewById(R.id.btnSC);
        btnCS.setOnClickListener(this);
        btnSC.setOnClickListener(this);




    }


    @Override
    public void onClick(View view) {
        if(view == btnCS){
            Intent intent = new Intent(Comprar.this,LoginActivity.class);
            startActivity(intent);

        }
        if(view == btnSC){
            Intent intent = new Intent(Comprar.this,MainActivity.class);
            startActivity(intent);

        }
    }
}