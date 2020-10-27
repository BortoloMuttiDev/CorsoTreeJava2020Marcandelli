package modulo04;


public class Contatore {

    private int cont;


    public Contatore(int cont){
        this.cont=cont;
    }
    public Contatore(){
        cont = 0;
    }

    public int getCont(){
        return cont;
    }

    public void incCont (){
        cont++;
    }


    public void resetCont(int res){
        cont = res;
    }

    public void resetContZero(){
        cont = 0;
    }

}
