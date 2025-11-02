package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textHalo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textHalo = findViewById(R.id.textHalo);

        // Menerima data dari Intent
        String nama = getIntent().getStringExtra("nama_pengguna");

        textHalo.setText("Halo, " + nama + "!");
    }
}
