package modulo06;

import java.nio.file.DirectoryStream;

public class DistributoreDiBevande {

    private Prodotto[] distributore;
    private double importo;

    public DistributoreDiBevande(int size) {
        distributore = new Prodotto[size];
    }

    public void caricaProdotto(Prodotto p) {


            for (int i = 0; i < distributore.length; i++) {
                if (distributore[i] == null) {
                    distributore[i] = p;
                    break;
                }

        }
    }

    public void inserisciImporto(double soldi) {
        this.importo = importo + soldi;
    }

    public Prodotto[] getDistributore() {
        return distributore;
    }

    public Prodotto scegliProdotto(String codice) {

        for (int i = 0; i < distributore.length; i++) {
            if (distributore[i]== null){
                return null;
            }
            if (codice.equals(distributore[i].getCodice())) {
                if (importo >= distributore[i].getPrezzo()) {
                    importo = importo - distributore[i].getPrezzo();
                    return distributore[i];
                }
            }
        }
        return null;
    }

    public double saldoAttuale(){
        return importo;
    }

 public double getResto(){
        double resto = importo;

        importo=0;
        return resto;
    }

}