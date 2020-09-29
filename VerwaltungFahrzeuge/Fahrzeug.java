import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Fahrzeug.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fahrzeug
{
    private String farbe;
    private String leistung;
    private String gewicht;
    private String motornummer;
    private Zulassung zulas = new Zulassung();
    private int id;

    /**
     * Konstruktor für Objekte der Klasse Fahrzeug
     */
    public Fahrzeug()
    {

    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void AddFahrzeug()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ID ein: ");
        setId(scan.nextInt());
        System.out.println("Bitte geben Sie die Farbe des Fahrzeugs ein: ");
        setFarbe(scan.next());
        System.out.println("Bitte geben Sie die Leistung des Fahrzeugs in PS an: ");
        setLeistung(scan.next());
        System.out.println("Bitte geben Sie das Gewicht des Fahrzeugs in KG an: ");
        setGewicht(scan.next());
        System.out.println("Bitte geben Sie die Motornummer des Fahrzeugs an: ");
        setMotornummer(scan.next());

        zulas.AddZulassung();
    }

    public String toString()
    {
        return "ID: " +getId() +"\nFarbe: " +getFarbe() + "\nLeistung: " + getLeistung() + "\nGewicht: " + getGewicht() + "\nMotornummer: " + getMotornummer() + zulas.toString();
    }

    public void AusgabeFahrzeug()
    {
        System.out.print(getId() +", ");
        System.out.print(getFarbe() +", ");
        System.out.print(getLeistung() +"PS" +", ");
        System.out.print(getGewicht() +"KG" +", ");
        System.out.print(getMotornummer() +", ");
        System.out.print(zulas.getName() +", ");
        System.out.print(zulas.getStrasse() +", ");
        System.out.print(zulas.getPlz() +", ");
        System.out.print(zulas.getOrt()+", ");
    }

    public int getId()
    {
        return this.id;
    }

    public String getFarbe()
    {
        return this.farbe;
    }

    public String getLeistung()
    {
        return this.leistung;
    }

    public String getGewicht()
    {
        return this.gewicht;
    }

    public String getMotornummer()
    {
        return this.motornummer;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setFarbe(String farbe)
    {
        this.farbe = farbe;
    }

    public void setMotornummer(String motornummer)
    {
        this.motornummer = motornummer;
    }

    public void setLeistung(String leistung)
    {
        this.leistung = leistung;
    }

    public void setGewicht(String gewicht)
    {
        this.gewicht = gewicht;
    }

    public Zulassung getZulassung()
    {
        return this.zulas;
    }

}