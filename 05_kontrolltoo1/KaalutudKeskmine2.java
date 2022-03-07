import java.util.*;
public class KaalutudKeskmine2 {
    static double koguKaal;
    static double koguSumma;
    static List<Integer> ainepunktid=new ArrayList<Integer>();
    static List<Integer> hinded=new ArrayList<Integer>();
    public void lisaAinepunkt(int ainepunkt){
        ainepunktid.add(ainepunkt);
    }
    public void lisaHinne(int hinne){
        hinded.add(hinne);
    }
    public static double kaal(){
        koguKaal = 0;
        for(int i=0; i<ainepunktid.size(); i++){
            koguKaal += ainepunktid.get(i);
        }
        return koguKaal;
    }

    public static double summa(){
        koguSumma = 0;
        for(int i=0; i<hinded.size(); i++){
            koguSumma += hinded.get(i) * ainepunktid.get(i);
        }
        return koguSumma;
    }

    public static double kaalKeskmine(){
        return koguSumma / koguKaal;
    }
}