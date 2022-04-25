public class Pendel{
    double pikkus;
    double vonkeperiood;
    int ooteaeg;
    int minutiHammasteArv;
    int liikumineMinut = 0;
    int tunniHammasteArv;
    int liikumineTund = 0;

    public Pendel(double uusPikkus){
        pikkus = uusPikkus;
    }

    public double vonkeperiood(){
        vonkeperiood = 2 * Math.PI * Math.sqrt(pikkus / 9.8);
        return vonkeperiood;
    }

    public int ooteaeg(){
        return ooteaeg = (int)(vonkeperiood*1000);
    }

    public int minutiHammasteArv(int uusHammasteArv){
        return minutiHammasteArv = uusHammasteArv;
    }

    public int tunniHammasteArv(int uusHammasteArv){
        return tunniHammasteArv = uusHammasteArv;
    }

    Hammasratas minut = new Hammasratas(minutiHammasteArv);
    Hammasratas tund = new Hammasratas(tunniHammasteArv);

    public void liigutaHammasratast(){
        liikumineMinut += 1;
        if(liikumineMinut==minutiHammasteArv){
            minut.suurendaRingideArvu();
            liikumineTund += 1;
            liikumineMinut = 0;
        }
        if(liikumineTund==tunniHammasteArv){
            tund.suurendaRingideArvu();
            liikumineTund = 0;
        }
    }

    public int minutid(){
        return minut.tagastaRingideArv();
    }

    public int tunnid(){
        return tund.tagastaRingideArv();
    }
}