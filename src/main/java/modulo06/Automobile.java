package modulo06;

public class Automobile extends Veicolo {
    private int nPorte;
    public Automobile(String targa,int nPosti,int nPorte) {
        super(targa,nPosti);
        this.nPorte=nPorte;
    }

    @Override
    public String toString() {
        return super.toString()+"numero porte: "+this.nPorte;
    }
}
