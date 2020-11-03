package modulo06;

public class AutoCarro extends Veicolo{

   private int maxCarico;

    public AutoCarro(String targa, int nPosti, int maxCarico) {
        super(targa, nPosti);
        this.maxCarico=maxCarico;
    }

    @Override
    public String toString() {
        return super.toString()+"carico massimo: "+this.maxCarico;
    }
}
