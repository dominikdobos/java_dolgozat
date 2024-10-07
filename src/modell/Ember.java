package modell;

import java.util.ArrayList;

public class Ember {
    private String nev;
    private int kor;
    private ArrayList<String> nyelv;

    public Ember(String nev, int kor) {
        this(nev, kor, new ArrayList<String>());
    }
    
    public Ember(String nev, int kor, ArrayList<String> nyelv) {
        this.nev = nev;
        this.kor = kor;
        this.nyelv = nyelv;
    }
    
    public void szuletesnap() {
        this.kor = this.kor + 1; 
    }
    
    public void nyelvTanul(String nyelv) {
        this.nyelv.add(nyelv);
    }
    
    public String bemutatkozas() {
        String szoveg = this.nev + "\n";
        szoveg += "\tÉletkor: " + this.kor + "\n";
        if (!this.nyelv.isEmpty()) {
            szoveg += "\tNyelv(ek): \n";
            for (int i = 0; i < this.nyelv.size(); i++) {
                szoveg += "\t\t" + this.nyelv.get(i) + "\n";
            }
        }
        
        return szoveg;
    }
}
