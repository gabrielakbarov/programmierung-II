public class Beleg {
  static int belegnummer = 10000;
  int id;

  public Beleg(){
      this.id = belegnummer++;
  }

  public int getBelegnummer(){
      return this.id;
  }

  public static int getNaechsteBelegnummer(){
      return belegnummer;
  }

  public static int getAnzahlBelege(){
      return belegnummer-10000;
  }
}
