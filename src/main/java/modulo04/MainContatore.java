package modulo04;

import java.util.Arrays;

public class MainContatore {



    public static void main(String [] args){

        Contatore conta = new Contatore();
        Contatore contaParametro = new Contatore(5);
        conta.incCont();
        System.out.println(conta.getCont());
        conta.resetContZero();
        System.out.println(conta.getCont());
        conta.resetCont(6);
        System.out.println(conta.getCont());
        System.out.println(contaParametro.getCont());

        Quadrato quadrato = new Quadrato(4);

        quadrato.printArray2D();

        Cerchio cerchio = new Cerchio(5);
        System.out.println(cerchio.getArea());
        System.out.println(cerchio.getCirc());

        Colore colore = new Colore();
        System.out.println(Arrays.toString(quadrato.getColore()));
    }
}
