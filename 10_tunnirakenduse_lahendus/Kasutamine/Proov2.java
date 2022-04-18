import java.util.*;
public class Proov2{
    public static void main(String[] arg){
        Map<Integer, String> valvajad=new HashMap<>();
        valvajad.put(1, "Juku");
        valvajad.put(2, "Kati");
        valvajad.put(1, "Mati");
        System.out.println(valvajad);

        Map<String, Integer> opilased=new HashMap<>();
        opilased.put("Madis", 3);
        opilased.put("Jaan", 5);
        System.out.println(opilased);

        System.out.println(opilased);
        System.out.println(opilased.keySet());
    }
}