package com.example.extrela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Button retornar = findViewById(R.id.btnRetornar);
        retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarHome();
            }
        });

        Button adiante = (Button)  findViewById(R.id.btnNotas);
        adiante.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent it = new Intent(Tela2.this, MostraNotas.class );

        EditText nota1 = (EditText) findViewById(R.id.inputNota1);
        EditText nota2 = (EditText) findViewById(R.id.inputNota2);
        EditText nota3 = (EditText) findViewById(R.id.inputNota3);

        Bundle params = new Bundle();

        params.putString("nota1",nota1.getText().toString());
        params.putString("nota2",nota2.getText().toString());
        params.putString("nota3",nota3.getText().toString());
        double valorNota1 = 0;
        double valorNota2 = 0;
        double valorNota3 = 0;
        double media = 0;
        String situation ="";

        valorNota1 = Integer.parseInt(nota1.getText().toString());
        valorNota2 = Integer.parseInt(nota2.getText().toString());
        valorNota3 = Integer.parseInt(nota3.getText().toString());
        media = (valorNota1 + valorNota2 + valorNota3) /3;

        params.putString("media",String.valueOf(media));

        if(media >= 7){
            situation = "Aprovado";
        } else {
            situation = "Reprovado";
        }

        params.putString("situation", situation);

        it.putExtras(params);
        startActivity(it);
    }
    public void voltarHome() {
        Intent it = new Intent(Tela2.this, MainActivity.class );
        startActivity(it);
    }

}