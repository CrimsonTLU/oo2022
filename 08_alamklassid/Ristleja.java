import java.util.*;

public class Ristleja extends Laev{
    int laevX, laevY;
    int laevHP = 3;
    String laevNimi = "ristleja";
    int[] laevaKoht1 = new int[2];
    int[] laevaKoht2 = new int[2];
    int[] laevaKoht3 = new int[2];

    public Ristleja(int uusX, int uusY){
        laevX = uusX; laevY = uusY;
    }

    @Override
    public void asetaLaev(){
        laevaKoht1[0] = laevX;
        laevaKoht1[1] = laevY;

        laevaKoht2[0] = laevX + 1;
        laevaKoht2[1] = laevY;

        laevaKoht3[0] = laevX + 2;
        laevaKoht3[1] = laevY; 
    }

    @Override
    public String tagastaNimi(){
        return laevNimi;
    }

    @Override
    public int[][] tagastaAsukoht(){
        int asukohad[][] = new int[3][2];
        asukohad[0][0] = laevaKoht1[0];
        asukohad[0][1] = laevaKoht1[1];

        asukohad[1][0] = laevaKoht2[0];
        asukohad[1][1] = laevaKoht2[1];

        asukohad[2][0] = laevaKoht3[0];
        asukohad[2][1] = laevaKoht3[1];

        return asukohad;
    }

    @Override
    public int tagastaElud(){
        return laevHP;
    }
}