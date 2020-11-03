package modulo07;

import java.util.Arrays;

public class ListaDiInteri implements Iterabile, Lista {
    int[] elementi;
    int element;
    int i;
    int grandezza=0;

    public ListaDiInteri(){
        this.elementi=new int[0];
    }

    @Override
    public Object next() {
       int element = elementi[i];
        i++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if(i+1>=elementi.length) {


            return false;
        }
        else
            return true;
    }

    @Override
    public void reset() {
        i=0;
    }


    @Override
    public Object get(int i) {
        Object o = elementi[i];
        return o;
    }

    @Override
    public boolean contains(Object o) {
        for (int j = 0; j < elementi.length ; j++) {
            if (elementi[j]==(int) o){
                return true;
            }

        }


        return false;
    }

    @Override
    public int size() {
        return elementi.length;
    }

    @Override
    public void add(Object o) {

        elementi = Arrays.copyOf(elementi, grandezza+1);

                elementi[elementi.length-1] = (int) o;

    }

    @Override
    public boolean remove(int i) {
            int[] nuovoArray = new int[elementi.length];
            int index=0;
            if(i<elementi.length){
        for (int j = 0; j < elementi.length ; j++) {
            if(j!= i){
                nuovoArray[index] = elementi[i];
                index++;
            }
        }

        }else
                return false;{

        elementi=nuovoArray;
            return true;}
    }

    @Override
    public void clear() {
        elementi = new int[0];

    }
}
