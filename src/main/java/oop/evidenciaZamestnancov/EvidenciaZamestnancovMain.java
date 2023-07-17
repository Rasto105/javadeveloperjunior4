package oop.evidenciaZamestnancov;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class EvidenciaZamestnancovMain {
    public static void main(String[] args) {
     /*   Oddelenie marketingoveOddelenie = new Oddelenie();
        marketingoveOddelenie.setNazov("Marketingove oddelenie");
        marketingoveOddelenie.setPoschodie(2);

        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.setMeno("Ján");
        zamestnanec1.setPriezvisko("Mrkvička");
        zamestnanec1.setDatumNarodenia(LocalDate.of(2000, 05, 12));
        zamestnanec1.setJeVeduci(true);
        zamestnanec1.setOddelenie(marketingoveOddelenie);
        System.out.println("Informácie o zamestnancovi");
        System.out.println(zamestnanec1.getMeno());
        System.out.println(zamestnanec1.getPriezvisko());
        System.out.println(zamestnanec1.getDatumNarodenia());
        System.out.println(zamestnanec1.isJeVeduci());
        // System.out.println(zamestnanec1.getOddelenie().getNazov());
        //  System.out.println("poschodie "+zamestnanec1.getOddelenie().getPoschodie());
        System.out.println(zamestnanec1.getOddelenie());// funguje ak je v triede toString


    // novy zamestnanec a oddelenie
    Oddelenie itOddelenie = new Oddelenie("IT oddenieleni", 3);
    Zamestnanec zamestnanec2 = new Zamestnanec("Dežo", "Nejaky", LocalDate.of(1991, 2, 5), false, itOddelenie);

    */
      Zamestnavatel ibm = new Zamestnavatel();
      ibm.naplnZamestnancami();
      ibm.vypisZamestnancov();
        System.out.println(ibm.pocetZamestnancov());

        // pridanie novej firmy
        Zamestnavatel microsoft= new Zamestnavatel();
       // microsoft.naplnZamestnancami();
        Oddelenie pravneOddelenie= new Oddelenie("Pravne oddelenie",1);
        Zamestnanec zamestnanec1=new Zamestnanec("Eva","Nadherna",LocalDate.of(1980,6,30),false,pravneOddelenie);
        microsoft.pridajZamestnanca(zamestnanec1);
        microsoft.vypisZamestnancov();
        System.out.println(microsoft.pocetZamestnancov());
}
}


