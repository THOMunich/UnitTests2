import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KontoTest {

    Bank bank;// = new Bank();
    Kunde kunde1; // = new Kunde();
    Konto konto1; // = new Konto();

    @BeforeEach
    public void setUp() {
        bank = Bank.getInstance();
        kunde1 = new Kunde("Meier", 4711);
        konto1 = new Konto(kunde1, "65502757");
        bank.addiereKunde(kunde1);
        bank.addiereKonto(konto1);
    }

    @Test
    public void testGetKontostandDefault() {
        assertEquals(0.00, konto1.getKontostand(), 0.01);
    }

    @Test
    public void testSetKontostandDefault() {
        konto1.setKontostand(100);
        assertEquals(100.00, konto1.getKontostand(), 0.01);
    }

    @Test
    public void testZahleEin() {
        konto1.zahleEin(200);
        assertEquals(200.00, konto1.getKontostand(), 0.01);
    }

    @Test
    public void testHebeAb() {
        konto1.setKontostand(100);
        assertTrue(konto1.hebeAb(70));
        assertEquals(30.00, konto1.getKontostand(), 0.01);
        assertFalse(konto1.hebeAb(31));
    }

    @Test
    public void testGetNameKontoinhaber() {
        assertEquals("Meier", konto1.getErsterKontoinhaber().getName());
    }

    @Test
    public void testGetNameAndGetBLZ() {
        assertEquals("Commerzbank", bank.getName());
        assertEquals("0815 0915 0715 0615", bank.getBLZ());
    }
    // Test zusätzlich
    @Test
    public void testGetKontonummer() {
        assertEquals("65502757", konto1.getKontonummer());
    }
    @Test
    public void testGetNummerKunde(){
        assertEquals(4711, kunde1.getNummerKunde());
    }
}
