package modulo07.Ferrovia;

import java.util.ArrayList;
import java.util.UUID;

public class FrecciaRossa extends Treno {

    private ArrayList<Vagone> vagoni = new ArrayList<>();

    public FrecciaRossa(UUID codice, int speed, int maxVagoni, boolean fermo) {
        super(codice, speed, maxVagoni, fermo);
        this.vagoni = vagoni;
    }

    @Override
    public boolean getFermo() {
        return fermo;
    }

    @Override
    public boolean getArrivo() {
        return false;
    }


    public void partire() {
        setSpeed(getSpeed() + 1);
    }

    public void frenare() {
        setSpeed(0);

    }

    public void fermare(Vagone vagone) {
        setFermo(true);

    }

    public void aggiungiVagone(Vagone vagone) {


        if (getFermo() == true) {
            if (vagoni.size() < getMaxVagoni()) {
                vagoni.add(vagone);
            } else if (vagoni.size() > 0) {
                vagoni.remove(vagone);
            }

        }
    }

    public void rimuoviVagoniVuoti() {
        for (Vagone v : vagoni) {
            if (v instanceof VagonePasseggero) {
                if (((VagonePasseggero) v).getPasseggeriSimples().isEmpty()) {
                    vagoni.remove(v);
                }
            }
            if (v instanceof VagoneLetto) {
                if (((VagoneLetto) v).getPasseggeriAssonnati().isEmpty()) {
                    vagoni.remove(v);
                }
            }
            if (v instanceof VagoneRistorante) {
                if (((VagoneRistorante) v).getPasseggeroAffamati().isEmpty()) {
                    vagoni.remove(v);
                }
            }
        }
    }
    public void apriPorteTreno () {
        for (Vagone v: vagoni) {

            v.apriPorteVagone();

        }

    }
    public void chiudiPorteTreno() {
        for (Vagone v: vagoni) {

            v.apriPorteVagone();

        }
    }

    public void entraPasseggero (Vagone v, Passeggero passeggero) {
        if (getFermo() == true) {
            apriPorteTreno();

                if (v instanceof VagonePasseggero && passeggero instanceof PasseggeroSemplice) {
                    ((VagonePasseggero) v).addPasseggeroSemplice((PasseggeroSemplice) passeggero);
                }
                    if (v instanceof VagoneLetto && passeggero instanceof PasseggeroAssonnato) {
                        ((VagoneLetto) v).addPasseggeroAssonnato((PasseggeroAssonnato) passeggero);
                    }
                    if (v instanceof VagoneRistorante && passeggero instanceof PasseggeroAffamato) {
                        ((VagoneRistorante) v).addPasseggeroAffamato((PasseggeroAffamato) passeggero);
                    }

            }
            chiudiPorteTreno();
        }




    public void esciPasseggero () {
        if (getFermo() == true) {
            apriPorteTreno();
            for (Vagone v : vagoni) {
                if (v instanceof VagonePasseggero) {
                    ((VagonePasseggero) v).getPasseggeriSimples().clear();
                if (v instanceof VagoneLetto) {
                        ((VagoneLetto) v).getPasseggeriAssonnati().clear();
                }
                if (v instanceof VagoneRistorante) {
                   ((VagoneRistorante) v).getPasseggeroAffamati().clear();
                }
            }
        }
            chiudiPorteTreno();
    }
}
}
