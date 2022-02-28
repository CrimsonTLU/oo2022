import java.util.*;
public class Laevastik{
	List<Laev> laevastik=new ArrayList<Laev>();
	String nimetus;
	public Laevastik(String uusNimetus) {nimetus=uusNimetus;}
	public void lisaLaev(Laev l){laevastik.add(l);}
	public String toString(){
        StringBuffer sb=new StringBuffer();
        sb.append(nimetus+"\n");
        for(Laev l:laevastik){
            sb.append(l+"\n");
        }
        return sb.toString();
    }
	
	public Laev lahim(double px, double py){
        Laev v=laevastik.get(0);
        for(Laev m: laevastik){
            if(m.kaugus(px, py)<v.kaugus(px, py)){
                v=m;
            }
        }
        return v;
    }
}
