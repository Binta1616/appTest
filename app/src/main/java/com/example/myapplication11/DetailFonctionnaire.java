package com.example.myapplication11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DetailFonctionnaire extends AppCompatActivity {

    EditText typedossier,typepension,titrepension,nom,prenom,sexe,telephone,datenaissance,lieunaissance,
            prenompere,prenommere,nommere,referenceacte,matriculefonctionnaire,
            referenceacteconcession,lieupaimentpension,matriculetitredecujus,prenomdecujus,lieuparente,obsevation;
    Button mod,sup;
    String id;
    Helper h=new Helper(DetailFonctionnaire.this);

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_fonctionnaire);

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

        mod=findViewById(R.id.mod);
        sup=findViewById(R.id.sup);

        id=getIntent().getStringExtra("id");
        Fonctionnaire f=h.getOneFonctionnaire(Integer.parseInt(id));

        typedossier.setText(f.getTypedossier());
        typepension.setText(f.getTypepension());
        titrepension.setText(f.getTitrepension());
        nom.setText(f.getNom());
        prenom.setText(f.getPrenom());
        sexe.setText(f.getSexe());
        telephone.setText(f.getTelephone());
        datenaissance.setText(f.getDatenaissance());
        lieunaissance.setText(f.getLieunaissance());
        prenompere.setText(f.getPrenompere());
        prenommere.setText(f.getPrenommere());
        nommere.setText(f.getNommere());
        referenceacte.setText(f.getReferenceacte());
        matriculefonctionnaire.setText(f.getMatriculefonctionnaire());
        referenceacteconcession.setText(f.getReferenceacteconcession());
        lieupaimentpension.setText(f.getLieupaimentpension());
        matriculetitredecujus.setText(f.getMatriculetitredecujus());
        prenomdecujus.setText(f.getPrenomdecujus());
        lieuparente.setText(f.getLieuparente());
        obsevation.setText(f.getObsevation());

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fonctionnaire fo = new Fonctionnaire(Integer.parseInt(id));
                typedossier.getText().toString();
                typepension.getText().toString();
                titrepension.getText().toString();
                nom.getText().toString();
                prenom.getText().toString();
                sexe.getText().toString();
                telephone.getText().toString();
                datenaissance.getText().toString();
                lieunaissance.getText().toString();
                prenompere.getText().toString();
                prenommere.getText().toString();
                nommere.getText().toString();
                referenceacte.getText().toString();
                matriculefonctionnaire.getText().toString();
                referenceacteconcession.getText().toString();
                lieupaimentpension.getText().toString();
                matriculetitredecujus.getText().toString();
                prenomdecujus.getText().toString();
                lieuparente.getText().toString();
                obsevation.getText().toString();

                h.updateFonctionnaire(fo);
                Intent i=new Intent(DetailFonctionnaire.this,ListeFonctionnaire.class);
                startActivity(i);

            }
        });
        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h.deleteFonctionnaire(Integer.parseInt(id));
                Intent i=new Intent(DetailFonctionnaire.this,ListeFonctionnaire.class);
                startActivity(i);

            }
        });
    }
}
