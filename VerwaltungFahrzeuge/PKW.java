import java.util.*;
/**
 * Beschreiben Sie hier die Klasse PKW.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PKW extends Fahrzeug
{
    private String personen;
    private String marke;
    private String typ;

    /**
     * Konstruktor für Objekte der Klasse PKW
     */
    public PKW()
    {
        super();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void AddPKW()
    {
        Scanner scan = new Scanner(System.in);
        AddFahrzeug();
        System.out.println("Bitte geben Sie die Anzahl der Sitzplätze ein: ");
        setPersonen(scan.next());
        System.out.println("Bitte geben Sie die Auto-Marke ein: ");
        setMarke(scan.next());
        System.out.println("Bitte geben Sie den Fahrzeug-Typ ein: ");
        setTyp(scan.next());
    }
    
    public String toString()
    {
        return super.toString()+ "\nAnzahl Sitzplätze: " +getPersonen() +"\nMarke: " +getMarke() +"\nTyp:" +getTyp();
    }
    
    public void setPersonen(String personen)
    {
        this.personen = personen;
    }

    public void setMarke(String marke)
    {
        this.marke = marke;
    }

    public void setTyp(String typ)
    {
        this.typ = typ;
    }

    public String getPersonen()
    {
        return this.personen;
    }

    public String getMarke()
    {
        return this.marke;
    }

    public String getTyp()
    {
        return this.typ;
    }
}
