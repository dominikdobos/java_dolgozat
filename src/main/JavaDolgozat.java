package main;

import modell.Ember;
import nezet.KonzolNezet;
import vezerlo.KonzolVezerlo;

public class JavaDolgozat {
    public static void main(String[] args) {
        KonzolNezet nezet = new KonzolNezet();
        Ember elek = new Ember("Teszt Elek", 30);
        
        KonzolVezerlo vezerlo = new KonzolVezerlo(elek, nezet);
    }
}
