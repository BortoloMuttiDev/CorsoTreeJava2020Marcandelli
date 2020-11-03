package modulo07.Ferrovia;

public class BinarioStazione extends Binario {
    private int idStazione;

    public BinarioStazione(Binario binario1) {
        super(binario1);
    }


    @Override
    public Binario getSuccessivo() {
        return super.getSuccessivo();
    }

    @Override
    public Binario percorri(Treno t) {
        return super.percorri(t);
    }

    @Override
    public Binario getBinario() {
        return super.getBinario();
    }
}
