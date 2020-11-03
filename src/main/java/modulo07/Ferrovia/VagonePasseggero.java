package modulo07.Ferrovia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VagonePasseggero extends Vagone {

    private ArrayList<PasseggeroSemplice> passeggeriSimples;

    public VagonePasseggero(int maxCapienza,ArrayList <Porta> p, int idVagone) {
        super(maxCapienza,p,idVagone);
        passeggeriSimples=new ArrayList<>();
    }

    public void addPasseggeroSemplice(PasseggeroSemplice passeggeroSemplice){
        if (passeggeroSemplice.getIdVagone()==getIdVagone()){
            passeggeriSimples.add(passeggeroSemplice);
        }else
            System.out.println("Vagone Sbagliato");
    }

    public ArrayList<PasseggeroSemplice> getPasseggeriSimples() {
        return passeggeriSimples;
    }
}
