package modulo06;

public class GestoreVeicoli {

    public static void main(String[] args) {
        Automobile automobile = new Automobile("cf123rm", 4, 4);
        AutoCarro autoCarro = new AutoCarro("ca133sm", 4, 2);
        System.out.println(automobile.toString());
        System.out.println(autoCarro.toString());

    }
}
