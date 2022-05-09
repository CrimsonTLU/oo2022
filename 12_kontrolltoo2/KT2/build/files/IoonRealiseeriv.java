public class IoonRealiseeriv implements Ioon {
    String nimetus;
    double amSumma;
    int laeng;

    public void looIoon(String uusNimetus, double uusAmSumma, int uusLaeng){
        nimetus = uusNimetus;
        amSumma = uusAmSumma;
        laeng = uusLaeng;
    }

    public String nimetus(){
        return nimetus;
    }

    public double amSumma(){
        return amSumma;
    }

    public int laeng(){
        return laeng;
    }


}