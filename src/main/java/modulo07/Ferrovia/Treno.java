package modulo07.Ferrovia;

import lombok.Data;

import java.util.UUID;

@Data
public abstract class Treno {

    protected UUID codice;
    protected int speed;
    protected int maxVagoni;
    protected boolean fermo;
    protected boolean arrivo = false;
    public Treno(UUID codice, int speed, int maxVagoni, boolean fermo) {
        this.codice = UUID.randomUUID();
        this.speed = 0;
        this.maxVagoni = maxVagoni;
        this.fermo = false;
    }
    public abstract boolean getFermo();
    public abstract boolean getArrivo();
    public abstract void partire();
    public abstract void frenare();
    public abstract void fermare(Vagone vagone);
    public abstract void aggiungiVagone(Vagone vagone);
    public abstract void rimuoviVagoniVuoti();
    public abstract void entraPasseggero(Vagone vagone, Passeggero passeggero);
    public abstract void esciPasseggero();
    public abstract void apriPorteTreno();
    public abstract void chiudiPorteTreno();



}
