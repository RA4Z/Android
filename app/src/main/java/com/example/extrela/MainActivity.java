package com.example.extrela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCadastrar = (Button)  findViewById(R.id.btnCadastrar);
        btnCadastrar.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent it = new Intent(MainActivity.this,Tela2.class );
        startActivity(it);
    }

}