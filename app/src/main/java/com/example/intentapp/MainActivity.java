package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextNama;
    Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNama = findViewById(R.id.editTextNama);
        btnKirim = findViewById(R.id.btnKirim);

        btnKirim.setOnClickListener(v -> {
            String nama = editTextNama.getText().toString();

            // Membuat Intent eksplisit untuk berpindah ke SecondActivity
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("nama_pengguna", nama); // Mengirim data
            startActivity(intent);
        });
    }
}
