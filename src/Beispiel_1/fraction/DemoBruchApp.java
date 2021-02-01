package Beispiel_1.fraction;


import accounts_fuer_Beispiel_1.Konto;

public class DemoBruchApp {

    public static void main(String[] args) {

        Konto konto = new Konto("John Doe");


        Bruch b1 = new Bruch(5, 7);
        System.out.println("b1.toDecimal() = " + b1.toDecimal());
        b1.print();

        System.out.println("b1.countBrueche = " + b1.countBrueche);

        Bruch dreiViertel = new Bruch(3, 4);
        System.out.println("dreiViertel.countBrueche = " + dreiViertel.countBrueche);
        System.out.println("b1.countBrueche = " + b1.countBrueche);
        System.out.println("fraction.Bruch.countBrueche = " + Bruch.countBrueche);

        Bruch erg = b1.multiplicate(dreiViertel);
        System.out.println("erg.toDecimal() = " + erg.toDecimal());
        erg.print();

        Bruch fuenfSechstel = new Bruch(5, 6);
        Bruch erg2 = erg.multiplicate(fuenfSechstel);
        erg2.print();


        Bruch erg3 = b1.multiplicate(dreiViertel, fuenfSechstel);
        System.out.println("erg3: ");
        erg3.print();

        Bruch[] arr = new Bruch[] {dreiViertel, fuenfSechstel};
        System.out.println("erg4: ");

        /*Bruch erg4= erg3.multiplicate(arr);

        erg4.print();*/

        Bruch eineintl = new Bruch(1,1);

        Bruch einHalb = new Bruch(1, 2);

        Bruch[]arr2= new Bruch[]{einHalb,einHalb};

        einHalb.multiplicate(arr2).print();

        print(erg3);
        System.out.println("fraction.Bruch.countBrueche = " + Bruch.countBrueche);
        Bruch.printCountBrueche();

        Bruch zweisechzehntel = new Bruch(2,16);
        zweisechzehntel.trim();

    }

    public static void print(Bruch b){
        System.out.println(b.getZaehler() + " / " + b.getNenner() + " = " + b.toDecimal() );
    }
}
