package modulo04;

import java.util.*;
import java.util.stream.Collectors;

public class DittaRiparazioni {

    private List<Tecnico> tecnici = new ArrayList<Tecnico>();
    private List<Riparazione> riparazioni = new ArrayList<Riparazione>();

    public void addRepair() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire indirizzo per la riparazione");
        String indirizzo = sc.nextLine();
        System.out.println("Inserire priorità da 1 a 10");
        int prior = sc.nextInt();
        Riparazione rip = new Riparazione(indirizzo, prior);
        if (!riparazioni.stream().anyMatch(x -> x.getIndirizzo().equals(rip.getIndirizzo()))) {
            riparazioni.add(rip);
        } else
            System.out.println("L'indirizzo immesso è già in attesa di lavorazione");
    }

    public List<Riparazione> getRiparazioni() {
        List<Riparazione> daFare = riparazioni.stream().filter(x -> !x.getDone()).collect(Collectors.toList());
        return daFare;
    }

    public Riparazione getMaxPriorRiparazione() {
        riparazioni = getRiparazioni();
        return Collections.max(riparazioni, Comparator.comparing(Riparazione::getPrior));
    }

    public void addTecnico() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire il nome di un tecnico");
        String nome = sc.nextLine().toLowerCase();

        Tecnico tecnico = new Tecnico(nome);
        if (!tecnici.stream().anyMatch(x -> x.getNome().equals(tecnico.getNome()))) {
            tecnici.add(tecnico);
        } else {
            System.out.println("Hai già aggiunto questo tecnico");
        }
    }

    public void inFerie(List<String> nomi) {
        for (Tecnico tecnico : tecnici) {
            for (String n : nomi) {
                if (n.equals(tecnico.getNome())) {
                    tecnico.setFerie();
                }
            }

        }
    }


    public List<Tecnico> getTecnici() {
        return tecnici.stream().filter(x -> !x.getFerie()).collect(Collectors.toList());
    }





}
