package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Resultado;
    float num = 0.0f;
    float num2 = 0.0f;
    String operacion = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resultado = findViewById(R.id.Resultado);

    }

    public void Escribe1(View view) {
        num = Float.parseFloat(Resultado.getText().toString());
        if (num == 0.0f){
            Resultado.setText("1");
        }else{
            Resultado.setText(Resultado.getText() + "1");
        }

    }

    public void Escribe2(View view) {
        num = Float.parseFloat(Resultado.getText().toString());
        if (num == 0.0f){
            Resultado.setText("2");
        }else{
            Resultado.setText(Resultado.getText() + "2");
        }
    }

    public void Escribe3(View view) {
        num = Float.parseFloat(Resultado.getText().toString());
        if (num == 0.0f){
            Resultado.setText("3");
        }else{
            Resultado.setText(Resultado.getText() + "3");
        }
    }

    public void Escribe4(View view) {
        num = Float.parseFloat(Resultado.getText().toString());
        if (num == 0.0f){
            Resultado.setText("4");
        }else{
            Resultado.setText(Resultado.getText() + "4");
        }
    }

    public void Escribe5(View view) {
        num = Float.parseFloat(Resultado.getText().toString());
        if (num == 0.0f){
            Resultado.setText("5");
        }else{
            Resultado.setText(Resultado.getText() + "5");
        }
    }

    public void Escribe6(View view) {
        num = Float.parseFloat(Resultado.getText().toString());
        if (num == 0.0f){
            Resultado.setText("6");
        }else{
            Resultado.setText(Resultado.getText() + "6");
        }
    }

    public void Escribe7(View view) {
        num = Float.parseFloat(Resultado.getText().toString());
        if (num == 0.0f){
            Resultado.setText("7");
        }else{
            Resultado.setText(Resultado.getText() + "7");
        }
    }
    public void Escribe8(View view) {
        num = Float.parseFloat(Resultado.getText().toString());
        if (num == 0.0f){
            Resultado.setText("8");
        }else{
            Resultado.setText(Resultado.getText() + "8");
        }
    }
    public void Escribe9(View view) {
        num = Float.parseFloat(Resultado.getText().toString());
        if (num == 0.0f){
            Resultado.setText("9");
        }else{
            Resultado.setText(Resultado.getText() + "9");
        }
    }
    public void EscribeCero(View view) {
        num = Float.parseFloat(Resultado.getText().toString());
        if (num == 0.0f){
            Resultado.setText("0");
        }else{
            Resultado.setText(Resultado.getText() + "0");
        }
    }

    public void LimpiarResultado(View view) {
        Resultado.setText("0");
        num = 0.0f;
        num2 = 0.0f;
        operacion = "";
    }

    public void EscribeIgual(View view) {

    }
}