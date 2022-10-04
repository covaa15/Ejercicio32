package com.example.ejercicio1bis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
/*
Crea un proyecto llamado Ejercicio 1bis en  Android  Studio que  en  su activity_main tenga
un TextView-con el texto “Texto”-, un ImageViewque    muestre    una imagen .png situada en /res/drawable,
y  un  botón  con  el título  “Prueba”.  Genera  en  el MainActivity un     listener     para onClick()que
inicialmente   solo tenga   un   toast  que   muestre   el mensaje “botón de prueba”. Usa /res/valuespara
crear  un  archivo strings.xml donde crees las cadenas  “Prueba”  y  “Texto”. Muestra  el
resultado  de  todo  ello con imágenes de la pantalla.
 */