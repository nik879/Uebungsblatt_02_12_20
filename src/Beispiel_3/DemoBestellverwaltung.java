package Beispiel_3;

public class DemoBestellverwaltung {
    public static void main(String[] args) {
        Bestellung Schlafzimmer;
        Bestellzeile Schrank = new Bestellzeile("Schrank", 2, 250);
        Bestellzeile Bett = new Bestellzeile("Bett", 1, 800);
        Bestellzeile Konsole = new Bestellzeile("Konsole", 2, 600);
        Bestellzeile[] Bestellung_Schlafzimmer = {Schrank, Bett, Konsole};

        Schlafzimmer = new Bestellung("1", Bestellung_Schlafzimmer);
        Schlafzimmer.printBestellung();
        double Schlafzimmerkosten = Schlafzimmer.getKosten();
        System.out.println(Schlafzimmerkosten);
    }

}
