package ba.unsa.etf.rpr.tutorijal_3;

public class MedunarodniBroj extends TelefonskiBroj{

    String pozivni;

    public MedunarodniBroj(String drzava, String broj) {
        this.pozivni = drzava;
        super.broj = drzava + broj;
    }

    @Override
    String ispisi(){
        return pozivni+super.broj;
    }
}
