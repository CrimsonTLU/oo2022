public class Proov1{
    public static void main(String[] arg){
        Joogipudel p1 = new Joogipudel(250, "plastpudel", 20, 10);

        Jook j1 = new Jook("Limonaad", 150, 250);

        Joogivaat v1 = new Joogivaat(5000, 2000);

        Kast k1 = new Kast("Limonaadid", 200, 25);

        v1.lisaJoogipudel(p1);
        v1.t2idaPudel();
        System.out.println(v1.tagastaPudeliteArv());
        v1.villiJookPudelitesse();
        System.out.println(v1.tagastaPudeliteArv());

        System.out.println(p1.tagastaMass());
        System.out.println(p1.tagastaOmahind());

        p1.lisaJook(j1);
        System.out.println(p1.tagastaMass());
        System.out.println(p1.tagastaOmahind());

        k1.lisaJoogipudel(p1);
        k1.lisaVaat(v1);
        k1.villiPudelidKasti();
        k1.lisaSaadavalPudelid(v1.tagastaPudeliteArv());

        System.out.println(k1.tagastaPudeliteArv());

        /*System.out.println(k1.tagastaYhineMass());
        System.out.println(k1.tagastaYhineOmahind());*/
        
    }
}