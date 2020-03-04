package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Accueil extends AppCompatActivity {

    Button btnajout;
    Button btnaffiche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        btnajout=(Button)findViewById(R.id.btnajout);
        btnajout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Accueil.this,Ajout.class);
                startActivity(intent);
                Toast t=Toast.makeText(getApplicationContext(),"bonjour ajouter",Toast.LENGTH_LONG);
                t.show();
            }
        });
        btnaffiche=(Button)findViewById(R.id.btnaff);
        btnaffiche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Accueil.this,Affichage.class);
                startActivity(intent);
                Toast t=Toast.makeText(getApplicationContext(),"bonjour affichage",Toast.LENGTH_LONG);
                t.show();

            }
        });

    }


}
