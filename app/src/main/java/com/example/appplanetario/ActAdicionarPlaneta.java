package com.example.appplanetario;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class ActAdicionarPlaneta extends AppCompatActivity {
    private String tipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_adicionarplaneta);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow);
        tipo = "Entidade";
        tipo = (String) getIntent().getSerializableExtra("tipo");
        System.out.println(tipo);
        toolbar.setTitle("Adicionar " + tipo);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
    public void clickBtnAdicionarPlaneta(View view){
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setMessage("Planeta Adicionado");
        dlg.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent it = new Intent(ActAdicionarPlaneta.this, Act_Inicio.class);
                startActivity(it);
                finish();
            }
        });
        dlg.show();
    }
}
