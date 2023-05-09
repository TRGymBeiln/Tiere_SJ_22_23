
/**
 * Beschreiben Sie hier die Klasse Elefant.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Elefant implements TIER
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;

    /**
     * Konstruktor für Objekte der Klasse Elefant
     */
    public Elefant()
    {
        // Instanzvariable initialisieren
        name = "Elefant";
    }

    public String machtGeraeusch(){
        return "Törööö";
    }
}
