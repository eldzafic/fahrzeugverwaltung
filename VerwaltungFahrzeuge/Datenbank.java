import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Datenbank.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Datenbank
{
    ArrayList <Fahrzeug> Fahrzeuge = new ArrayList <Fahrzeug>();
    //PKW pkw = new PKW();
    //LKW lkw = new LKW();
	//
	//Kommentar von marhassler
	//
    /**
     * Konstruktor für Objekte der Klasse Datenbank
     */
    public Datenbank()
    {

    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void ListeFahrzeuge()
    {
        for(Fahrzeug m : Fahrzeuge)
        {
            System.out.println(m);
        }        
    }

    public void erzeugeAuto()
    {
        PKW pkw = new PKW();
        pkw.AddPKW();
        Fahrzeuge.add(pkw);
    }

    public void erzeugeLkw()
    {
        LKW lkw = new LKW();
        lkw.AddLKW();
        Fahrzeuge.add(lkw);
    }

    public void ListePkw()
    {
        for(Fahrzeug m : Fahrzeuge)
        {
            if(m instanceof PKW)
            {
                PKW pkw = (PKW)m;
                System.out.println(m.toString());
            }
        }
    }
    
    public void ListeLkw()
    {
        for(Fahrzeug l : Fahrzeuge)
        {
            if(l instanceof LKW)
            {
                LKW lkw = (LKW)l;
                System.out.println(l.toString());
            }
        }
    }
}
