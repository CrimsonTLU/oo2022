import java.util.*;
public class Libisev2{	 
	 public static void main(String[] arg){
		 double[] sisend=new double[6];
		 sisend[0] = 1;
		 sisend[1] = 2;
		 sisend[2] = 3;
		 sisend[3] = 4;
		 sisend[4] = 5;
		 sisend[5] = 6;
		 for(int i=0; i<sisend.length; i++){
			System.out.println(sisend[i]);
		 }
		System.out.println();
		
		 double[] väljund=new double[4];
		 for(int i=0; i<sisend.length-2; i++){
			väljund[i] = ((sisend[i]+sisend[i+1]+sisend[i+2])/3);
			 }
		 for(int i=0; i<väljund.length; i++)
			System.out.println(väljund[i]);
		 }
	 }