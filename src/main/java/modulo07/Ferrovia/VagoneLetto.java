package modulo07.Ferrovia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VagoneLetto  extends Vagone{

    private ArrayList<PasseggeroAssonnato> passeggeriAssonnati;
    private int contaLetti;

    public VagoneLetto(int maxCapienza, ArrayList <Porta> p, int contaLetti, int idVagone) {
        super(maxCapienza, p, idVagone);
        this.contaLetti=contaLetti;
        this.passeggeriAssonnati=new ArrayList<>();
    }

    public void addPasseggeroAssonnato(PasseggeroAssonnato passeggeroAssonnato){
        if (passeggeroAssonnato.getIdVagone()==getIdVagone()){
            passeggeriAssonnati.add(passeggeroAssonnato);
        }else
            System.out.println("Vagone Sbagliato");
    }

}
