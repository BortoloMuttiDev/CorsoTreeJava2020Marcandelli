package modulo04;

import java.util.ArrayList;
import java.util.List;

public class MainRiparazioni {

    public static void main(String[] args) {
        DittaRiparazioni dittaRip= new DittaRiparazioni();
     /*   dittaRip.addRepair();
        dittaRip.addRepair();
        System.out.println(dittaRip.toString());
        System.out.println(dittaRip.getMaxPriorRiparazione().toString());
        Tecnico tecnico = new Tecnico("cirio" );
        tecnico.setRiparazione(dittaRip.getMaxPriorRiparazione());
        tecnico.riparaTec();
        System.out.println(dittaRip.getMaxPriorRiparazione().toString());
        */
        dittaRip.addTecnico();
        dittaRip.addTecnico();
        dittaRip.addTecnico();
        dittaRip.addTecnico();
        dittaRip.addTecnico();
        dittaRip.addTecnico();
        List<String> nomi = new ArrayList<String>();
        nomi.add("ciro");
        nomi.add("carlo");
        dittaRip.inFerie(nomi);
        System.out.println(dittaRip.getTecnici().toString());
    }

}
