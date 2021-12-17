package com.example.extrela;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MostraNotas extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        TextView textMensagem1 = (TextView) findViewById(R.id.nota1);
        Intent it = getIntent();
        if(it != null) {
            Bundle params = it.getExtras();
            if(params != null){
                textMensagem1.setText(params.getString("nota1"));
            }
        }

        TextView textMensagem2 = (TextView) findViewById(R.id.nota2);
        it = getIntent();
        if(it != null) {
            Bundle params = it.getExtras();
            if(params != null){
                textMensagem2.setText(params.getString("nota2"));
            }
        }

        TextView textMensagem3 = (TextView) findViewById(R.id.nota3);
        it = getIntent();
        if(it != null) {
            Bundle params = it.getExtras();
            if(params != null){
                textMensagem3.setText(params.getString("nota3"));
            }
        }

        TextView textMensagem4 = (TextView) findViewById(R.id.media);
        it = getIntent();
        if(it != null) {
            Bundle params = it.getExtras();
            if(params != null){
                textMensagem4.setText(params.getString("media"));
            }
        }

        TextView textMensagem5 = (TextView) findViewById(R.id.situation);
        it = getIntent();
        if(it != null) {
            Bundle params = it.getExtras();
            if(params != null){
                textMensagem5.setText(params.getString("situation"));
            }
        }

        Button btnCadastrar = (Button)  findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent it = new Intent(MostraNotas.this,MainActivity.class );
        startActivity(it);
    }

}