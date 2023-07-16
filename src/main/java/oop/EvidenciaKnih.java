package oop;

public class EvidenciaKnih {
    public static void main(String[] args) {
      Kniha kniha2= new Kniha();
      kniha2.autor="Isaac Asimov";
      kniha2.nazov="Ja, robot";
      kniha2.cena=3.80;
      kniha2.pocetStran=150;
      kniha2.rokVydania=1960;

        System.out.println("Názov knihy: "+kniha2.nazov);

        System.out.println("Autor knihy: "+kniha2.autor);
    }
}
