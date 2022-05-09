public class Proov1 {
    public static void main(String[] arg){
        Ioon naatrium = new IoonRealiseeriv();
        Ioon kloriid = new IoonRealiseeriv();

        naatrium.looIoon("Na+", 22.98, 1);
        kloriid.looIoon("Cl-", 35.45, -1);

        System.out.println(naatrium.nimetus());
        System.out.println(naatrium.amSumma());
        System.out.println(naatrium.laeng());

        System.out.println(kloriid.nimetus());
        System.out.println(kloriid.amSumma());
        System.out.println(kloriid.laeng());

        Aine naatriumKloriid = new AineRealiseeriv();
        naatriumKloriid.looAine(naatrium, kloriid);

        System.out.println(naatriumKloriid.aineNimetus());
        System.out.println(naatriumKloriid.aineMolekulMass());
    }
}

/*
Na+
22.98
1
Cl-
35.45
-1
Na+Cl-
58.43000000000001
*/