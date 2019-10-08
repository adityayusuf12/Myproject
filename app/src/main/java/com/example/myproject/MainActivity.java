package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPersegiPanjang(View view) {
        Intent intent =new Intent(this, persegiPanjang.class);
        startActivity(intent);
    }

    public void buttonPersegi(View view) {
        Intent intent = new Intent(this, persegi.class);
        startActivity(intent);
    }
}
