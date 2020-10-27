package modulo04;

public class Colore {

    private int[] RGB = new int[3];
    private final static int[] bianco=  {255,255,255};
    private final static int[] nero=  {0,0,0};


    public Colore() {
        this.RGB=nero;
    }

    public int[] getColore() {
        return RGB;
    }

    public void setColor(int[] coloreNuovo ){
        this.RGB=coloreNuovo;
    }


}
