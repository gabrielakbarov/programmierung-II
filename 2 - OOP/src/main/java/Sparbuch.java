public class Sparbuch {
    String kontonummer;
    double kapital;
    double zinssatz;

    public Sparbuch(String kontonummer, double kapital, double zinssatz) {
        this.kontonummer = kontonummer;
        this.kapital = kapital;
        this.zinssatz = zinssatz;
    }

    public void zahleEin(double einzahlung){
        this.kapital += einzahlung;
    }

    public void hebeAb(double abhebung){
        if(abhebung < this.kapital) {
            this.kapital -= abhebung;
        }
    }

    public double getErtrag(int laufzeit, double kapital, double zinssatz){
        return kapital * Math.pow((1 + zinssatz/100), laufzeit);
    }

    public void verzinse(){
        this.kapital *= (1 + zinssatz/100);
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKapital() {
        return kapital;
    }

    public double getZinssatz() {
        return zinssatz;
    }

}
