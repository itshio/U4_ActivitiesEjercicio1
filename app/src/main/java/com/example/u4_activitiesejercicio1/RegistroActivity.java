package com.example.u4_activitiesejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    /*
        Vamos a utilizar variables static final para crear String que guarden el nombre de
        las etiquetas que neceistaremos para enviar nuestros datos.
        Esto no es más que una "etiqueta" que pasaremos junto al valor para porder ser identificada.
     */
    static final String EXTRA_USUARIO ="USUARIO";
    static final String EXTRA_PASSWORD ="PASSWORD";
    static final String EXTRA_EMAIL ="EMAIL";

    EditText etUsuario, etPassword, etRepitePassword, etEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        etUsuario = (EditText)findViewById(R.id.etRegistroUsuario);
        etPassword = (EditText)findViewById(R.id.etRegistroPassword);
        etRepitePassword = (EditText)findViewById(R.id.etRegistroPassword2);
        etEmail = (EditText)findViewById(R.id.etRegistroEmail);
    }

    public void btnAceptarRegistro(View v){

        String usuario = etUsuario.getText().toString();
        String password = etPassword.getText().toString();
        String password2= etRepitePassword.getText().toString();
        String email = etEmail.getText().toString();

        //Comprobamos si algun valor del formulario está vacio
        if(usuario.equals("") || password.equals("") || password2.equals("") || email.equals("")){
            Toast.makeText(getApplicationContext(),"Debes de rellenar todos los datos del formulario de registro",
                    Toast.LENGTH_LONG).show();
        }else{

            //Si no está vacio nada, comprobamos que las dos contraseñas coincidan
            if(password.equals(password2)){
                //Si tod0 está relleno y coinciden las contraseñas lanzamos el intent
                Intent i=new Intent(getApplicationContext(), RegistroDestinoActivity.class);
                //Este Intent va a llevar consigo varios extras, que enviamos con una clave
                // para que sean identificados. La forma para enviar es con el putExtra(ETIQUETA, VALOR)
                i.putExtra(EXTRA_USUARIO,usuario);
                i.putExtra(EXTRA_PASSWORD,password);
                i.putExtra(EXTRA_EMAIL,email);
                //Lanzamos el activity
                startActivity(i);

            }else{
                Toast.makeText(getApplicationContext(),"Las contraseñas deben de coincidir",
                        Toast.LENGTH_LONG).show();
            }
        }

    }
}
