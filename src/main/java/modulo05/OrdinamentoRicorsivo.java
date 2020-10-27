package modulo05;

import java.util.Arrays;

public class OrdinamentoRicorsivo {

        private int [] values;
         int min =Integer.MAX_VALUE;
         int max = 0;
         int index = 0;
        public OrdinamentoRicorsivo(int[] values){
            this.values=values;
        }


        public int getMinMax(){
            if(values.length==index){
                return -1;
            }

            max = getMax(index);
            min = getMin(index);
            index++;
            System.out.println(min+" "+max);
            return getMinMax();
        }

    public int getMax(int index) {
            if (values[index]>max)
                max=values[index];
        return max;
    }

    public int getMin(int index) {
            if (values[index]<min)
                min=values[index];
            return min;
    }
}
