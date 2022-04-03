package kodutoo;

import org.junit.*;
import static org.junit.Assert.*;

public class battleshipTest {
    battleshipTuum tuum = new battleshipTuum1();
    @Test public void laevaYonOlemas() {
        tuum.asetaLaev();
        assertNotNull("laeval peab olema määratud Y", tuum.laevaY());
    }

    @Test public void laevaHpOnOlemas() {
        tuum.asetaLaev();
        assertNotNull("laeval peab olema määratud HP", tuum.returnHealth());
    }

    @Test public void laevaHpVaheneb() {
        tuum.asetaLaev();
        int HP, uusHP;
        HP = tuum.returnHealth();
        tuum.damageShip();
        uusHP = tuum.returnHealth();
        assertEquals(HP - 1, uusHP);
    }
}
