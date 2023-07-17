package oop.evidenciaZamestnancov;

import java.time.LocalDate;
import java.util.ArrayList;

public class Zamestnavatel {
    private ArrayList<Zamestnanec> zoznamZamestnancov;

    public Zamestnavatel() {
        zoznamZamestnancov= new ArrayList<>();
    }
    public void naplnZamestnancami(){
        Oddelenie itOddelenie = new Oddelenie("IT oddenieleni", 3);
        Oddelenie marketingoveOddelenie = new Oddelenie();
        marketingoveOddelenie.setNazov("Marketingove oddelenie");
        marketingoveOddelenie.setPoschodie(2);
        Zamestnanec zamestnanec2 = new Zamestnanec("Dežo", "Nejaky", LocalDate.of(1991, 2, 5), false, itOddelenie);
        Zamestnanec zamestnanec3 = new Zamestnanec("Zuzana", "Nejky", LocalDate.of(1992, 2, 5), false, marketingoveOddelenie);
    zoznamZamestnancov.add(zamestnanec2);
    zoznamZamestnancov.add(zamestnanec3);

    }
    public void vypisZamestnancov(){
        for (Zamestnanec konkretnyZamestnanec: zoznamZamestnancov){
            System.out.println("Detaily o zamestnancovi: "+konkretnyZamestnanec);
        }
    }
    public int pocetZamestnancov(){
      return  zoznamZamestnancov.size();
    }
    public void pridajZamestnanca(Zamestnanec konkretnyZamestnanec){
        zoznamZamestnancov.add(konkretnyZamestnanec);
    }
}

