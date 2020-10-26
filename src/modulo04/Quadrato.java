package modulo04;

public class Quadrato extends Colore {

    int lato;

    public Quadrato() {
        super();
    }

    public Quadrato(int lato) {
        super();
        this.lato = lato;
    }
    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    public int getPerimetro(){
        return lato*4;
    }

    public void printArray2D() {
       char [][] arrayInt = new char[lato][lato];

        for (int i = 0; i < arrayInt.length; i++)
            for (int j = 0; j < arrayInt[0].length; j++)
                arrayInt[i][j] = '-';

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[0].length; j++) {
                System.out.print(arrayInt[i][j]);
                if (j != arrayInt[0].length - 1) System.out.print("  ");
            }
            System.out.println("");
        }
    }



}
