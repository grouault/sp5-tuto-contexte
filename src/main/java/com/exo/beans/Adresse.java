package com.exo.beans;

public class Adresse {

    private String codePostal;

    private String rue;

    private String ville;

    private String pays;

    public Adresse() {
    }

    public Adresse(String codePostal, String rue, String ville, String pays) {
        this.codePostal = codePostal;
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public Adresse setCodePostal(String codePostal) {
        this.codePostal = codePostal;
        return this;
    }

    public String getRue() {
        return rue;
    }

    public Adresse setRue(String rue) {
        this.rue = rue;
        return this;
    }

    public String getVille() {
        return ville;
    }

    public Adresse setVille(String ville) {
        this.ville = ville;
        return this;
    }

    public String getPays() {
        return pays;
    }

    public Adresse setPays(String pays) {
        this.pays = pays;
        return this;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "codePostal='" + codePostal + '\'' +
                ", rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }

}
