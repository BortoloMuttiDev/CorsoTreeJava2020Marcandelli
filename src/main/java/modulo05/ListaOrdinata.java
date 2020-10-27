package modulo05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaOrdinata {

    private int[] values;
    private int[] nuovoArray;
    private int[] array;

    public ListaOrdinata(int[] values) {
        this.values = values;
    }

    public int[] insert(int x) {

        int[] array = verificaArray(values);

        for (int i = 0; i < values.length+1; i++) {


            if (x < array[i]) {
               int y = array[i];
                array[i] = x;
                x=y;
            }



        }

return array;
    }

    public int indexOf(int[] values,int x) {

        BinarySearch bin = new BinarySearch();
        return bin.binarySearch(values,x);


    }

    public int[] remove(int[] values,int x) {

        int index =  indexOf(values,x);

        int [] nuovoArray = new int[values.length-1];

        for (int i = 0; i < index ; i++) {
            nuovoArray[i] = values[i];
        }
        nuovoArray[index] = values[index+1];

        for (;index < nuovoArray.length ; index++) {

            nuovoArray[index] = values[index+1];

        }
        return nuovoArray;
    }
    public int[] verificaArray(int[] values) {

        int index = values.length*2;
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                int[] nuovoArray = new int[index];

                for (int j = 0; j < index; j++) {
                    if(j<values.length) {
                        nuovoArray[j] = values[j];
                    }else  {
                        nuovoArray[j]= Integer.MAX_VALUE;
                    }
                }
                return nuovoArray;
            }

        }

        return values;
    }
}