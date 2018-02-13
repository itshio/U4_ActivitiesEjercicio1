package com.example.u4_activitiesejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginDestinoActivity extends AppCompatActivity {


    TextView tvLoginValores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_destino);
        tvLoginValores=(TextView)findViewById(R.id.tvLoginValores);

        //Con el objeto Bundle recogemos los extras que pueda tener
        Bundle b = getIntent().getExtras();
        //Comprobamos que el bundle no venga null es decir que no venga vacio.
        if(b!=null){
            //Obtenemos cada valor enviado haciendo uso de la etiqueta que le creamos.
            String password = b.getString(RegistroActivity.EXTRA_PASSWORD);
            String email = b.getString(LoginActivity.EXTRA_EMAIL);


           tvLoginValores.setText("PASSWORD: "+password+"\nEMAIL: "+email);

        }
    }

    public void volverInicio(View v){

        //Volvemos a inicio
        Intent i=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
