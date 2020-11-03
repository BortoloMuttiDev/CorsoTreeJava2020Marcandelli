package modulo07.Ferrovia;

public class BinarioCapolinea extends BinarioStazione {


    public BinarioCapolinea(Binario binario1) {
        super(binario1);
    }

    /*public void arrivato(Treno t) {
        if (t.getArrivo==false){
        t.setArrivo(true);
        }
        System.out.println("Il treno è arrivato al capolinea");
    }*/

    @Override
    public Binario getBinario() {
        return super.getBinario();
    }
}
