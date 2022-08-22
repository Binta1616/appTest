package com.example.myapplication11;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication11.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity<ActivityMainBinding> extends AppCompatActivity {
    EditText typedossier,typepension,titrepension,nom,prenom,sexe,telephone,datenaissance,lieunaissance,
            prenompere,prenommere,nommere,referenceacte,matriculefonctionnaire,referenceacteconcession,
            lieupaimentpension,matriculetitredecujus,prenomdecujus,lieuparente,obsevation;
    Button b;
    Helper h=new Helper(MainActivity.this);
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        typedossier=findViewById(R.id.typedossier);
        typepension=findViewById(R.id.typepension);
        titrepension=findViewById(R.id.titrepension);
        nom=findViewById(R.id.nom);
        prenom=findViewById(R.id.prenom);
        sexe=findViewById(R.id.sexe);
        telephone=findViewById(R.id.telephone);
        datenaissance=findViewById(R.id.datenaissance);
        lieunaissance=findViewById(R.id.lieunaissance);
        prenompere=findViewById(R.id.prenompere);
        prenommere=findViewById(R.id.prenommere);
        nommere=findViewById(R.id.nommere);
        referenceacte=findViewById(R.id.referenceacte);
        matriculefonctionnaire=findViewById(R.id.matriculefonctionnaire);
        referenceacteconcession=findViewById(R.id.referenceacteconcession);
        lieupaimentpension=findViewById(R.id.lieupaimentpension);
        matriculetitredecujus=findViewById(R.id.matriculetitredecujus);
        prenomdecujus=findViewById(R.id.prenomdecujus);
        lieuparente=findViewById(R.id.lieuparente);
        obsevation=findViewById(R.id.obsevation);

        b=findViewById(R.id.add);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fonctionnaire f=new Fonctionnaire(typedossier.getText().toString(),
                        typepension.getText().toString(),titrepension.getText().toString(),
                        nom.getText().toString(),prenom.getText().toString(),
                        sexe.getText().toString(),telephone.getText().toString(),datenaissance.getText().toString(),lieunaissance.getText().toString(),
                        prenompere.getText().toString(),prenommere.getText().toString(),nommere.getText().toString(),
                        referenceacte.getText().toString(),matriculefonctionnaire.getText().toString(),referenceacteconcession.getText().toString(),
                        referenceacteconcession.getText().toString(),lieupaimentpension.getText().toString(),
                        matriculetitredecujus.getText().toString(),prenomdecujus.getText().toString(),
                        lieuparente.getText().toString(),obsevation.getText().toString());
                h.insertFonctionnaire(f);
                Intent i=new Intent(MainActivity.this,ListeFonctionnaire.class);
                startActivity(i);
            }
        });

       // binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());

       // setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

      //  binding.fab.setOnClickListener(new View.OnClickListener() {
       //     @Override
         //   public void onClick(View view) {
           //     Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
             //           .setAction("Action", null).show();
           // }
       // });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}