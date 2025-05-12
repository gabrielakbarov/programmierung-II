import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit-Testklasse für die Zaehler-Klasse
 * 
 * Diese Tests prüfen die grundlegenden Funktionalitäten der Zaehler-Klasse:
 * 1. Initialisierung mit dem Wert 0
 * 2. Hochzählen erhöht den Wert um 1
 * 3. Mehrfaches Hochzählen funktioniert korrekt
 * 4. Zurücksetzen setzt den Wert auf 0 zurück
 * 
 * Um den Test auszuführen:
 * 1. Implementiere zuerst die Zaehler-Klasse
 * 2. Stelle sicher, dass JUnit 5 (Jupiter) im Klassenpfad verfügbar ist
 * 3. Führe diese Testklasse mit einem JUnit-Runner aus
 */
public class ZaehlerTest {
    
    @Test
    public void testZaehlerInitialisierung() {
        Zaehler zaehler = new Zaehler();
        assertEquals(0, zaehler.getWert(), "Zähler sollte mit 0 initialisiert werden");
    }
    
    @Test
    public void testHochzaehlen() {
        Zaehler zaehler = new Zaehler();
        zaehler.hochzaehlen();
        assertEquals(1, zaehler.getWert(), "Nach einmaligem Hochzählen sollte der Wert 1 sein");
    }
    
    @Test
    public void testMehrfachHochzaehlen() {
        Zaehler zaehler = new Zaehler();
        for (int i = 0; i < 5; i++) {
            zaehler.hochzaehlen();
        }
        assertEquals(5, zaehler.getWert(), "Nach 5-maligem Hochzählen sollte der Wert 5 sein");
    }
    
    @Test
    public void testZuruecksetzen() {
        Zaehler zaehler = new Zaehler();
        zaehler.hochzaehlen();
        zaehler.hochzaehlen();
        zaehler.zuruecksetzen();
        assertEquals(0, zaehler.getWert(), "Nach Zurücksetzen sollte der Wert 0 sein");
    }
    
    @Test
    public void testHochzaehlenNachZuruecksetzen() {
       // Implementiere einen weiteren Test der hochzählt zurücksetzt nochmal hochzält und dann den Wert 1 haben sollte
    }
}