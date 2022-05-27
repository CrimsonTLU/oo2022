package Jook;

import org.junit.*;
import static org.junit.Assert.*;

public class JookTest{
    Jook j;
    Joogipudel p;

    @Before public void alustus(){
        j = new Jook("Limonaad", 150, 250);
        p = new Joogipudel(250, "plastpudel", 20, 10);
    }

    @Test public void tyhiPudelMass(){
        assertEquals(20.0, p.tagastaMass(), .1);
    }

    @Test public void tyhiPudelHind(){
        assertEquals(10.0, p.tagastaOmahind(), .1);
    }
    
    @Test public void t2isPudelMass(){
        p.lisaJook(j);
        assertEquals(270.0, p.tagastaMass(), .1);
    }

    @Test public void t2isPudelHind(){
        p.lisaJook(j);
        assertEquals(160.0, p.tagastaOmahind(), .1);
    }
}