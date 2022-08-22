package com.example.myapplication11;

public class Fonctionnaire {
    int id;
    String typedossier;
    String typepension;
    String titrepension;
    String nom;
    String prenom;
    String sexe;
    String telephone;
    String datenaissance;
    String lieunaissance;
    String prenompere;
    String prenommere;
    String nommere;
    String referenceacte;
    String matriculefonctionnaire;
    String referenceacteconcession;
    String lieupaimentpension;
    String matriculetitredecujus;
    String prenomdecujus;
    String lieuparente;
    String obsevation;


    public Fonctionnaire(int id, String typedossier, String typepension, String titrepension, String nom, String prenom, String sexe, String telephone, String datenaissance, String lieunaissance, String prenompere, String prenommere, String nommere, String referenceacte, String matriculefonctionnaire, String referenceacteconcession, String lieupaimentpension, String matriculetitredecujus, String prenomdecujus, String lieuparente, String obsevation) {
        this.id = id;
        this.typedossier = typedossier;
        this.typepension = typepension;
        this.titrepension = titrepension;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.telephone = telephone;
        this.datenaissance = datenaissance;
        this.lieunaissance = lieunaissance;
        this.prenompere = prenompere;
        this.prenommere = prenommere;
        this.nommere = nommere;
        this.referenceacte = referenceacte;
        this.matriculefonctionnaire = matriculefonctionnaire;
        this.referenceacteconcession = referenceacteconcession;
        this.lieupaimentpension = lieupaimentpension;
        this.matriculetitredecujus = matriculetitredecujus;
        this.prenomdecujus = prenomdecujus;
        this.lieuparente = lieuparente;
        this.obsevation = obsevation;
    }

    public Fonctionnaire(String typedossier, String typepension, String titrepension, String nom, String prenom, String sexe, String telephone, String datenaissance, String lieunaissance, String prenompere, String prenommere, String nommere, String referenceacte, String matriculefonctionnaire, String referenceacteconcession, String lieupaimentpension, String matriculetitredecujus, String prenomdecujus, String lieuparente, String obsevation) {
        this.typedossier = typedossier;
        this.typepension = typepension;
        this.titrepension = titrepension;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.telephone = telephone;
        this.datenaissance = datenaissance;
        this.lieunaissance = lieunaissance;
        this.prenompere = prenompere;
        this.prenommere = prenommere;
        this.nommere = nommere;
        this.referenceacte = referenceacte;
        this.matriculefonctionnaire = matriculefonctionnaire;
        this.referenceacteconcession = referenceacteconcession;
        this.lieupaimentpension = lieupaimentpension;
        this.matriculetitredecujus = matriculetitredecujus;
        this.prenomdecujus = prenomdecujus;
        this.lieuparente = lieuparente;
        this.obsevation = obsevation;
    }

    public Fonctionnaire() {
    }

    public Fonctionnaire(String toString, String typedossier, String typepension, String titrepension, String nom, String prenom, String sexe, String telephone, String datenaissance, String lieunaissance, String prenompere, String prenommere, String nommere, String referenceacte, String matriculefonctionnaire, String referenceacteconcession, String lieupaimentpension, String matriculetitredecujus, String prenomdecujus, String lieuparente, String obsevation) {
    }

    public Fonctionnaire(int parseInt) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypedossier() {
        return typedossier;
    }

    public void setTypedossier(String typedossier) {
        this.typedossier = typedossier;
    }

    public String getTypepension() {
        return typepension;
    }

    public void setTypepension(String typepension) {
        this.typepension = typepension;
    }

    public String getTitrepension() {
        return titrepension;
    }

    public void setTitrepension(String titrepension) {
        this.titrepension = titrepension;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getLieunaissance() {
        return lieunaissance;
    }

    public void setLieunaissance(String lieunaissance) {
        this.lieunaissance = lieunaissance;
    }

    public String getPrenompere() {
        return prenompere;
    }

    public void setPrenompere(String prenompere) {
        this.prenompere = prenompere;
    }

    public String getPrenommere() {
        return prenommere;
    }

    public void setPrenommere(String prenommere) {
        this.prenommere = prenommere;
    }

    public String getNommere() {
        return nommere;
    }

    public void setNommere(String nommere) {
        this.nommere = nommere;
    }

    public String getReferenceacte() {
        return referenceacte;
    }

    public void setReferenceacte(String referenceacte) {
        this.referenceacte = referenceacte;
    }

    public String getMatriculefonctionnaire() {
        return matriculefonctionnaire;
    }

    public void setMatriculefonctionnaire(String matriculefonctionnaire) {
        this.matriculefonctionnaire = matriculefonctionnaire;
    }

    public String getReferenceacteconcession() {
        return referenceacteconcession;
    }

    public void setReferenceacteconcession(String referenceacteconcession) {
        this.referenceacteconcession = referenceacteconcession;
    }

    public String getLieupaimentpension() {
        return lieupaimentpension;
    }

    public void setLieupaimentpension(String lieupaimentpension) {
        this.lieupaimentpension = lieupaimentpension;
    }

    public String getMatriculetitredecujus() {
        return matriculetitredecujus;
    }

    public void setMatriculetitredecujus(String matriculetitredecujus) {
        this.matriculetitredecujus = matriculetitredecujus;
    }

    public String getPrenomdecujus() {
        return prenomdecujus;
    }

    public void setPrenomdecujus(String prenomdecujus) {
        this.prenomdecujus = prenomdecujus;
    }

    public String getLieuparente() {
        return lieuparente;
    }

    public void setLieuparente(String lieuparente) {
        this.lieuparente = lieuparente;
    }

    public String getObsevation() {
        return obsevation;
    }

    public void setObsevation(String obsevation) {
        this.obsevation = obsevation;
    }
}
