package modulo04;

import java.util.Scanner;

public class Interrutore {

    private Lampadina lamp ;

    public Interrutore(Lampadina lamp){
        this.lamp=lamp;
    }

    public void test(Lampadina lamp){
        lamp.click();

    }


}
