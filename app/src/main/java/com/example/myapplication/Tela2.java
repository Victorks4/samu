package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Método chamado ao clicar no link "Como fazer RCP"
    public void abrirTutorialRCP(View view) {
        Intent intent = new Intent(getApplicationContext(),tela3.class);
        intent.putExtra("tutorial", "rcp");  // Passando o nome do tutorial
        startActivity(intent);
    }

    // Método chamado ao clicar no link "Como estancar hemorragias"
    public void abrirTutorialHemorragia(View view) {
        Intent intent = new Intent(getApplicationContext(),tela3.class);
        intent.putExtra("tutorial", "hemorragia");  // Passando o nome do tutorial
        startActivity(intent);
    }

    // Método chamado ao clicar no link "Como ajudar em caso de engasgo"
    public void abrirTutorialEngasgo(View view) {
        Intent intent = new Intent(getApplicationContext(), tela3.class);
        intent.putExtra("tutorial", "engasgo");  // Passando o nome do tutorial
        startActivity(intent);
    }
}