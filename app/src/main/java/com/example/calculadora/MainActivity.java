package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultado;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonC, buttonIgual, buttonMas;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado = findViewById(R.id.Resultado);
        botones(button0, R.id.button0);
        botones(button1, R.id.button1);
        botones(button2, R.id.button2);
        botones(button3, R.id.button3);
        botones(button4, R.id.button4);
        botones(button5, R.id.button5);
        botones(button6, R.id.button6);
        botones(button7, R.id.button7);
        botones(button8, R.id.button8);
        botones(button9, R.id.button9);
        botones(buttonC, R.id.buttonC);
        botones(buttonIgual, R.id.buttonIgual);
        botones(buttonMas, R.id.buttonMas);
    }

    void botones(MaterialButton boton, int id) {
        boton = findViewById(id);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        boolean correcto;
        int num, num2, total;
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();
        MaterialButton button = (MaterialButton) view;
        String button_Text = button.getText().toString();
        String cadena = resultado.getText().toString();
        if (button_Text.equals("=")) {
            correcto = false;
            for (int i = 0; i < cadena.length(); i++) {
                if (String.valueOf(cadena.charAt(i)).equals("+")) {
                    correcto = true;
                } else if (!correcto) {
                    sum1.append(cadena.charAt(i));
                } else {
                    sum2.append(cadena.charAt(i));
                }
            }
            try {
                num = Integer.parseInt(sum1.toString());
                num2 = Integer.parseInt(sum2.toString());
                total = num + num2;
                cadena = String.valueOf(total);
            } catch (NumberFormatException e) {
                e.getMessage();
            }
            resultado.setText("");

        } else if (button_Text.equals("C")) {
            resultado.setText("");
            return;
        } else {
            cadena = cadena + button_Text;
            System.out.println(cadena);
        }
        resultado.setText(cadena);
    }
}