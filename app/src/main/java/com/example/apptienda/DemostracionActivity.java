package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class DemostracionActivity extends AppCompatActivity implements View.OnClickListener {

    VideoView video1;
    Button btn_1,btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demostracion);

        video1=(VideoView)findViewById(R.id.Video1);
        btn_1=(Button)findViewById(R.id.btnOmitir);
        btn_1.setOnClickListener(this);

        String path=("android.resource://" + getPackageName() + "/" + R.raw.demo);
        video1.setVideoURI(Uri.parse(path));
        video1.start();


    }

    @Override
    public void onClick(View view) {
        if(view == btn_1){
            Intent intent = new Intent(DemostracionActivity.this,MainActivity.class);
            startActivity(intent);
        }

    }
}