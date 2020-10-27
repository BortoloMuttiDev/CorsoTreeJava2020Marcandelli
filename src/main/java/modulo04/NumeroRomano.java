package modulo04;

import java.util.List;
import java.util.stream.Collectors;

public class NumeroRomano<T> {


    private String numero;

    public NumeroRomano(String numero){
        this.numero=numero;
    }



    public int romanToDecimal(char roman) {
        if (roman == 'M') {
            return 1000;
        }
        if (roman == 'D') {
            return 500;
        }
        if (roman == 'C') {
            return 100;
        }
        if (roman == 'L') {
            return 50;
        }
        if (roman == 'X') {
            return 10;
        }
        if (roman == 'V') {
            return 5;
        }
        if (roman == 'I') {
            return 1;
        }
        return 0;
    }

   public int getValore() {
        char[] numeri = numero.toCharArray();
        int res = 0;

        for (int i = 0; i < numeri.length; i++) {
            int first = romanToDecimal(numeri[i]);


            if (i + 1 < numeri.length) {
                int second = romanToDecimal(numeri[i+1]);



                if(first>=second){
                    if(romanToDecimal(numeri[i+2])>second && romanToDecimal(numeri[i+2])<numeri.length){
                        res = res+first;
                    } else {
                        res = res + first + second;
                        i++;
                    }

                }
                else if (second>first) {
                    res = res + (second - first);
                    i++;
                }
            }

            else
                res = res+first;

        }
return res;

    }
}