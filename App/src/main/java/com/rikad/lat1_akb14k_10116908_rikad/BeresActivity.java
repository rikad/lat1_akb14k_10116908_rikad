package com.rikad.lat1_akb14k_10116908_rikad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class BeresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_beres);

        Intent intent = getIntent();
        String nama = intent.getStringExtra(FormActivity.NAMA);
        String umur = intent.getStringExtra(FormActivity.UMUR);
        TextView textView = findViewById(R.id.textView);
        textView.setText("Beres! Sekarang "+ nama +"\nudah bisa ngecek\npenggunaan HP mu\ntiap hari buat bantu "+ nama +"\n ngatur waktu :)");

    }
}
