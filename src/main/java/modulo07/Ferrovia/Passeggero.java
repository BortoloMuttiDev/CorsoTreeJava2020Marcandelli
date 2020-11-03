package modulo07.Ferrovia;

public abstract class Passeggero {

    protected String nome;
    protected int codiceBiglietto;
    protected int idVagone;

    public Passeggero(String nome, int codiceBiglietto, int idVagone) {
        this.nome = nome;
        this.codiceBiglietto = codiceBiglietto;
        this.idVagone = idVagone;
    }

    public abstract Object getNome();

    public abstract void setNome(String nome);

    public abstract int getCodiceBiglietto();

    public abstract void setCodiceBiglietto(int codiceBiglietto);

    public abstract int getIdVagone();

    public abstract void setIdVagone(int idVagone);


}
