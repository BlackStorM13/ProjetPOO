package com.tld.model;

import java.time.LocalDate;

public class Produit {
    private int id;
    private String nom;
    private boolean EstDispo;
    private LocalDate peremption;


    public Produit(){}

    public Produit(int id, String nom, boolean estDispo, LocalDate peremption) {
        this.id = id;
        this.nom = nom;
        EstDispo = estDispo;
        this.peremption = peremption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEstDispo() {
        return EstDispo;
    }

    public void setEstDispo(boolean estDispo) {
        EstDispo = estDispo;
    }

    public LocalDate getPeremption() {
        return peremption;
    }

    public void setPeremption(LocalDate peremption) {
        this.peremption = peremption;
    }


    @Override
    public String toString() {
        return "Produit : " + "id = " + id + ", nom = '" + nom + '\'' + ", EstDispo = " + EstDispo + ", peremption = " + peremption;
    }
}
