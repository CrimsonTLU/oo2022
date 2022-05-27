public class Kast{
    String kastiTyyp;
    double kastiMass;
    int pesadeArv;
    int pudeliteArv = 0;
    int saadavalPudelid = 0;
    Joogivaat vaat = null;
    Joogipudel pudel = null;
    Jook jook = null;

    public Kast(String uusTyyp, double uusMass, int uusArv){
        kastiTyyp = uusTyyp; kastiMass = uusMass; pesadeArv = uusArv;
    }

    public void lisaVaat(Joogivaat uusVaat){
        vaat = uusVaat;
    }

    public void lisaJoogipudel(Joogipudel uusPudel){
        pudel=uusPudel;
    }
    
    public void lisaSaadavalPudelid(int uusPudelidArv){
        saadavalPudelid = uusPudelidArv;
    }

    public void villiPudelidKasti(){
        while((pesadeArv - pudeliteArv) >= saadavalPudelid && saadavalPudelid > 0){
            pudeliteArv ++;
            saadavalPudelid --;
        }

        if((pesadeArv - pudeliteArv) > 0){
            if(saadavalPudelid < (pesadeArv - pudeliteArv)){
                pudeliteArv += saadavalPudelid;
            } else {
                pudeliteArv += (pesadeArv - pudeliteArv);
            }
        }
    }

    public int tagastaPudeliteArv(){
        return saadavalPudelid;
    }
    
    public double tagastaYhineMass(){
        return kastiMass + pudeliteArv*(pudel.tagastaMass());
    }

    public double tagastaYhineOmahind(){
        return pudeliteArv * pudel.tagastaOmahind();
    }
}