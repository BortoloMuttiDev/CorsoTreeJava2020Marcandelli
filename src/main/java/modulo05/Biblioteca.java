package modulo05;




public class Biblioteca {

    private int[] values;



    public Biblioteca(int[] values){
        MergeSort mrg = new MergeSort();
        this.values=mrg.mergeSort(values);
    }

    public boolean esisteLibro(int index){

           BinarySearch bin = new BinarySearch();

           if (values[bin.binarySearch(values,index)]==index) {
               return true;
           }
           else {
               return false;
           }

    }

    public int[] getIndiciLibriOrdinati(){

        return values;

    }

}
