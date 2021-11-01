package ba.unsa.etf.rpr.tutorijal_3;

public class FiksniBroj extends TelefonskiBroj {

    String pozivni;

    public FiksniBroj(Grad grad, String broj) {
        super.broj = grad.dajPozivni() + "/" + broj;
        this.pozivni = grad.dajPozivni();
    }

    @Override
    String ispisi(){
        return pozivni+"/"+super.broj;
    }


}
