import java.util.*;

public class Havitaja extends Laev{
    int laevX, laevY;
    int laevHP = 2;
    String laevNimi = "havitaja";
    int[] laevaKoht1 = new int[2];
    int[] laevaKoht2 = new int[2];

    public Havitaja(int uusX, int uusY){
        laevX = uusX; laevY = uusY;
    }

    @Override
    public void asetaLaev(){
        laevaKoht1[0] = laevX;
        laevaKoht1[1] = laevY;

        laevaKoht2[0] = laevX + 1;
        laevaKoht2[1] = laevY;
    }

    @Override
    public String tagastaNimi(){
        return laevNimi;
    }

    @Override
    public int[][] tagastaAsukoht(){
        int asukohad[][] = new int[2][2];
        asukohad[0][0] = laevaKoht1[0];
        asukohad[0][1] = laevaKoht1[1];

        asukohad[1][0] = laevaKoht2[0];
        asukohad[1][1] = laevaKoht2[1];

        return asukohad;
    }

    @Override
    public int tagastaElud(){
        return laevHP;
    }
}