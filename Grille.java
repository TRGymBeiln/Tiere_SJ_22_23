
/**
 * Beschreiben Sie hier die Klasse CopyOfElefant.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Grille implements TIER
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;

    /**
     * Konstruktor für Objekte der Klasse CopyOfElefant
     */
    public Grille()
    {
        // Instanzvariable initialisieren
        name = "Grille";
    }

    public String machtGeraeusch(){
        return "zirp! zirp!";
    }
}
