public class Keskmine{
	static double keskmine;
	static double arv1 = 5;
	static double arv2 = 7;
	static double arv3 = 3;
	
	public static double keskmine(double arv1, double arv2, double arv3){
		keskmine = (arv1 + arv2 + arv3)/3;
		return keskmine;
	}
	
	public static void main(String[] arg){
		System.out.println(keskmine(arv1, arv2, arv3));
	}
}