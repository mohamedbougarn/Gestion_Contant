package com.example.gestioncontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btbval_auth;
    Button btbexit_auth;
    EditText edlog_auth;
    EditText edpsw_auth;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//de metre fichier xml dans l'ecran

        edlog_auth=(EditText)findViewById(R.id.edt_auth_login);
        edpsw_auth=(EditText)findViewById(R.id.edt_auth_psw);
        btbval_auth=(Button)findViewById(R.id.btn_valid_auth);
        btbexit_auth=(Button)findViewById(R.id.btn_exit_auth);



/*
        btbval_auth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=new Toast.makeText(getApplicationContext(),"boutton valider ",Toast.LENGTH_SHORT,1.0);
                toast.show();
            }
        });

*/


    //ecouteur action
        btbval_auth.setOnClickListener(this);
       // btbexit_auth.setOnClickListener(this);



    }
    @Override
    public void onClick(View v)
    {
        if (v==btbexit_auth)
        {
            this.finish();
        }
        if (v==btbval_auth)
        {
            Toast.makeText(this, "valider 1", Toast.LENGTH_SHORT).show();

            Toast t=Toast.makeText(getApplicationContext(),"valider 2",Toast.LENGTH_LONG);
            t.show();
            String nom=edlog_auth.getText().toString();
            String mpw=edpsw_auth.getText().toString();
            if (nom.equalsIgnoreCase("poly")&&(mpw.equals("123")))
            {
                //lencer lapplication
                Intent i= new Intent(MainActivity.this,Accueil.class);
                this.startActivity(i);//pour lence l'lactiviter
            }
        }
    }
}
