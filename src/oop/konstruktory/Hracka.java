package oop.konstruktory;

public class Hracka {
    //material, velkost, farba, cena, vek
    private String material;
    private String velkost;
    private String farba;
    private double cena;
    private int vek;
    private String nazov;


    public Hracka() {
        material= "Výrobca neuvádza";
        farba= "neexistuje";
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVelkost() {
        return velkost;
    }

    public void setVelkost(String velkost) {
        this.velkost = velkost;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }
}
