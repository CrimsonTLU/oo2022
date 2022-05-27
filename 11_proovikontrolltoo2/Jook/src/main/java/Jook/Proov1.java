package Jook;

public class Proov1{
    public static void main(String[] arg){
        Joogipudel p1 = new Joogipudel(250, "plastpudel", 20, 10);

        Jook j1 = new Jook("Limonaad", 150, 250);

        System.out.println(p1.tagastaMass());

        System.out.println(p1.tagastaOmahind());

        p1.lisaJook(j1);

        System.out.println(p1.tagastaMass());

        System.out.println(p1.tagastaOmahind());
    }
}