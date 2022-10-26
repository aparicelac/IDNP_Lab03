package com.example.labidnp03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Activity_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button btnNuevo = findViewById(R.id.btnNuevo);
        List<Postulante> list;
        Intent intent = getIntent();
        list = (List<Postulante>) intent.getSerializableExtra("postulantes");

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_PostulanteRegistro.class);
                startActivity(intent);

            }
        });
        Button btnInfoPostu = findViewById(R.id.btnInfoPostu);
        btnInfoPostu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_PostulanteInfo.class);//Cambiar el Activity_PostulanteRegistro.class por la clase nueva
                intent.putExtra("lista", (Serializable) list);
                startActivity(intent);
            }
        });
    }
}
