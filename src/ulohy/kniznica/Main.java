package ulohy.kniznica;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String ukon="";
        Funkcie funkcia=new Funkcie();
        while (true){
            Scanner scn=new Scanner(System.in);
            System.out.println("Zvoľ operáciu: ");
            System.out.println("1 Pridať knižku");
            System.out.println("2 Zobraz knihy");
            System.out.println("3 Zobraz konkretnu");
            System.out.println("4 Vymaž konkretnu");
            System.out.println("5 Zobraz počet knih");
            System.out.println("6 Vymaž všetky");
            System.out.println("7 ulož databazu");
            System.out.println("8 načitaj databazu");
            System.out.println("koniec je jednoducho koniec");

            ukon=scn.next();
            if(ukon.equalsIgnoreCase("koniec"))
                break;
            switch (ukon){
                case "1":{
                    funkcia.pridatKnihu();
                    break;
                }
                case "2":{
                    funkcia.ukazKnihy();
                    break;
                }
                case "3":{
                    funkcia.zobrazJednu();
                    break;
                }
                case "4":{
                    funkcia.vymazKnihu();
                    break;
                }
                case "5":{
                    funkcia.pocetKnih();
                    break;
                }
                case "6":{
                    funkcia.vymazVsetko();
                    break;
                }
                case "7":{
                    funkcia.ulozDoSuboru();
                    break;
                }
                case "8":{
                    funkcia.nacitajZoSuboru();
                    break;
                }
                default:{
                    System.out.println("chybný prikaz");
                }
            }

        }
    }
}
