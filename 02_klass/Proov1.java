public class Proov1{
	public static void main(String[] arg) {
		Isikukood christian=new Isikukood("50002280834");
		Isikukood paula=new Isikukood("60002280834");
		System.out.println(christian.sugu());
		System.out.println(paula.sugu());
		System.out.println(christian.synniaasta());
	}
}