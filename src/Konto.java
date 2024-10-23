public class Konto {
    double kontostand;
    private String kontoNummer;
    private Kunde kunde;

    public Konto(Kunde kunde, String kontoNummer){
        this.kunde = kunde;
        this.kontostand = 0;
        this.kontoNummer = kontoNummer;
    }
    public double zahleEin(double betrag){
        this.kontostand += betrag;
        return kontostand;
    }
    public boolean hebeAb(double betrag) {
        if (betrag <= kontostand) {
            this.kontostand -= betrag;
            return true;
        }
        return false;
    }
    public double getKontostand() {
        return kontostand;
    }
    public String getKontonummer() {
        return kontoNummer;
    }
    public void setKontostand(int betrag) {
        this.kontostand = betrag;
    }
    public Kunde getErsterKontoinhaber() {
        return kunde;
    }
}
