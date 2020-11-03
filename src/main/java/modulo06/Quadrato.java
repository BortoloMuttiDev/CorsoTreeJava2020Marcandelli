package modulo06;

public class Quadrato extends FormaGeometrica {



    public Quadrato(int lato) {
        super(lato);
    }

    @Override
    public int getLato() {
        return super.getLato();
    }

    @Override
    public void setLato(int lato) {
        super.setLato(lato);
    }


    @Override
    public int getArea() {
       int lato = super.getLato();
        return lato*lato;
    }

    @Override
    public int getPerimeter() {
        int lato = super.getLato();
        return lato*4;
    }

    @Override
    public String toString() {
        return "Il quadrato ha "+super.toString();
    }
}
