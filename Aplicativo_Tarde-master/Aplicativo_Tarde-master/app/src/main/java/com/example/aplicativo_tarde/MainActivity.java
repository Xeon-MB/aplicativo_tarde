package com.example.aplicativo_tarde;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);
        botao = findViewById(R.id.botaoSoma);

        botao.setOnClickListener(v -> {

            String texto1 = num1.getText().toString().trim();
            String texto2 = num2.getText().toString().trim();

            if (texto1.isEmpty() || texto2.isEmpty()) {
                resultado.setText("Preencha os dois campos!");
                return;
            }

            try {
                double n1 = Double.parseDouble(texto1);
                double n2 = Double.parseDouble(texto2);

                double soma = n1 + n2;

                resultado.setText("Resultado: " + soma);

            } catch (NumberFormatException e) {
                resultado.setText("Digite apenas números válidos!");
            }
        });
    }
}