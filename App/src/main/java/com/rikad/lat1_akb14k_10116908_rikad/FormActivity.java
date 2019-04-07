package com.rikad.lat1_akb14k_10116908_rikad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    public static final String NAMA = "com.rikad.monitory.NAMA";
    public static final String UMUR = "com.rikad.monitory.UMUR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_form);

        Button btnInput = findViewById(R.id.btnInput);
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputData(view);
            }
        });
    }

    public void inputData(View view) {
        Intent intent = new Intent(this, BeresActivity.class);
        EditText nama = findViewById(R.id.inpNama);
        EditText umur = findViewById(R.id.inpUmur);
        intent.putExtra(NAMA, nama.getText().toString());
        intent.putExtra(UMUR, umur.getText().toString());
        startActivity(intent);
    }
}
