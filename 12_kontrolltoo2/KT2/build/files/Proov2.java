public class Proov2 {
    public static void main(String[] arg){
        Ioon naatrium = new IoonRealiseeriv();
        Ioon kloriid = new IoonRealiseeriv();
        Ioon kaltsium = new IoonRealiseeriv();

        naatrium.looIoon("Na+", 22.98, 1);
        kloriid.looIoon("Cl-", 35.45, -1);
        kaltsium.looIoon("Ca2+", 40.08, 2);


        Aine iooniMassiivToimib = new AineRealiseeriv2();

        iooniMassiivToimib.lisaIoon(naatrium);
        iooniMassiivToimib.lisaIoon(kloriid);

        iooniMassiivToimib.looAine(null, null);

        System.out.println(iooniMassiivToimib.aineNimetus());
        System.out.println(iooniMassiivToimib.aineMolekulMass());

        Aine iooniMassiivEiToimi = new AineRealiseeriv2();

        iooniMassiivToimib.lisaIoon(naatrium);
        iooniMassiivToimib.lisaIoon(kloriid);
        iooniMassiivEiToimi.lisaIoon(kloriid);

        iooniMassiivEiToimi.looAine(null, null);

        System.out.println(iooniMassiivEiToimi.aineNimetus());
        System.out.println(iooniMassiivEiToimi.aineMolekulMass());

    }
}

/*
[chrhin@greeny files]$ java Proov2
Na+Cl-
58.43000000000001

0.0
*/