package modulo05.SerieA;

import java.util.Arrays;

public class MainCalcio {

    public static void main(String[] args) {
        Calciatore c1= new Calciatore(1,"Pablo","Picasso");
        Calciatore c2= new Calciatore(2,"Carlo","Boh");
        Squadra sq = new Squadra(1,"juve");
        Classifica classifica = new Classifica();
        sq.addCalciatore(c1);
        sq.addCalciatore(c1);
        sq.addCalciatore(c2);

        Squadra sq2 = new Squadra(2,"inter");
        Squadra sq3 = new Squadra(3,"milan");
        Squadra sq4 = new Squadra(4,"fiorentina");
        sq.addCalciatore(c1);
        sq.addCalciatore(c1);
        sq2.addCalciatore(c1);
        sq2.addCalciatore(c1);
        sq3.addCalciatore(c1);
        sq3.addCalciatore(c1);
        sq4.addCalciatore(c1);
        sq4.addCalciatore(c1);
        classifica.addSquadra(sq);
        classifica.addSquadra(sq2);
        classifica.addSquadra(sq3);
        classifica.addSquadra(sq4);

        System.out.println(Arrays.toString(sq.getRosa()));
        classifica.esitoPartita(sq,4,sq2,2);
        classifica.esitoPartita(sq3,1,sq4,1);
        classifica.sortSquadreByPunteggio();
        System.out.println(Arrays.toString(classifica.getSquadre()));
        System.out.println(classifica.getBestAttack());
        System.out.println(classifica.getWorstDefense().toString());
    }
}
