package com.example.labidnp03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Activity_PostulanteRegistro extends AppCompatActivity {
    private static String TAG = "Activity_PostulanteRegistro";
    private List<Postulante> postulanteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulante_registro);

        EditText edtNombres = findViewById(R.id.edtNombres);
        EditText edtApPaterno = findViewById(R.id.edtApPaterno);
        EditText edtApMaterno = findViewById(R.id.edtApMaterno);
        EditText edtFecha = findViewById(R.id.edtFecha);
        EditText edtColegio = findViewById(R.id.edtColegio);
        EditText edtCarrera = findViewById(R.id.edtCarrera);
        Button btnRegistrar = findViewById(R.id.btnRegistrar);
        Button btnVerInscrito = findViewById(R.id.btnVerInscrito);

        postulanteList = new ArrayList<>();

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Postulante p = new Postulante();
                p.setApellido_paterno(edtApMaterno.getText().toString());
                p.setApellido_materno(edtApPaterno.getText().toString());
                p.setNombres(edtNombres.getText().toString());
                p.setFecha_nacimiento(edtFecha.getText().toString());
                p.setColegio(edtColegio.getText().toString());
                p.setCarrera(edtCarrera.getText().toString());

                postulanteList.add(p);

                Log.d(TAG, p.toString());
                Intent intent = new Intent(Activity_PostulanteRegistro.this, Activity_Menu.class);
                intent.putExtra("postulantes", (Serializable) postulanteList);
                startActivity(intent);
            }
        });

        btnVerInscrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (Postulante p : postulanteList) {
                    Log.d(TAG, p.toString());
                }
            }
        });
    }
}