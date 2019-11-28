package com.example.suma;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/*
 * Ejercicio: implementar el metodo afterTextChanged para que:
 *      # Muestre en el TextView suma_result el resultado de los valores introducidos en los
 *        EditText suma_n1 y suma_n2
 *      # En caso de que no se pueda efectuar la suma (p. ej. falte un operando), deberá mostrar
 *        el texto 'NaN'
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText suma_n1 = findViewById(R.id.suma_n1);
        final EditText suma_n2 = findViewById(R.id.suma_n2);
        final TextView suma_result = findViewById(R.id.suma_result);
        TextWatcher listener = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                /*
                 * SOLUCIÓN: rellenar por el alumno
                 */







                /*
                 * FIN SOLUCIÓN
                 */
            }
        };
        suma_n1.addTextChangedListener(listener);
        suma_n2.addTextChangedListener(listener);
    }
}
