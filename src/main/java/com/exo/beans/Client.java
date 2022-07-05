package com.exo.beans;

import java.util.List;

public class Client {

    private String nom;

    private String prenom;

    private int age;

    private List<Adresse> adresses;

    public Client() {
    }

    public Client(String nom, String prenom, int age, List<Adresse> adresses) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresses = adresses;
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

    public List<Adresse> getAdresses() {
        return adresses;
    }

    public Client setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
        return this;
    }

    @Override
    public String toString() {
        return "Client={" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", adresses=" + this.getAdresses() +
                '}';
    }

}
