package Beispiel_3;

public class Bestellzeile {
    private String Name;
    private int Menge;
    private int Preis;

    public Bestellzeile(String name, int menge, int preis) {
        Name = name;
        Menge = menge;
        Preis = preis;
    }

    public String getName() {
        return Name;
    }

    public int getMenge() {
        return Menge;
    }

    public int getPreis() {
        return Preis;
    }

    public double getKosten() {

        return this.Menge*this.Preis;
    }


}
