package com.example.myapplication11;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cursoradapter.widget.SimpleCursorAdapter;

public class ListeFonctionnaire extends AppCompatActivity {

    ListView ls;
    Helper h=new Helper(ListeFonctionnaire.this);


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_fonctionnaire);
        ls=findViewById(R.id.lst);

        Cursor c=h.getAllFonctionnaires();

        SimpleCursorAdapter adapter=new SimpleCursorAdapter(ListeFonctionnaire.this,R.layout.item,c,
                new String[]{c.getColumnName(0),c.getColumnName(1),c.getColumnName(2),
                        c.getColumnName(3),c.getColumnName(4),c.getColumnName(5),
                        c.getColumnName(6),c.getColumnName(7),c.getColumnName(8),c.getColumnName(9),c.getColumnName(10),
                        c.getColumnName(11),c.getColumnName(12),c.getColumnName(13),c.getColumnName(14),
                        c.getColumnName(15),c.getColumnName(16),c.getColumnName(17),c.getColumnName(18),
                        c.getColumnName(19),c.getColumnName(20)},
                new int[]{R.id.id,R.id.typedossier,R.id.typepension,R.id.titrepension,R.id.nom,R.id.prenom,R.id.sexe,
                        R.id.telephone,R.id.datenaissance,R.id.lieunaissance,R.id.prenompere,R.id.prenommere,
                        R.id.nommere,R.id.referenceacte,R.id.matriculefonctionnaire,R.id.referenceacteconcession,
                        R.id.lieupaimentpension,R.id.matriculetitredecujus,R.id.prenomdecujus,R.id.lieuparente,R.id.obsevation,},1);
        ls.setAdapter(adapter);
        ///Detaile de la liste
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView t=view.findViewById(R.id.id);
                Intent x=new Intent(ListeFonctionnaire.this,DetailFonctionnaire.class);
                x.putExtra("id",t.getText().toString());
                startActivity(x);

            }
        });
    }

}
