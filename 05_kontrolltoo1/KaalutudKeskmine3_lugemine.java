import java.io.*;
import java.util.*;
public class KaalutudKeskmine3_lugemine{
    public static void main(String[] arg) throws IOException{
        BufferedReader br1=new BufferedReader(new FileReader("sisend.txt"));
        String rida1=br1.readLine();
        String[] m=rida1.split(" ");
        String kursus1=m[0];
        String hinne1=m[1];
        String punktid1=m[2];
        String kursus2=m[3];
        String hinne2=m[4];
        String punktid2=m[5];
        String kursus3=m[6];
        String hinne3=m[7];
        String punktid3=m[8];

        List<String> hindedSisend=new ArrayList<String>();
        hindedSisend.add(hinne1);
        hindedSisend.add(hinne2);
        hindedSisend.add(hinne3);

        List<Integer> hindedNumbritena=new ArrayList<Integer>();

        for(int i=0; i<hindedSisend.size(); i++){
            if(hindedSisend.get(i) .equals("A")){
                hindedNumbritena.add(5);
            }
            if(hindedSisend.get(i) .equals("B")){
                hindedNumbritena.add(4);
            }
            if(hindedSisend.get(i) .equals("C")){
                hindedNumbritena.add(3);
            }
        }
        
        int hinded1 = hindedNumbritena.get(0);
        int hinded2 = hindedNumbritena.get(1);
        int hinded3 = hindedNumbritena.get(2);

        int punkt1 = Integer.parseInt(punktid1);
        int punkt2 = Integer.parseInt(punktid2);
        int punkt3 = Integer.parseInt(punktid3);

        KaalutudKeskmine2 k = new KaalutudKeskmine2();
        k.lisaAinepunkt(punkt1);
        k.lisaAinepunkt(punkt2);
        k.lisaAinepunkt(punkt3);
        k.lisaHinne(hinded1);
        k.lisaHinne(hinded2);
        k.lisaHinne(hinded3);

        System.out.println(k.kaal());
        System.out.println(k.summa());
        System.out.println(k.kaalKeskmine());

        PrintWriter pw1=new PrintWriter(new FileWriter("valjund.txt"));
        pw1.println("Kaalutud keskmine: "+k.kaalKeskmine());
        pw1.close();
    }
}