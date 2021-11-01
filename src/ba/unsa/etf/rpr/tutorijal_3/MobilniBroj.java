package ba.unsa.etf.rpr.tutorijal_3;

public class MobilniBroj extends TelefonskiBroj {
    int mobilnaMreza;

    public MobilniBroj(int mobilnaMreza, String broj) {
        super.broj = "0" + toString(mobilnaMreza) + broj;
        this.mobilnaMreza = mobilnaMreza;
    }

    private String toString(int mobilnaMreza) {
        return String.format(String.valueOf(mobilnaMreza));
    }

    @Override
    String ispisi(){
        return "0"+mobilnaMreza+super.broj;
    }


}
