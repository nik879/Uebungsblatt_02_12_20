package Beispiel_4;

public class DemoAbschreibung {
    public static void main(String[] args) {
        Anlage Computer = new Anlage("Computer", 100, 4);
//        Computer.abschreiben();
//        Computer.simulate(10,0);
        System.out.println(Computer.renew(1000, 2).getBezeichnung());
        System.out.println(Computer.renew(1000, 2).getNutzungsdauer());
        System.out.println(Computer.renew(1000, 2).getRestwert());


    }

}
