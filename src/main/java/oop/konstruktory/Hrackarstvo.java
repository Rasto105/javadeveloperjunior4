package oop.konstruktory;

public class Hrackarstvo {
    public static void main(String[] args) {
        Hracka moncici=new Hracka();
        moncici.setNazov("moncici");
        moncici.setCena(15.0);
       // moncici.setFarba("ružové");
        // moncici.setMaterial("plyš");
        moncici.setVek(4);

        System.out.println("Atributy hračky:");
        System.out.println("Názov: "+moncici.getNazov());
        System.out.println("Cena: "+moncici.getCena());
        System.out.println("Farba: "+moncici.getFarba());
    }
}
