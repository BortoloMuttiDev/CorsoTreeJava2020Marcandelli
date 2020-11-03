package modulo06;

public class Rettangolo extends FormaGeometrica{
    private int latoLungo;

    public Rettangolo(int lato, int latoLungo) {
        super(lato);
        this.latoLungo=latoLungo;
    }

    @Override
    public int getLato() {
        return super.getLato();
    }

    @Override
    public void setLato(int lato) {
        super.setLato(lato);
    }

    public int getLatoLungo() {
        return latoLungo;
    }

    public void setLatoLungo(int latoLungo) {
        this.latoLungo = latoLungo;
    }


    public int getArea() {
        return (super.getLato()*latoLungo);
    }

    @Override
    public int getPerimeter() {

        return (super.getLato()*latoLungo)/2;
    }

    @Override
    public String toString() {
        return "Il rettangolo ha "+super.toString();
    }
}
