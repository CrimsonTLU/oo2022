public class Joogipudel{
    double maht;
    String pudelityyp;
    double mass;
    double taaraMaksumus;
    Jook jook = null;

    public Joogipudel(double uusMaht, String uusPudelityyp, double uusMass, double uusTaaraMaksumus){
        maht=uusMaht; pudelityyp=uusPudelityyp; mass=uusMass; taaraMaksumus=uusTaaraMaksumus;
    }

    public void lisaJook(Jook uusJook){
        jook = uusJook;
    }

    public double tagastaMass(){
        if(jook!=null){
            return jook.erikaal + mass;
        } else {
            return mass;
        }
    }

    public double tagastaOmahind(){
        if(jook!=null){
            return jook.omahindL + taaraMaksumus;
        } else {
            return taaraMaksumus;
        }
    }
}