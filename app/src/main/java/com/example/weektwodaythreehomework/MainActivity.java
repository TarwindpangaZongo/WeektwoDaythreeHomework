package com.example.weektwodaythreehomework;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView tvLocal;
    TextView tvFrench;
    TextView tvSpanish;
    TextView tvJapanese;
    TextView tvKorean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLocal = findViewById(R.id.tvLocal);
        tvFrench = findViewById((R.id.tvFr));
        tvSpanish = findViewById(R.id.tvEs);
        tvJapanese = findViewById(R.id.tvJa);
        tvKorean = findViewById(R.id.tvKo);




    }
}
