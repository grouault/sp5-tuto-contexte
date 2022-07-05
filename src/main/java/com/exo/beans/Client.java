package com.exo.beans;

public class Client {

    private String nom;

    private String prenom;

    private int age;

    private Adresse adresse;

    public Client() {
    }

    public Client(String nom, String prenom, int age, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public Client setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public Client setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Client setAge(int age) {
        this.age = age;
        return this;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Client setAdresse(Adresse adresse) {
        this.adresse = adresse;
        return this;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", adresse=" + adresse.toString() +
                '}';
    }

}
