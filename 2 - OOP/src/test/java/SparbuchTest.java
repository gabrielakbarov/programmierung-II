import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * JUnit-Testklasse für die Sparbuch-Klasse
 * 
 * Diese Tests prüfen die grundlegenden Funktionalitäten der Sparbuch-Klasse:
 * 1. Getter-Methoden für Kontonummer, Kapital und Zinssatz
 * 2. Einzahlung und Abhebung
 * 3. Verzinsung
 * 4. Ertragsberechnung
 */
public class SparbuchTest {
    
    @Test
    public void testKonstruktorUndGetter() {
        Sparbuch sparbuch = new Sparbuch("DE12345678", 1000.0, 2.5);
        
        assertEquals("DE12345678", sparbuch.getKontonummer(), "Kontonummer sollte korrekt gespeichert werden");
        assertEquals(1000.0, sparbuch.getKapital(), 0.001, "Kapital sollte korrekt initialisiert werden");
        assertEquals(2.5, sparbuch.getZinssatz(), 0.001, "Zinssatz sollte korrekt gespeichert werden");
    }
    
    @Test
    public void testZahleEin() {
        Sparbuch sparbuch = new Sparbuch("DE12345678", 1000.0, 2.5);
        
        sparbuch.zahleEin(500.0);
        assertEquals(1500.0, sparbuch.getKapital(), 0.001, "Nach Einzahlung von 500€ sollte Kapital 1500€ betragen");
    }
    
    @Test
    public void testHebeAb() {
        Sparbuch sparbuch = new Sparbuch("DE12345678", 1000.0, 2.5);
        
        sparbuch.hebeAb(300.0);
        assertEquals(700.0, sparbuch.getKapital(), 0.001, "Nach Abhebung von 300€ sollte Kapital 700€ betragen");
    }
    
    @Test
    public void testHebeAbZuViel() {
        Sparbuch sparbuch = new Sparbuch("DE12345678", 1000.0, 2.5);
        
        sparbuch.hebeAb(1200.0);
        assertEquals(1000.0, sparbuch.getKapital(), 0.001, "Bei Abhebung über Kapitalgrenze sollte Kapital unverändert bleiben");
    }
    
    @Test
    public void testVerzinse() {
        Sparbuch sparbuch = new Sparbuch("DE12345678", 1000.0, 2.5);
        
        sparbuch.verzinse();
        assertEquals(1025.0, sparbuch.getKapital(), 0.001, "Nach Verzinsung mit 2,5% sollte Kapital 1025€ betragen");
    }
    
    @Test
    public void testGetErtrag() {
        Sparbuch sparbuch = new Sparbuch("DE12345678", 1000.0, 2.5);
        
        // Zinseszins nach 3 Jahren: 1000 * (1 + 0.025)^3 = 1076.89...
        double erwarteterErtrag = 1076.89;
        assertEquals(erwarteterErtrag, sparbuch.getErtrag(3, 1000, 2.5), 0.01, "Kapital nach 3 Jahren mit 2,5% Zins sollte ca. 1076.89€ betragen");
    }
    
    @Test
    public void testKomplexerAblauf() {
        Sparbuch sparbuch = new Sparbuch("DE12345678", 1000.0, 2.5);
        
        sparbuch.zahleEin(500.0);   // Kapital: 1500€
        sparbuch.verzinse();        // Kapital: 1537.50€ (1500 * 1.025)
        sparbuch.hebeAb(37.50);     // Kapital: 1500€
        
        assertEquals(1500.0, sparbuch.getKapital(), 0.001, "Nach Einzahlung, Verzinsung und Abhebung sollte Kapital 1500€ betragen");
    }
}