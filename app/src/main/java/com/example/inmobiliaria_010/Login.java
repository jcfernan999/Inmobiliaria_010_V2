package com.example.inmobiliaria_010;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private  EditText editarTextEmail;
    private  EditText editarTextClave;
    private  Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editarTextEmail = findViewById(R.id.emailL);
        editarTextClave = findViewById(R.id.claveL);
        btnLogin = findViewById(R.id.btnLogin);
        editarTextEmail.addTextChangedListener(activar);
        editarTextClave.addTextChangedListener(activar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailInput = editarTextEmail.getText().toString().trim();
                String claveInput = editarTextClave.getText().toString().trim();
                if(emailInput.equals("jcf@gmail.com")&& claveInput.equals("12345")) {
                    String nombre = "Juan Carlos";
                    String apellido = "Fernandez";
                    Intent principal = new Intent(Login.this, Principal.class);
                    principal.putExtra("nombre", nombre);
                    principal.putExtra("apellido", apellido);
                    Login.this.startActivity(principal);
                    Login.this.finish();
                }else{
                    AlertDialog.Builder alerta = new AlertDialog.Builder(Login.this);
                    alerta.setMessage("Email, Comtraseña Incorepto")
                            .setNegativeButton("Reintentar", null)
                            .create()
                            .show();
                }
            }
        });
    }

    private TextWatcher activar = new TextWatcher(){
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String emailInput = editarTextEmail.getText().toString().trim();
            String claveInput = editarTextClave.getText().toString().trim();
            String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

            if (!emailInput.matches(emailPattern)){
                editarTextEmail.setTextColor(Color.rgb(255,66,26));
            }
            else{
                editarTextEmail.setTextColor(Color.rgb(33,66,26));

            }
            if(claveInput.length()<5){
                editarTextClave.setTextColor(Color.rgb(255,66,26));

            }
            else{
                editarTextClave.setTextColor(Color.rgb(33,66,26));
            }
            if(claveInput.length() >= 5 && emailInput.matches(emailPattern)){
                btnLogin.setEnabled(true);
            }
            else{ btnLogin.setEnabled(false);}
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}