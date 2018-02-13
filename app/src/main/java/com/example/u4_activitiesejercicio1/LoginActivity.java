package com.example.u4_activitiesejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    static final String EXTRA_EMAIL="EMAIL";
    static final String EXTRA_PASSWORD="PASSWORD";
    EditText etPassword, etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etPassword = (EditText)findViewById(R.id.etLoginPassword);
        etEmail = (EditText)findViewById(R.id.etLoginEmail);


    }



    public void btnAceptarLogin(View v){
        //Recogemos los valores de las cajas
        String password = etPassword.getText().toString();
        String email = etEmail.getText().toString();

        //Si están vacias las cajas saltará el TOast avisando.
        if(password.equals("") || email.equals("")){
            Toast.makeText(getApplicationContext(),"Debes de rellenar los campos",
                    Toast.LENGTH_LONG).show();
        }else{
            //Si están rellenas las cajas, lanzamos el intent
            Intent i=new Intent(getApplicationContext(), LoginDestinoActivity.class);
            //enviamos los dos extras con su etiqueta y valor.
            i.putExtra(EXTRA_EMAIL, email);
            i.putExtra(EXTRA_PASSWORD, password);
            //iniciamos el intent
            startActivity(i);
        }

    }
}
