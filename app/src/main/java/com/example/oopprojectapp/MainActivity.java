package com.example.oopprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button chapora = (Button) findViewById(R.id.chapore);
        Button mandren = (Button) findViewById(R.id.mandrem);
        Button morjim = (Button) findViewById(R.id.morjim);
        Button anjuna = (Button) findViewById(R.id.anjuna);
        Button bog = (Button) findViewById(R.id.bog);

        chapora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Chapora.class);
                startActivity(intent);
            }
        });
        mandren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Mandren.class);
                startActivity(intent);
            }
        });
        morjim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Morjim.class);
                startActivity(intent);
            }
        });
        anjuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Anjuna.class);
                startActivity(intent);
            }
        });
        bog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Bog.class);
                startActivity(intent);
            }
        });
    }
}