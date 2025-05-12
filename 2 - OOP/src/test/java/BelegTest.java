import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


/**
 * JUnit-Testklasse für die Beleg-Klasse
 * 
 * Diese Tests prüfen die Funktionalitäten der Beleg-Klasse:
 * 1. Korrekte Initialisierung der Belegnummer bei 10000
 * 2. Automatische Erhöhung der Belegnummer für jeden neuen Beleg
 * 3. Korrekte Anzeige der nächsten Belegnummer
 * 4. Korrekte Zählung der erstellten Belege
 */

public class BelegTest {
    
    @Test
    public void testErsterBeleg() {
        // Stelle sicher, dass der erste Beleg die Nummer 10000 erhält
        Beleg beleg = new Beleg();
        assertEquals(10000, beleg.getBelegnummer(), 
                "Der erste erstellte Beleg sollte die Belegnummer 10000 haben");
    }
    
    @Test
    public void testMehrereBelege() {
        // Erstelle mehrere Belege und prüfe, ob die Nummern korrekt inkrementiert werden
        Beleg beleg1 = new Beleg();
        Beleg beleg2 = new Beleg();
        Beleg beleg3 = new Beleg();
        
        // Hier wird angenommen, dass dies die ersten Belege im Test sind
        // In einer echten Testumgebung müssten wir möglicherweise den Zähler zurücksetzen
        int ersteNummer = beleg1.getBelegnummer();
        assertEquals(ersteNummer + 1, beleg2.getBelegnummer(), 
                "Der zweite Beleg sollte eine um 1 erhöhte Belegnummer haben");
        assertEquals(ersteNummer + 2, beleg3.getBelegnummer(), 
                "Der dritte Beleg sollte eine um 2 erhöhte Belegnummer haben");
    }
    
    @Test
    public void testNaechsteBelegnummer() {
        // Prüfe, ob die statische Methode die korrekte nächste Belegnummer zurückgibt
        Beleg beleg = new Beleg();
        int aktuelleNummer = beleg.getBelegnummer();
        
        assertEquals(aktuelleNummer + 1, Beleg.getNaechsteBelegnummer(), 
                "Die nächste Belegnummer sollte um 1 höher sein als die letzte vergebene");
    }
    
    @Test
    public void testAnzahlBelege() {
        // Speichere die ursprüngliche Anzahl an Belegen
        int urspruenglicheAnzahl = Beleg.getAnzahlBelege();
        
        // Erstelle neue Belege
        new Beleg();
        new Beleg();
        new Beleg();
        
        // Prüfe, ob die Anzahl korrekt erhöht wurde
        assertEquals(urspruenglicheAnzahl + 3, Beleg.getAnzahlBelege(), 
                "Die Anzahl der Belege sollte um 3 erhöht worden sein");
    }
    
    @Test
    public void testKonstruktor() {
        // Prüfe, ob der Konstruktor korrekt funktioniert und die Belegnummer inkrementiert
        int naechsteNummerVorher = Beleg.getNaechsteBelegnummer();
        Beleg beleg = new Beleg();
        
        assertEquals(naechsteNummerVorher, beleg.getBelegnummer(), 
                "Die Belegnummer sollte der vorherigen nächsten Belegnummer entsprechen");
        assertEquals(naechsteNummerVorher + 1, Beleg.getNaechsteBelegnummer(), 
                "Die nächste Belegnummer sollte inkrementiert worden sein");
    }
}