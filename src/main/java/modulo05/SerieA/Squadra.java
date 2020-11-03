package modulo05.SerieA;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Squadra {

    private Integer id=0;
    private String nome;
    private Calciatore[] rosa;
    private int punteggio;
    private int goalFatti;
    private int goalSubiti;

    public Squadra(int id ,String nome){
        this.id = id;
        this.nome=nome;
        this.rosa= new Calciatore[4];
        this.punteggio=0;
        this.goalFatti=0;
        this.goalSubiti=0;
    }


    public void addCalciatore(Calciatore calciatore) {

        for (int i = 0; i < rosa.length ; i++) {
            if (rosa[i]== null ){
                rosa[i] = calciatore;
                System.out.println("Player successfully added");
                break;
            }
            else if (calciatore.getId()==rosa[i].getId()){
                System.out.println("Player already added");
                break;
            }


        }
    }


    public String toString(){
        return "La squadra "+this.nome+
                " ha il punteggio:"+this.punteggio+
                ", ha segnato "+this.goalFatti+
                " goals e subito "+this.goalSubiti+
                " goals \n";
    }
}
