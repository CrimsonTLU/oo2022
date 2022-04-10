import java.util.*;

public class Proov1{
    public static int koguElud(ArrayList<Laev> m){
            int koguElud = 0;
            for (Laev l: m){koguElud+=l.tagastaElud();}
		    return koguElud;
        }

    public static void main(String[] arg){
        ArrayList<Laev> ld = new ArrayList<Laev>();

        Ristleja r = new Ristleja(2, 2);
        Havitaja h = new Havitaja(5, 5);

        r.asetaLaev();
        h.asetaLaev();

        ld.add(r);
        ld.add(h);

        System.out.println(r.tagastaNimi() + Arrays.deepToString(r.tagastaAsukoht()));
        System.out.println(h.tagastaNimi() + Arrays.deepToString(h.tagastaAsukoht()));
        System.out.println("Elud kokku: " + koguElud(ld));
    }
}

/*
[chrhin@greeny Kodutoo]$ java Proov1
ristleja[[2, 2], [3, 2], [4, 2]]
havitaja[[5, 5], [6, 5]]
Elud kokku: 5
*/