package com.example.labidnp03;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtUsuario = findViewById(R.id.edtUsuario);
        EditText edtPassword = findViewById(R.id.edtPassword);
        TextView txtMensaje = findViewById(R.id.txtMensaje);
        Button btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = edtUsuario.getText().toString();
                String password = edtPassword.getText().toString();

                if (usuario.equals("test") && password.equals("1234")) {
                    txtMensaje.setText("Correcto//Abrir Activity_Menu");

                    Button btnLogin = findViewById(R.id.btnIngresar);

                    btnLogin.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(getApplicationContext(), Activity_Menu.class);
                            startActivity(intent);
                        }
                    });


                } else {
                    txtMensaje.setText("Incorrecto");
                }
            }
        });

    }
}