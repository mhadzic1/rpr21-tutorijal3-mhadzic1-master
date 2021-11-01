package ba.unsa.etf.rpr.tutorijal_3;

public enum Grad {
    SARAJEVO ("033"),
    GORAŽDE("038"),
    KAKANJ("032"),
    TUZLA("035"),
    MRKONJIĆGRAD("050"),
    BANJALUKA("051"),
    DOBOJ("053"),
    PALE("057"),
    NEUM("036"),
    BIHAĆ("037"),
    ORAŠJE("031");


    private final String pozivni;

    Grad(String pozivni) {
        this.pozivni = pozivni;
    }

    String dajPozivni(){
        return this.pozivni;
    }
}
