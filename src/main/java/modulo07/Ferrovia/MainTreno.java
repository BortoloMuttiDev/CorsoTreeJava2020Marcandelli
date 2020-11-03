package modulo07.Ferrovia;

public class MainTreno {
    public static void main(String[] args) {
        VagonePasseggero vagone = new VagonePasseggero(3,2);
        PasseggeroSemplice p1 = new PasseggeroSemplice("ciro", 2,2);
        vagone.addPasseggeroSemplice(p1);
        PasseggeroAffamato p2 = new PasseggeroAffamato("carlo", 2, 2);

        String list = vagone.getPasseggeriSimples().toString();
        System.out.println(list);
        System.out.println(" "+vagone.getPasseggeriSimples());


    }
}
