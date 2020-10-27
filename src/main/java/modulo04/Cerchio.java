package modulo04;

public class Cerchio {
    int raggio;

    public Cerchio (int raggio){
        this.raggio =raggio ;
    }

    public double getCirc(){
        return (2*Math.PI)*this.raggio ;
    }

    public double getArea(){
        return Math.pow(this.raggio,2)*Math.PI;
    }



}
