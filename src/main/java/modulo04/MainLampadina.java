package modulo04;

import java.util.Arrays;
import java.util.Scanner;

public class MainLampadina {

    public static void main (String [] args){
        Lampadina lamp = new Lampadina();
        System.out.println(Arrays.toString(lamp.stato()));

        Interrutore inter1 = new Interrutore(lamp);
        Interrutore inter2 = new Interrutore(lamp);

        while (lamp.stato()[1]==1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. to use the first switch, 2. for the second, 3. to exit");
            int response = sc.nextInt();

            if (response == 1) {
                inter1.test(lamp);
                System.out.println(Arrays.toString(lamp.stato()));

            } else if (response == 2) {
                inter2.test(lamp);
                System.out.println(Arrays.toString(lamp.stato()));


            } else if (response==3){
                break;
            }
        }



    }
}
