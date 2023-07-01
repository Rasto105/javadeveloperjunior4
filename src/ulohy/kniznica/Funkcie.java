package ulohy.kniznica;

import java.util.ArrayList;
import java.util.Scanner;

public class Funkcie {
    private ArrayList<Kniha> bookLibrary = new ArrayList<Kniha>();

    public void pridatKnihu() {
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Zadaj meno knihy:");

            String nazov = scn.next();
            System.out.println("Zadaj autora:");
            String autor = scn.next();
            System.out.println("Zadaj rok:");
            int rok = scn.nextInt();
            Kniha book= new Kniha(nazov,autor,rok);
            bookLibrary.add(book);
        } catch (Exception e){
            System.out.println("Chyba pri zadavaní");
        }
    }
    public void ukazKnihy(){
        if (bookLibrary.size()==0){
            System.out.println("Žiadna kniha na zobrazenie");
        }
        else{
            for (Kniha item:bookLibrary){
                System.out.println("Názov: "+item.getNazov()+" Autor: "+item.getAutor()+" Rok vydania: "+item.getRokVydania());
            }
        }
    }
    public void zobrazJednu(){
        int index;
        Kniha item;
        Scanner scn=new Scanner(System.in);
        System.out.println("Zadaj poziciu");
        index=scn.nextInt()-1;
        try {
            item=bookLibrary.get(index);
            System.out.println("Názov: "+item.getNazov()+" Autor: "+item.getAutor()+" Rok vydania: "+item.getRokVydania());
        }catch (Exception e){
            System.out.println("Kniha sa nenašla");
        }
    }
    public void vymazKnihu(){
        int index;
        Kniha item;
        Scanner scn= new Scanner(System.in);
        System.out.println("Ktorú knihu vymazať?");
        index=scn.nextInt()-1;
        try {
            item=bookLibrary.remove(index);
            System.out.println("Kniha na pozícii "+(index+1)+" vymazaná!");
        }catch (Exception e){
            System.out.println("Kniha na pozicii neexistuje");
        }
    }
    public void pocetKnih(){
        System.out.println("počet knih je : "+bookLibrary.size());
    }
    public void vymazVsetko(){
        bookLibrary.clear();
        System.out.println("Všetko vymazané");
    }
}
