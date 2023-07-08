package ulohy.kniznica;

import java.io.*;
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
    public void ulozDoSuboru() throws IOException {
        Scanner scn= new Scanner(System.in);
        System.out.println("Zadaj názov: ");
        String nazovSuboru=scn.nextLine();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(nazovSuboru); // vytvorime subor s nazvom kniha.ser
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // vytvorime Object stream pre ukladanie objektov
            objectOutputStream.writeObject(bookLibrary); // zapiseme objekt
            objectOutputStream.flush(); // realne uskutocnime operaciu zapisu
            objectOutputStream.close(); // zatvorime object output stream
            fileOutputStream.close(); // zatvorime file output stream, cize subor
        } catch (Exception e){
            System.out.println("Nepodarilo sa uložiť!");
            e.printStackTrace();
        }


    }
    public void nacitajZoSuboru(){
        Scanner scn= new Scanner(System.in);
        System.out.println("Zadaj názov: ");
        String nazovSuboru=scn.nextLine();
        try {
            FileInputStream fileInputStream = new FileInputStream(nazovSuboru);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            bookLibrary= (ArrayList) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("databaza načitana");
        }catch (Exception e){
            System.out.println("Nenačítal zadanu knihu");
        }
    }
    public void hladajKnihyPodlaNazvu() {
        Scanner scn = new Scanner(System.in);

    System.out.println("Zadaj názov knihy:");
    String hladanyNazov = scn.nextLine();
    ArrayList<Kniha> najdeneKnihy = new ArrayList<>();
    // Prazdny zoznam najdenych knih
        for(Kniha konkretnaKniha: bookLibrary) {
            // foreach pre prechadzanie kazdej knihy v nasom zozname knih
            // Obsahuje nazov konkretnej knihy aspon cast nazvu knihy, ktory hladame?
            if (konkretnaKniha.getNazov().contains(hladanyNazov)) {
                najdeneKnihy.add(konkretnaKniha);
                // Ak taku knihu najde, tak ju ulozi do zoznamu najdeneKnihy}}
                // Vypiseme najdene knihy
                System.out.println("\nNájdené knihy sú tieto:");
                for (Kniha najdenaKniha : najdeneKnihy) {
                    System.out.println(najdenaKniha);
                }
            }
        }
    }
}
