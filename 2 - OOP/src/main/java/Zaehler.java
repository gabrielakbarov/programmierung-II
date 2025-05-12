public class Zaehler {
    int value;
    public Zaehler() {
        zuruecksetzen();
    }
    public void hochzaehlen(){
        this.value++;
    }

    public void zuruecksetzen(){
        this.value = 0;
    }

    public int getWert() {
        return value;
    }
}