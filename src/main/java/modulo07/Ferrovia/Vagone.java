package modulo07.Ferrovia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import modulo07.Ferrovia.StatoPorta;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vagone {

private int maxCapienza;

private  ArrayList<Porta> porte;
private int idVagone;


public Vagone(int maxCapienza,int idVagone){
    this.maxCapienza=maxCapienza;
    this.idVagone=idVagone;
    this.porte = new ArrayList<>();



}


public void apriPorteVagone(){
    for (Porta p : porte) {
        p.cambiaStatoPorta(p);
    }
}

@Data
public class Porta{
    private StatoPorta statoPorta;

    public Porta(){
        statoPorta=StatoPorta.APERTE;
    }

    public void cambiaStatoPorta(Porta p) {

        if (p.getStatoPorta() != StatoPorta.GUASTE) {

        if (p.getStatoPorta() == StatoPorta.CHIUSE) {
                p.setStatoPorta(StatoPorta.APERTE);
            }
        else if (p.getStatoPorta() == StatoPorta.APERTE) {
                p.setStatoPorta(StatoPorta.CHIUSE);
            }
        }
    }
}



}
