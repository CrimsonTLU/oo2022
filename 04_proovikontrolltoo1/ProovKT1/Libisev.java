import java.util.*;
public class Libisev{	 
	 public static void main(String[] arg){
		 List<Integer> sisend=new ArrayList<Integer>();
		 sisend.add(1);
		 sisend.add(2);
		 sisend.add(3);
		 sisend.add(4);
		 sisend.add(5);
		 sisend.add(6);
		 System.out.println(sisend.size());
		 
		 public static double libisevKeskmine(sisend){
			 List<Integer> väljund=new ArrayList<Integer>();
			 väljund.add((sisend[0]+sisend[1]+sisend[2])/3);
			 return väljund;
		 }
		 System.out.println(libisevKeskmine());
	 }
}