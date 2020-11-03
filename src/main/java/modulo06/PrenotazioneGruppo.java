package modulo06;

public class PrenotazioneGruppo extends Prenotazione {
    private int nPosti;

    public PrenotazioneGruppo(String code, int nPosti) {
        super(code);
        this.nPosti=nPosti;

    }
    public int getnPosti() {
        return nPosti;
    }

    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }
}
