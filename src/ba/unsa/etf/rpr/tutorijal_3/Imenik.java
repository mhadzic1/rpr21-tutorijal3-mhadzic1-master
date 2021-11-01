package ba.unsa.etf.rpr.tutorijal_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

;

public class Imenik {

    Map<String, TelefonskiBroj> imenik = new HashMap<>();

    void dodaj (String ime, TelefonskiBroj broj) {
        imenik.put(ime,broj);
    }

    TelefonskiBroj dajBroj(String ime) {
        for(var a : imenik.entrySet()){
                String novi = a.getKey();
                if(novi.equals(ime)) return a.getValue();
        }
        return null;
    }

    String dajIme(TelefonskiBroj broj){
        for(var a : imenik.entrySet()){
            var novi = a.getValue();
            if(novi == broj) return a.getKey();
        }
        return null;
    }

    String naSlovo(char s){
        for(var a : imenik.entrySet()){
            if(a.getKey().charAt(0) == s) return a.getKey();
        }

        return null;
    }

    Set <String> izGrada (Grad g){

        Set<String> novi = new HashSet<String>();
        for(var a : imenik.entrySet()){
            if(a.getKey().charAt(2) == g.dajPozivni().charAt(2)) novi.add(a.getKey());
        }

        return null;
    }

    Set <TelefonskiBroj> izGradaBrojevi(Grad g){

        Set<TelefonskiBroj> novi = new HashSet<TelefonskiBroj>();
        for(var a : imenik.entrySet()){
            if(a.getKey().charAt(2) == g.dajPozivni().charAt(2) && a.getKey().charAt(1) == g.dajPozivni().charAt(1)) novi.add(a.getValue());
        }

        return null;
    }
}
