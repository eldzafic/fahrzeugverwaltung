import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Zulassung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zulassung
{
    private String name;
    private String strasse;
    private String plz;
    private String ort;

    /**
     * Konstruktor für Objekte der Klasse Zulassung
     */
    public Zulassung()
    {
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void AddZulassung()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Namen ein: ");
        setName(scan.next());
        System.out.println("Bitte geben Sie die Strasse ein: ");
        setStrasse(scan.next());
        System.out.println("Bitte geben Sie die Postleitzahl ein: ");
        setPlz(scan.next());
        System.out.println("Bitte geben Sie den Ort ein: ");
        setOrt(scan.next());
    }
    
    public String toString()
    {
        return "\nName: " +getName() +"\nStrasse: " +getStrasse() +"\nPostleitzahl: " +getPlz() +"\nOrt: " +getOrt();
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getStrasse()
    {
        return this.strasse;
    }
    
    public String getPlz()
    {
        return this.plz;
    }
    
    public String getOrt()
    {
        return this.ort;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setStrasse(String strasse)
    {
        this.strasse = strasse;
    }
    
    public void setPlz(String plz)
    {
        this.plz = plz;
    }
    
    public void setOrt(String ort)
    {
        this.ort = ort;
    }
    
}
