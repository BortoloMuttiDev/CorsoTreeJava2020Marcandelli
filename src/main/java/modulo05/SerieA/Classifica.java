package modulo05.SerieA;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import modulo05.MergeSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classifica {


    private Squadra[] squadre = new Squadra[4];

    public void esitoPartita(Squadra squadraCasa, int goalCasa, Squadra squadraOspite, int goalOspite) {

        squadraCasa.setGoalFatti(goalCasa);
        squadraCasa.setGoalSubiti(goalOspite);
        squadraOspite.setGoalFatti(goalOspite);
        squadraOspite.setGoalSubiti(goalCasa);

        if (goalCasa > goalOspite) {
            squadraCasa.setPunteggio(squadraCasa.getPunteggio() + 3);
        } else if (goalCasa == goalOspite) {
            squadraCasa.setPunteggio(squadraCasa.getPunteggio() + 1);
            squadraOspite.setPunteggio(squadraOspite.getPunteggio() + 1);
        } else
            squadraOspite.setPunteggio(squadraOspite.getPunteggio() + 3);

    }

    public void addSquadra(Squadra squadra) {

        for (int i = 0; i < squadre.length; i++) {
            if (squadre[i] == null) {
                squadre[i] = squadra;
                System.out.println("Team successfully added");
                break;
            } else if (squadra.getId() == squadre[i].getId()) {
                System.out.println("Team already added");
                break;
            }


        }
    }

    public void sortSquadreByPunteggio() {
        Arrays.sort(squadre, Comparator.comparing(Squadra::getPunteggio).reversed());
    }

    public Squadra getBestAttack() {
        Arrays.sort(squadre, Comparator.comparing(Squadra::getGoalFatti).reversed());
        return squadre[0];
    }

    public Squadra getWorstDefense() {
        Arrays.sort(squadre, Comparator.comparing(Squadra::getGoalSubiti).reversed());
        return squadre[0];
    }


}
