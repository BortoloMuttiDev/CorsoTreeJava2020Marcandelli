package modulo05;

import java.util.Arrays;

public class MainBiblioteca {

    public static void main(String[] args) {
        int[] values = new int[7];
        values[0] = 1;
        values[1] = 2;
        values[2] = 3;
        values[3] = 5;
        values[4] = 6;
        values[5] = 7;
        values[6] = 8;

        /*
        Biblioteca biblioteca = new Biblioteca(values);
        System.out.println(biblioteca.esisteLibro(76));
        int[] libriOrdinati = biblioteca.getIndiciLibriOrdinati();
        System.out.println(libriOrdinati[0] == 2);
        System.out.println(libriOrdinati[1] == 4);
        System.out.println(libriOrdinati[2] == 33);
        System.out.println(libriOrdinati[3] == 76);
        System.out.println(libriOrdinati[4] == 98);
        System.out.println(libriOrdinati[5] == 123);
        System.out.println(libriOrdinati[6] == 235);
        OrdinamentoRicorsivo ord = new OrdinamentoRicorsivo(values);
        ord.getMinMax();*/
          ListaOrdinata lst = new ListaOrdinata(values);
            int[] valori = lst.insert(4);
         System.out.println( lst.indexOf(valori, 4));
        System.out.println(Arrays.toString(lst.remove(valori,4)));


    }
}
