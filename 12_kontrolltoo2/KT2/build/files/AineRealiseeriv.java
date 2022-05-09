public class AineRealiseeriv implements Aine {
    String nimetus;
    double molekulMass;
    Ioon ioon1;
    Ioon ioon2;

    /*Ioon ioon1 = new IoonRealiseeriv();
    Ioon ioon2 = new IoonRealiseeriv();

    ioon1.looIoon("Na+", 22.98, 1);
    ioon2.looIoon("Cl-", 35.45, -1);*/

    public void lisaIoon(Ioon ioon){}

    public void looAine(Ioon ioon1, Ioon ioon2){
        if(Math.abs(ioon1.laeng()) == Math.abs(ioon2.laeng()) && ioon1.laeng() > 0 && ioon2.laeng() < 0){
            nimetus = ioon1.nimetus() + ioon2.nimetus();
            molekulMass = ioon1.amSumma() + ioon2.amSumma();
        }
    }
    public String aineNimetus(){
        return nimetus;
    }
    public double aineMolekulMass(){
        return molekulMass;
    }
}