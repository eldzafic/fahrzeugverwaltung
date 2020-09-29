import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Menue.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Menue
{
    Datenbank db = new Datenbank();
    /**
     * Konstruktor für Objekte der Klasse Menue
     */
    public Menue()
    {

    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void menu()
    {
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        
        do{

            System.out.println("(1) Einfuegen PKW");
            System.out.println("(2) Einfuegen LKW");
            System.out.println("(3) Liste aller PWK");
            System.out.println("(4) Liste aller LKW");
            System.out.println("(5) Liste aller Fahrzeuge");
            System.out.println("---------------------------------------");
            System.out.println("(6) Programm beenden");
            int auswahl = scan.nextInt();
            switch(auswahl)
            {
                case 1:
                    db.erzeugeAuto();
                break;
                case 2:
                    db.erzeugeLkw();
                break;
                case 3:
                    db.ListePkw();
                break;
                case 4:
                    db.ListeLkw();
                break;
                case 5:
                    db.ListeFahrzeuge();
                break;
                case 6:
                System.out.println("Good-Bye");
                check = false;
            }
        }
        while(check);
    }
}
