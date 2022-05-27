public class Joogivaat {
    double ruumala;
    double joogiKogus;
    int t2idetudPudelid = 0;
    Joogipudel pudel = null;
    Jook jook = null;

    public Joogivaat(double uusRuumala, double uusJoogikogus){
        ruumala=uusRuumala; joogiKogus=uusJoogikogus;
    }

    public void lisaJoogipudel(Joogipudel uusPudel){
        pudel=uusPudel;
    }

    public void lisaJook(Jook uusJook){
        jook = uusJook;
    }

    public void t2idaPudel(){
        if(joogiKogus >= pudel.maht){
            joogiKogus = joogiKogus - pudel.maht;
            t2idetudPudelid++;
        } 
    }

    public void villiJookPudelitesse(){
        while(joogiKogus > 0){
            joogiKogus = joogiKogus - pudel.maht;
            t2idetudPudelid++;
        }
    }

    public int tagastaPudeliteArv(){
        return t2idetudPudelid;
    }
}