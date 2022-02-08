public class FunktsioonidK{
	static int sisend = 0;
	static int teisendus = 0;
 	public static double eurodeks(double sisend){
		/*if(args[1]="USD"){
			return sisend*0.87;
		} */
		return sisend*0.87;
	}

	public static void main(String[] args){
		double sisend = Double.parseDouble(args[0]);
		double teisendus = eurodeks(sisend);
		System.out.println(teisendus+" eurot");
	}
}
/* 
[chrhin@greeny 1_tund]$ javac FunktsioonidK.java
[chrhin@greeny 1_tund]$ java FunktsioonidK 1
0.87 eurot */
