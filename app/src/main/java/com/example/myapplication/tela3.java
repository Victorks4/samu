package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tela3 extends AppCompatActivity {
private WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        w1 = findViewById(R.id.w1);
        Intent intent = getIntent();
        String tutorial = intent.getStringExtra("tutorial");
        if (tutorial != null) {
            switch (tutorial) {
                case "rcp":
                    w1.loadUrl("https://youtu.be/nCNJOOyMbVM?feature=shared");
                    break;
                case "hemorragia":
                  w1.loadUrl("https://youtu.be/2IEJyLwoxpw?feature=shared");
                    startActivity(intent);
                    break;
                case "engasgo":
                    w1.loadUrl("https://youtu.be/5kyyABzEy_k?feature=shared");
                    break;
                default:

                    break;
            }
        }
    }

}