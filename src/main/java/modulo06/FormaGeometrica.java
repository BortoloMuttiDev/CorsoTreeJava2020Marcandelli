package modulo06;

public class FormaGeometrica {

    private int lato;
    private int perimeter;
    private int area;

    public FormaGeometrica(int lato){
        this.lato=lato;
    }

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    public int getArea(){

        return area;
    }

    public int getPerimeter(){

        return perimeter;
    }

    public String toString(){
        return " ha un area di "+ getArea()+ " ed un perimetro di "+getPerimeter();
    }

}
