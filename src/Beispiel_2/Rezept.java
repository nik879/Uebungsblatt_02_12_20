package Beispiel_2;

public class Rezept {
    private String Name;
    private int Personen;
    Zutat[] Zutaten;

    public Rezept(String name, int personen, Zutat[] zutaten) {
        Name = name;
        Personen = personen;
        Zutaten = zutaten;
    }

    public String getName() {
        return Name;
    }

    public int getPersonen() {
        return Personen;
    }

    public Zutat[] getZutaten() {
        return Zutaten;
    }

    public void printRezept() {
        int i=1;
        System.out.println("Rezept= " + this.Name);
        for(Zutat Zutat : this.Zutaten) {
            System.out.println("Zutat "+i);
            System.out.println("Name:"+Zutat.getName());
            System.out.println("Menge: "+Zutat.getMenge());
            System.out.println("");
            i++;
        }
    }

    public Rezept umrechnen(int Personen) {


        Zutat[] arrZutaten = this.Zutaten;
        int anzahlPersonen=this.getPersonen();
        double MengeeinePerson;
        int i=0;
        for(Zutat Zutat : arrZutaten) {
            MengeeinePerson= arrZutaten[i].getMenge()/anzahlPersonen;
            double gewünschteMenge= MengeeinePerson*Personen;
            int intgewünschteMenge= (int) gewünschteMenge;
            arrZutaten [i] = new Zutat(this.Zutaten[i].getName(),intgewünschteMenge);
            i++;
        }

        return new Rezept(this.Name,Personen,arrZutaten);
    }
}
