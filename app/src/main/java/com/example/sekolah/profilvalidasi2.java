package com.example.sekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profilvalidasi2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilvalidasi2);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(profilvalidasi2.this, suksesvalid.class);
        startActivity(intent);
    }
}