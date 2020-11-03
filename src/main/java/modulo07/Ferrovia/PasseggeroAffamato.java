package modulo07.Ferrovia;

public class PasseggeroAffamato extends Passeggero{
    public PasseggeroAffamato(String nome, int codiceBiglietto, int idVagone) {
        super(nome, codiceBiglietto, idVagone);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getCodiceBiglietto() {
        return codiceBiglietto;
    }

    @Override
    public void setCodiceBiglietto(int codiceBiglietto) {
       this.codiceBiglietto=codiceBiglietto;
    }

    @Override
    public int getIdVagone() {
        return idVagone;
    }

    @Override
    public void setIdVagone(int idVagone) {
        this.idVagone=idVagone;
    }

    @Override
    public String toString() {
        return "PasseggeroAffamato{" +
                "nome='" + nome + '\'' +
                ", codiceBiglietto=" + codiceBiglietto +
                ", idVagone=" + idVagone +
                '}';
    }
}
