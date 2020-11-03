package modulo06;

import lombok.Data;

@Data
public class Prodotto {
    private final String codice;
    private final double prezzo;



    public Prodotto(String codice, double prezzo) {
        this.codice = codice;
        this.prezzo = prezzo;
    }


}
