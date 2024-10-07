package vezerlo;

import modell.Ember;
import nezet.KonzolNezet;

public class KonzolVezerlo {
    private Ember modell;
    private KonzolNezet nezet;

    public KonzolVezerlo(Ember modell, KonzolNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        program();    
    }

    private void program() {
        this.nezet.megjelenit(this.modell.bemutatkozas());
        this.modell.nyelvTanul("Angol");
        this.nezet.megjelenit(this.modell.bemutatkozas());
        this.modell.szuletesnap();
        this.modell.nyelvTanul("Német");
        this.nezet.megjelenit(this.modell.bemutatkozas());
    }
}
