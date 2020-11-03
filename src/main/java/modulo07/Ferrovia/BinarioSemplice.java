package modulo07.Ferrovia;

public class BinarioSemplice extends Binario {


    public BinarioSemplice(Binario binario1) {
        super(binario1);
    }

    @Override
    public Binario getSuccessivo() {
        return super.getSuccessivo();
    }


    public Binario percorri(Treno t) {
        return getSuccessivo();
    }
}
