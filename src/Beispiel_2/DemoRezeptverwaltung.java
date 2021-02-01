package Beispiel_2;

public class DemoRezeptverwaltung {
    public static void main(String[] args) {
        Zutat[] arrZutaten= new Zutat[3];

        arrZutaten [0] = new Zutat("Wein",250);
        arrZutaten [1] = new Zutat("Faschiertes",500);
        arrZutaten [2] = new Zutat("Parmesan", 80);

        Rezept Bolognes = new Rezept("Bolognes", 2, arrZutaten);
        Bolognes.printRezept();

        Bolognes.umrechnen(4).printRezept();
    }
}
