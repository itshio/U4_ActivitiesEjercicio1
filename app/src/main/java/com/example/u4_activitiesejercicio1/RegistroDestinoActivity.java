package com.example.u4_activitiesejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegistroDestinoActivity extends AppCompatActivity {

    TextView tvRegistroValores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_destino);

        tvRegistroValores = (TextView)findViewById(R.id.tvRegistroValores);

        //Con el objeto Bundle recogemos los extras que pueda tener
        Bundle b = getIntent().getExtras();
        //Comprobamos que el bundle no venga null es decir que no venga vacio.
        if(b!=null){

            //Obtenemos cada valor enviado haciendo uso de la etiqueta que le creamos.
            String usuario = b.getString(RegistroActivity.EXTRA_USUARIO);
            String password = b.getString(RegistroActivity.EXTRA_PASSWORD);
            String email = b.getString(RegistroActivity.EXTRA_EMAIL);

            //dIBUjamos en el textView
            tvRegistroValores.setText("USUARIO: "+usuario+"\nPASSWORD: "+password+"\nEMAIL: "+email);

        }
    }

    public void volverInicio(View v){

        //Volvemos a inicio
        Intent i=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
