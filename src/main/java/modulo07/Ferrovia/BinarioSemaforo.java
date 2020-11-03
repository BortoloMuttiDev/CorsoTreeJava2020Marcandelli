package modulo07.Ferrovia;

public class BinarioSemaforo extends Binario {

    private int milliS;

    public BinarioSemaforo(Binario binario1) {
        super(binario1);
        this.milliS=2;
    }


    @Override
    public Binario getSuccessivo() {
        return super.getSuccessivo();
    }

    @Override
    public Binario percorri(Treno t) {
        if (t instanceof FrecciaRossa|| milliS==0){
            return super.percorri(t);
        }
        else
            milliS--;
            return this;
    }
}
