package Beispiel_5;

public class DemoBonusberechnungMitarbeiter {
    public static void main(String[] args) {
        Mitarbeiter Niki = new Mitarbeiter("Niki", "Kachelmaier", 28000, 22);
        Mitarbeiter Hannes = new Mitarbeiter("Hannes", "Temmel", 60000, 22);
        System.out.println(Niki.monatsAbrechnung());
        System.out.println(Niki.jahresAbrechnung(5));
//        System.out.println(Hannes.monatsAbrechnung());
    }
}
