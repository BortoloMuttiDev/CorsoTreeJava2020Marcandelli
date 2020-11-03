/*
package modulo06;

public class MiniGestorePrenotazioni {
    private int postiInterno;
    private int postiEsterno;
    private Prenotazione[] prenotazioniEsterno;
    private Prenotazione[] prenotazioniInterno;
    private int countInterno;
    private int countEsterno;

    public MiniGestorePrenotazioni(int postiInterno, int postiEsterno) {
        this.postiInterno = postiInterno;
        this.postiEsterno = postiEsterno;
        prenotazioniEsterno = new Prenotazione[postiEsterno];
        prenotazioniInterno= new Prenotazione[postiInterno];
    }


    public boolean prenota(Prenotazione p) {

        if (p instanceof PrenotazioneSingola) {
            checkSingola(Prenotazione p)


        }
    }

    public boolean checkSingola(Prenotazione p) {

            PrenotazioneSingola pCasted = (PrenotazioneSingola) p;

            if(pCasted.getPreferenza()==Preferenza.INTERNO){

                if (postiInterno>=countInterno){
                    aggiungiInterno(pCasted);
                    postiInterno--;
                    countInterno++;
                    return true;
                }
            }else {

                if (postiEsterno>=countEsterno) {
                    aggiungiEsterno(pCasted);
                    postiEsterno--;
                    countEsterno++;
                    return true;
                }
            }
        return false;
    }

    public void aggiungiInterno(Prenotazione p) {


        for (int i = 0; i < postiInterno; i++) {
            if (prenotazioniInterno[i] == null) {
                prenotazioniInterno[i] = p;
                break;
            }
        }
    }
        public void aggiungiEsterno(Prenotazione p) {


            for (int i = 0; i < postiEsterno; i++) {
                if (prenotazioniEsterno[i] == null) {
                    prenotazioniEsterno[i] = p;
                    break;
                }

            }
    }

    public Prenotazione[] getPrenotazioniEsterno() {
        return prenotazioniEsterno;
    }

    public Prenotazione[] getPrenotazioniInterno() {
        return prenotazioniInterno;
    }


}
*/
