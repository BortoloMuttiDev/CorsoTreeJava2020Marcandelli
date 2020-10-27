package modulo04;

import javax.swing.*;

public class Lampadina {
    private int accesa;
    private int stato;
    private  int count = 0;
    private boolean corrente=true;



    public Lampadina(){
        this.accesa=0;
        this.stato=1;
    }

    public int[] stato(){
        int [] status;

        if (accesa==1|| corrente) {
            status= new int[]{1, 1};
            return status;
        }
        else if(count>3) {
            status = new int[]{0, 0};
            return status;
        } else
            return status = new int[]{0, 1};

    }

    public void click() {

        if (stato == 1) {

           count++;
                if (accesa==0)
                  accesa = 1;
                else {
                    accesa = 0;
                }
            }
        if (count>3) {
            System.out.println("Cannot turn on a broken lamp");
            stato = 0;
        }
    }

    public void setCorrente(){

        if (corrente)
            corrente=false;
        else
            corrente=true;

    }

}
