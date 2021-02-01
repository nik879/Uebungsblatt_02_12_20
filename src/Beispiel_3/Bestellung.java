package Beispiel_3;

public class Bestellung {
    private String Nummer;
    private Bestellzeile[] Bestellzeilen;

    public Bestellung(String nummer, Bestellzeile[] bestellzeilen) {
        Nummer = nummer;
        Bestellzeilen = bestellzeilen;
    }

    public void printBestellung () {
        System.out.println("Bestellnummer = "+ this.Nummer);
        for (Bestellzeile Bestellzeile:this.Bestellzeilen
             ) {
            System.out.println("Name = "+Bestellzeile.getName());
            System.out.println("Preis = "+Bestellzeile.getPreis());
            System.out.println("Menge = "+Bestellzeile.getMenge());

        }
        
    }

    public double getKosten () {
        double sum=0;
        int i=0;
        for (Bestellzeile Bestellzeile:this.Bestellzeilen
        ) {
            sum += this.Bestellzeilen[i].getKosten();
            i++;
        }
        return sum;
    }


}
