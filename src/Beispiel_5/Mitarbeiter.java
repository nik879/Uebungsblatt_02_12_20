package Beispiel_5;

public class Mitarbeiter {
    private String Vorname;
    private String Nachname;
    private int Mitarbeiternummer;
    private double Gehalt;
    private int Alter;

    public Mitarbeiter(String vorname, String nachname, double gehalt, int alter) {
        Vorname = vorname;
        Nachname = nachname;
        Gehalt = gehalt;
        Alter = alter;
    }

    public String getVorname() {
        return Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public int getMitarbeiternummer() {
        return Mitarbeiternummer;
    }

    public double getGehalt() {
        return Gehalt;
    }

    public int getAlter() {
        return Alter;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public void setGehalt(double gehalt) {
        Gehalt = gehalt;
    }

    public double monatsAbrechnung() {
        double Brutto = this.getGehalt()*0.8;
        double Bezug_Brutto=Brutto;
        double Steuern=0;
        if (Brutto < 10000) {
            Steuern= Bezug_Brutto*0.1;
        }
        else if (Brutto < 20000 && Brutto > 10000) {
            Steuern+=1000;
            Bezug_Brutto-=10000;
            Steuern += Bezug_Brutto*0.2;
        }
        else if (Brutto < 30000 && Brutto > 20000) {
            Steuern+=1000+10000*0.2;
            Bezug_Brutto-=20000;
            Steuern += Bezug_Brutto*0.32;
        }
        else if (Brutto < 50000 && Brutto > 30000) {
            Steuern+=1000+10000*0.2+10000*0.45;
            Bezug_Brutto-=30000;
            Steuern += Bezug_Brutto*0.45;
        }
        else if ( Brutto > 50000) {
            Bezug_Brutto-=50000;
            Steuern += Bezug_Brutto*0.6;
        }
        return Math.floor((Brutto-Steuern)/12);
    }

    public double jahresAbrechnung(int monate) {
        double Brutto = this.getGehalt()*0.8;
        double Bezug_Brutto=Brutto;
        double Steuern=0;
        if (Brutto < 10000) {
            Steuern= Bezug_Brutto*0.1;
        }
        else if (Brutto < 20000 && Brutto > 10000) {
            Steuern+=1000;
            Bezug_Brutto-=10000;
            Steuern += Bezug_Brutto*0.2;
        }
        else if (Brutto < 30000 && Brutto > 20000) {
            Steuern+=1000+10000*0.2;
            Bezug_Brutto-=20000;
            Steuern += Bezug_Brutto*0.32;
        }
        else if (Brutto < 50000 && Brutto > 30000) {
            Steuern+=1000+10000*0.2+10000*0.45;
            Bezug_Brutto-=30000;
            Steuern += Bezug_Brutto*0.45;
        }
        else if ( Brutto > 50000) {
            Bezug_Brutto-=50000;
            Steuern += Bezug_Brutto*0.6;
        }
        return Math.floor(((Brutto-Steuern)/12)*monate);
    }



    }

