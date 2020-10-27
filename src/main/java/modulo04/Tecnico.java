package modulo04;

public class Tecnico {

    private String nome;
    private boolean ferie;
    private Riparazione riparazione;



    public Tecnico(String nome) {
        this.nome = nome;
        this.ferie=false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFerie() {
        this.ferie=true;
    }

    public Riparazione getRiparazione() {
        return riparazione;
    }

    public void setRiparazione(Riparazione riparazione) {
        this.riparazione = riparazione;
    }



    public void riparaTec(){

        riparazione.ripara();
    }

    public boolean getFerie(){
        return ferie;
    }

    @Override
    public String toString() {
        return "Tecnici{" +
                "nome='" + this.nome + '\'' +
                ", ferie=" + this.ferie +
                '}';
    }
}
