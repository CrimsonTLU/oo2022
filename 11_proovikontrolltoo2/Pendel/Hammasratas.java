public class Hammasratas{
    int hambadArv;
    int ringideArv=0;
    public Hammasratas(int uusHambadArv){
        hambadArv = uusHambadArv;
    }

    public void suurendaRingideArvu(){
        ringideArv += 1;
    }

    public int tagastaRingideArv(){
        return ringideArv;
    }
}