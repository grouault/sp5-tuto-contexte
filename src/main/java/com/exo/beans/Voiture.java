package com.exo.beans;

public class Voiture {

    private String marque;

    private String modele;

    public Voiture() {
    }

    public String getMarque() {
        return marque;
    }

    public Voiture setMarque(String marque) {
        this.marque = marque;
        return this;
    }

    public String getModele() {
        return modele;
    }

    public Voiture setModele(String modele) {
        this.modele = modele;
        return this;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                '}';
    }

}
