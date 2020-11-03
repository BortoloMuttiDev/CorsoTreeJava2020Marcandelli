package modulo06;

public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int nPosti;



    public Veicolo(String targa,int nPosti) {
        this.targa = targa;


        this.nPosti=nPosti;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getnPosti() {
        return nPosti;
    }

    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }

    @Override
    public String toString() {
        return
                "targa='" + targa + '\'' +
                        "numero posti "+this.nPosti+

                ' ';
    }
}
