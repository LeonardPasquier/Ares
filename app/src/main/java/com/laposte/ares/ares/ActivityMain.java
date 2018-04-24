package com.laposte.ares.ares;

/**
 * Created by PECH652 on 27/03/2018.
 */

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityMain extends Activity {

    Button valider;
    EditText login;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        login =(EditText)findViewById(R.id.Login);
        password =(EditText)findViewById(R.id.Password);
        valider =(Button)findViewById(R.id.valider);
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(password.getText()).equals("byToto") && String.valueOf(login.getText()).equals("Africa")){
                    Intent intent = new Intent(ActivityMain.this, Projetsv2.class);
                    startActivity(intent);
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Le login ou le mot de passe est incorrect.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }

}