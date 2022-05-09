import java.util.*;

public class AineRealiseeriv2 implements Aine {
    ArrayList<Ioon> ioonid = new ArrayList<Ioon>();
    int laenguSumma = 0;
    String nimetus = "";
    double molekulMass = 0;
    int ioonideKordumine = 1;
    boolean saabLuua = false;

    public void lisaIoon(Ioon ioon){
        ioonid.add(ioon);
    }

    public void looAine(Ioon ioon1, Ioon ioon2){
        for(int i=0; i<ioonid.size(); i++){
            laenguSumma += ioonid.get(i).laeng();
        }
        if(laenguSumma == 0){
            saabLuua = true;
            /*for(int i=0; i<ioonid.length(); i++){
                if(ioonid[i].laeng > 0){
                    nimetus = ioonid[i].nimetus() + nimetus;
                } else {
                    nimetus += ioonid[i].nimetus()
                }
                molekulMass = ioon1.amSumma() + ioon2.amSumma();*/
            }
        }
    
    public String aineNimetus(){
        ArrayList<String> nimetused = new ArrayList<String>();
        if(saabLuua == true){
            for(int i=0; i<ioonid.size(); i++){
                if(nimetused.contains(ioonid.get(i).nimetus())){
                    ioonideKordumine += 1;
                    nimetused.add(ioonid.get(i).nimetus() + ioonideKordumine);
                } else {
                    nimetused.add(ioonid.get(i).nimetus());
                }
            }

            for(int i=0; i<nimetused.size(); i++){
                nimetus += nimetused.get(i);
            }
        }
        return nimetus;
    }
    public double aineMolekulMass(){
        if(saabLuua == true){
            for(int i=0; i<ioonid.size(); i++){
                molekulMass += ioonid.get(i).amSumma();
            }
        }
        return molekulMass;
    }
}