package com.example.expractica;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvCardTitle, tvCardSubtitle;
    private ImageView ivCard;
    private Button btnInicio, btnCuvalles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvCardTitle = findViewById(R.id.tvCardTitle);
        tvCardSubtitle = findViewById(R.id.tvCardSubtitle);
        ivCard = findViewById(R.id.ivCard);
        btnInicio = findViewById(R.id.btnInicio);
        btnCuvalles = findViewById(R.id.btnCuvalles);

        String nombre = getIntent().getStringExtra("nombre");
        tvCardTitle.setText("Hola, " + nombre);
        tvCardSubtitle.setText("Bienvenido a tu segunda pantalla");

        btnInicio.setOnClickListener(v -> finish());

        btnCuvalles.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cuvalles.udg.mx"));
            startActivity(intent);
        });
    }
}
