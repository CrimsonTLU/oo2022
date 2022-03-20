import java.util.*;
import java.io.*;
public class battleshipProov{
	public static void main(String[] arg) throws IOException{
		battleshipTuum mt=new battleshipTuum1();
        mt.asetaLaev();
        System.out.println("Laeva koht: "+Arrays.toString(mt.laevaKoht()));
        int x = 0, y = 0;
        boolean pohjas = false;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(pohjas == false){
			String rida=br.readLine();
            if(rida.length()>1){
                x = Integer.parseInt(Character.toString(rida.charAt(0)));
                y = Integer.parseInt(Character.toString(rida.charAt(1)));
            }
                if(x == mt.laevaX() && y == mt.laevaY()){
                    pohjas = true;
                }
            mt.pommitus(x, y);
            System.out.println("Pommitus: "+Arrays.toString(mt.pommita()));
            System.out.println(mt.tulemus());
        }
	}
}

/*
[chrhin@greeny Kodutoo]$ java battleshipProov
Laeva koht: [6, 2]
22
Pommitus: [2, 2]
moodas
62
Pommitus: [6, 2]
pihtas
[chrhin@greeny Kodutoo]$
*/
