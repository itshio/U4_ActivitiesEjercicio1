package com.example.u4_activitiesejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo onclick del botón LOGIN que nos enviará al: LoginActivity
    public void btnIrLogin(View v){
        //Objeto Intent que me permite ir desde el activity actual (getApplicationContext()) hasta
        //el activity de destino, en este caso: LoginActivity (no olvidamos usar el .class al final)
        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        //Metodo startActivity() que recibe por parametro el intent creado para lanzar el cambio de
        // activity.
        startActivity(i);
    }

    //Metodo onclick del botón REGISTRO que nos enviará al: RegistroActivity
    public void btnIrRegistro(View v){
        //Objeto Intent que me permite ir desde el activity actual (getApplicationContext()) hasta
        //el activity de destino, en este caso: RegistroActivity (no olvidamos usar el .class al final)
        Intent i = new Intent(getApplicationContext(), RegistroActivity.class);
        //Metodo startActivity() que recibe por parametro el intent creado para lanzar el cambio de
        // activity.
        startActivity(i);
    }
}
