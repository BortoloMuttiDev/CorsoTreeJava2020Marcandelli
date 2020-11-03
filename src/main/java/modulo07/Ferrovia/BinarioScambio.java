package modulo07.Ferrovia;

public class BinarioScambio extends Binario {

    private Binario b1;
    private Binario b2;

    public BinarioScambio(Binario binario1) {
        super(binario1);
    }


    @Override
    public Binario getSuccessivo() {
        return super.getSuccessivo();
    }

    @Override
    public Binario percorri(Treno t) {
        return b1;
    }

    @Override
    public Binario getBinario() {
        return super.getBinario();
    }
    public void scambia(){
        Binario scambio = new Binario(b1);
        scambio = b1;
        b1=b2;
    }
}
