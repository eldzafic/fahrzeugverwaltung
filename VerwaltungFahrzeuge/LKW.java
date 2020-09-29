import java.util.*;
/**
 * Beschreiben Sie hier die Klasse LKW.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LKW extends Fahrzeug
{
    private String ladung;
    private String achsen;

    /**
     * Konstruktor für Objekte der Klasse LKW
     */
    public LKW()
    {
        super();
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void AddLKW()
    {
        Scanner scan = new Scanner(System.in);
        AddFahrzeug();
        System.out.println("Bitte geben Sie die Ladung in KG ein: ");
        setLadung(scan.next());
        System.out.println("Bitte geben Sie die Anzahl der Achsen ein: ");
        setAchsen(scan.next());
    }
    
    public String toString()
    {
        return super.toString() +"Ladung: " +getLadung() +"\nAchsen :" +getAchsen();
    }
    
    public void setLadung(String ladung)
    {
        this.ladung = ladung;
    }
    
    public void setAchsen(String achsen)
    {
        this.achsen = achsen;
    }
    
    public String getLadung()
    {
        return this.ladung;
    }
    
    public String getAchsen()
    {
        return this.achsen;
    }
}
