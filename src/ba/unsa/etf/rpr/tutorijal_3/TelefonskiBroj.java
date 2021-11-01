package ba.unsa.etf.rpr.tutorijal_3;

public abstract class TelefonskiBroj {

    String broj;

    String ispisi(){
        System.out.println(broj);
        return broj;
    }

     public int dajPozivni(){
        return this.broj.charAt(0)+broj.charAt(1)+broj.charAt(2);
    }
}
