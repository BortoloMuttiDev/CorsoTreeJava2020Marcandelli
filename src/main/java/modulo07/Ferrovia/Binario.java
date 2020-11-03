package modulo07.Ferrovia;

public class Binario {

    private Binario binario;


    public Binario(Binario binario1){
        this.binario = binario1;
    }

    public Binario getSuccessivo(){
        return binario;
    }

    public Binario percorri(Treno t){
       return getSuccessivo();
    }

    public Binario getBinario(){
        return this.binario;
    }

}
