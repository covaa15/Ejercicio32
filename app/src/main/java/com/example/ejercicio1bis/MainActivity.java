package com.example.ejercicio1bis;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String cad1;
    String[]saludos,idioma;
    Random aleatorio=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button prueba = findViewById(R.id.prueba);
        TextView texto=findViewById(R.id.texto);
        prueba.setOnClickListener(this::onClick);
        cad1=getString(R.string.cadena1);


        saludos=getResources().getStringArray(R.array.saludos);
        idioma=getResources().getStringArray(R.array.idioma);
        prueba.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int cambiar=aleatorio.nextInt(saludos.length);
                prueba.setText(idioma[cambiar]);
                texto.setText(saludos[cambiar]);
            }
        });
    }
   public void onClick (View v){

        Toast.makeText(this,cad1, Toast.LENGTH_SHORT).show();
       try {
           Thread.sleep(1500);//Utilizamos este paso para darles tiempo entre los distintos Toast ya que sino se solaparian
       } catch (InterruptedException e) {

       }
       Toast.makeText(this,"Has pulsado el botón prueba", Toast.LENGTH_SHORT).show();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
                inflater.inflate(R.menu.main_activity_menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case  R.id.menuitem1:
                Toast.makeText(this,"Has elegido la opcion 1",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuitem2:
                Toast.makeText(this,"Has elegido la opcion 2",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuitem3:
                Toast.makeText(this,"Has elegido la opcion 3",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    public void itemClick(MenuItem item){
        Toast.makeText(this,"He elegido el item",Toast.LENGTH_SHORT).show();
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
/*Un toast es un mensaje que se pasa por pantalla con la siguiente estructura:
    Toast.maketext(this,”Texto a enviar”, <tiempo en ms>).show();

    this :nos indica el contexto de la aplicación, esto es, en que activity o pantalla estamos en este momento

 */