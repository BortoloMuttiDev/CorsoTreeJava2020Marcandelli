package modulo06;

public class MainFormeGeometriche {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(5);
        Rettangolo rettangolo = new Rettangolo(5,6);
        quadrato.getArea();
        rettangolo.getArea();
        quadrato.getPerimeter();
        rettangolo.getPerimeter();

        System.out.println(quadrato.toString()+"\n"+rettangolo.toString());

    }
}
