package com.example.expractica;
import com.example.expractica.SecondActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitulo;
    private EditText etNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitulo = findViewById(R.id.tvTitulo);
        etNombre = findViewById(R.id.etNombre);
        btnAceptar = findViewById(R.id.btnAceptar);

        tvTitulo.setText("Bienvenido a la App");

        btnAceptar.setOnClickListener(v -> {
            String nombreIngresado = etNombre.getText().toString();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("nombre", nombreIngresado);
            startActivity(intent);
        });
    }
}
