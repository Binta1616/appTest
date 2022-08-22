package com.example.myapplication11;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Helper extends SQLiteOpenHelper {


    public Helper(@Nullable Context context) {
        super(context, "gestionfonctionnaire", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE fonctionnaire(_id INTEGER PRIMARY KEY," +
                "typedossier Text," +
                "typepension TextT," +
                "titrepension Text," +
                "nom Text," +
                "prenom Text," +
                "sexe Text," +
                "telephone Text," +
                "datenaissance Text," +
                "lieunaissance Text," +
                "prenompere Text," +
                "prenommere Text," +
                "nommere Text," +
                "referenceacte Text," +
                "matriculefonctionnaire Text," +
                "referenceacteconcession Text," +
                "lieupaimentpension Text," +
                "matriculetitredecujus Text," +
                "prenomdecujus Text," +
                "lieuparente Text," +
                "obsevation Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS fonctionnaire");
        onCreate(db);

    }
    public void insertFonctionnaire(Fonctionnaire f)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("typedossier",f.getTypedossier());
        cv.put("typepension",f.getTypepension());
        cv.put("titrepension",f.getTitrepension());
        cv.put("nom",f.getNom());
        cv.put("prenom",f.getPrenom());
        cv.put("sexe",f.getSexe());
        cv.put("telephone",f.getTelephone());
        cv.put("datenaissance",f.getDatenaissance());
        cv.put("lieunaissance",f.getLieunaissance());
        cv.put("prenompere",f.getPrenompere());
        cv.put("prenommere",f.getPrenommere());
        cv.put("nommere",f.getNommere());
        cv.put("referenceacte",f.getReferenceacte());
        cv.put("matriculefonctionnaire",f.getMatriculefonctionnaire());
        cv.put("referenceacteconcession",f.getReferenceacteconcession());
        cv.put("lieupaimentpension",f.getLieupaimentpension());
        cv.put("matriculetitredecujus",f.getMatriculetitredecujus());
        cv.put("prenomdecujus",f.getPrenomdecujus());
        cv.put("lieuparente",f.getLieuparente());
        cv.put("obsevation",f.getObsevation());

        db.insert("fonctionnaire",null,cv);
        db.close();
    }
    public void updateFonctionnaire(Fonctionnaire f)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("typedossier",f.getTypedossier());
        cv.put("typepension",f.getTypepension());
        cv.put("titrepension",f.getTitrepension());
        cv.put("nom",f.getNom());
        cv.put("prenom",f.getPrenom());
        cv.put("sexe",f.getSexe());
        cv.put("telephone",f.getTelephone());
        cv.put("datenaissance",f.getDatenaissance());
        cv.put("lieunaissance",f.getLieunaissance());
        cv.put("prenompere",f.getPrenompere());
        cv.put("prenommere",f.getPrenommere());
        cv.put("nommere",f.getNommere());
        cv.put("referenceacte",f.getReferenceacte());
        cv.put("matriculefonctionnaire",f.getMatriculefonctionnaire());
        cv.put("referenceacteconcession",f.getReferenceacteconcession());
        cv.put("lieupaimentpension",f.getLieupaimentpension());
        cv.put("matriculetitredecujus",f.getMatriculetitredecujus());
        cv.put("prenomdecujus",f.getPrenomdecujus());
        cv.put("lieuparente",f.getLieuparente());
        cv.put("obsevation",f.getObsevation());

        db.update("fonctionnaire",cv,"_id=?",new String[]{String.valueOf(f.getId())});
        db.close();
    }
    public void deleteFonctionnaire(int id)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete("fonctionnaire","_id=?",new String[]{String.valueOf(id)});
        db.close();
    }
    public Cursor getAllFonctionnaires()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor c=db.rawQuery("SELECT * FROM fonctionnaire",null);
        return c;
    }
    public Fonctionnaire getOneFonctionnaire(int id)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor c=db.query("fonctionnaire",new String[]{"_id","nom","typedossier","prix"},"_id=?",
                new String[]{String.valueOf(id)},null,null,null);
        c.moveToFirst();
        Fonctionnaire f=new Fonctionnaire (c.getInt(0),c.getString(1),c.getString(2),c.getString(3),
                c.getString(4),c.getString(5),c.getString(6),c.getString(7),c.getString(8),c.getString(9),c.getString(10),
                c.getString(11),c.getString(12),c.getString(13),c.getString(14),c.getString(15),
                c.getString(16),c.getString(17),c.getString(18),c.getString(19),c.getString(20));
        return f;
    }
}

