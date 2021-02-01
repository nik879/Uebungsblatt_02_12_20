package Beispiel_4;

public class Anlage {
    private String Bezeichnung;
    private double initialWert;
    private int nutzungsdauer;
    private double restwert;
    private int alter;

    public Anlage(String bezeichnung, double initialWert, int nutzungsdauer) {
        Bezeichnung = bezeichnung;
        this.initialWert = initialWert;
        this.nutzungsdauer = nutzungsdauer;
        alter=0;
        restwert=initialWert;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

    public double getInitialWert() {
        return initialWert;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public double getRestwert() {
        return restwert;
    }

    public int getAlter() {
        return alter;
    }

    public void abschreiben() {

            if (alter < nutzungsdauer) {
                alter++;
                restwert = Math.floor((initialWert / nutzungsdauer * (nutzungsdauer - alter)));

            }

    }
    public void simulate(int maxJahre, int minWert) {
        while (true) {
            if (restwert>=0 && alter<maxJahre && restwert>minWert) {
                abschreiben();
                System.out.println("alter = " + alter);
                System.out.println("restwert = " + restwert);
            }
            else break;

        }
    }

    public Anlage renew(int zusatzWert, int zusatzJahre) {
        return new Anlage(this.Bezeichnung,restwert+zusatzWert,nutzungsdauer-alter+zusatzJahre);
    }
}
