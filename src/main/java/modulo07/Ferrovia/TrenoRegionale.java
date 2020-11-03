package modulo07.Ferrovia;

import java.util.ArrayList;
import java.util.UUID;

public class TrenoRegionale extends Treno {


    private ArrayList<VagonePasseggero> vagoni;

    public TrenoRegionale(UUID codice, int speed, int maxVagoni, boolean fermo) {
        super(codice, speed, maxVagoni, fermo);
        this.vagoni = new ArrayList<>();
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
            if (vagone instanceof VagonePasseggero) {
                VagonePasseggero vagonePasseggero = (VagonePasseggero) vagone;
                if (getFermo() == true) {
                    if (vagoni.size() < getMaxVagoni()) {
                        vagoni.add(vagonePasseggero);
                    }

                }
            }
        }
    }

    public void rimuoviVagoniVuoti() {

        if (getFermo() == true) {
            for (VagonePasseggero v : vagoni) {

                if (v.getPasseggeriSimples().isEmpty()) {
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

        public void esciPasseggero (){

            if (getFermo() == true) {
                apriPorteTreno();
                for (VagonePasseggero vagonePasseggero:
                     vagoni) {
                    vagonePasseggero.getPasseggeriSimples().clear();
                }
            }
            chiudiPorteTreno();
        }



        public void entraPasseggero (Vagone vagone, Passeggero passeggero){
            if (getFermo() == true) {
                apriPorteTreno();

                    ((VagonePasseggero) vagone).addPasseggeroSemplice((PasseggeroSemplice) passeggero);


            }
            chiudiPorteTreno();
        }

    }
