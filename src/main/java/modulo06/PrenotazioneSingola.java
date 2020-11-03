package modulo06;

public class PrenotazioneSingola extends Prenotazione {
    private Preferenza preferenza;

    public PrenotazioneSingola(String code, Preferenza preferenza) {
        super(code);
        this.preferenza=preferenza;
    }

    public Preferenza getPreferenza() {
        return preferenza;
    }

    public void setPreferenza(Preferenza preferenza) {
        this.preferenza = preferenza;
    }
}
