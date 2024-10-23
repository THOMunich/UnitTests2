import java.util.ArrayList;

public class Bank {
    private String bankName;
    private String blz;
    private ArrayList<Kunde> kundenListe;
    private ArrayList<Konto> kontenListe;
    private static Bank instance = null;

    public Bank(){
        this.bankName = "Commerzbank";
        this.blz = "0815 0915 0715 0615";
        this.kundenListe = new ArrayList<>();
        this.kontenListe = new ArrayList<>();
    }
    public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }
    public String getName() {
        return bankName;
    }
    public String getBLZ(){
        return blz;
    }
    public void addiereKunde(Kunde kunde) {
        kundenListe.add(kunde);
    }
    public void addiereKonto(Konto konto) {
        kontenListe.add(konto);
    }
}
