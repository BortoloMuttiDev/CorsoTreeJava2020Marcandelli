package modulo04;

public class Riparazione {
    private String indirizzo;
    private int prior;
    private boolean done;

    public Riparazione(String indirizzo, int prior){
        this.indirizzo = indirizzo;
        this.prior=prior;
        this.done = false;
    }


    public String getIndirizzo() {
        return indirizzo;
    }



    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getPrior() {
        return prior;
    }

    public void setPrior(int prior) {
        this.prior = prior;
    }

    public void ripara(){
        this.done = true;
    }

    public boolean getDone (){
        return done;
    }


    @Override
    public String toString() {
        return "Riparazione{" +
                "indirizzo='" + this.indirizzo + '\'' +
                ", prior=" + this.prior +
                ", done=" + this.done +
                '}';
    }
}
