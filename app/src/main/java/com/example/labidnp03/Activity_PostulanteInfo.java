package com.example.labidnp03;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_PostulanteInfo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_info);

        Button btnBuscar = findViewById(R.id.btnBuscar);
        EditText edtBuscar = findViewById(R.id.edtBuscar);
        TextView info = findViewById(R.id.info);
        List<Postulante> list = (List<Postulante>) getIntent().getSerializableExtra("lista");
        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Postulante p: list) {
                    if(p.getNombres().equalsIgnoreCase(edtBuscar.getText().toString())) {
                        info.setText(p.toString());
                    }
                }

            }
        });
    }
}
