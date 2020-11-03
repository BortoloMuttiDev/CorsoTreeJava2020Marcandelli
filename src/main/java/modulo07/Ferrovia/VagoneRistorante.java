package modulo07.Ferrovia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class VagoneRistorante extends Vagone {
    private ArrayList<Tavolo> tavoli = new ArrayList<>();
    private ArrayList<PasseggeroAffamato> passeggeroAffamati;


    public VagoneRistorante(int maxCapienza, ArrayList <Porta> p,int idVagone) {
        super(maxCapienza, p, idVagone);
        this.passeggeroAffamati=new ArrayList<>();
    }

    public class Tavolo {
        private int capienza;
        private int personeAlTavolo;
        public Tavolo(int capienza){
            this.capienza=capienza;

        }
    }


    public void addPasseggeroAffamato(PasseggeroAffamato PasseggeroAffamato){
        if (PasseggeroAffamato.getIdVagone()==getIdVagone()){
            passeggeroAffamati.add(PasseggeroAffamato);
        }else
            System.out.println("Vagone Sbagliato");
    }

}
