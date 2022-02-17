public class Teisendaja{
	public static int summa;
	public static int tulemus;
	public static String algvaluuta, loppvaluuta;
	public static void main(String[] arg) {
		summa = Integer.parseInt(arg[0]);
		algvaluuta = arg[1];
		loppvaluuta = arg[2];
		Euro eur=new Euro();
		Nael pnd=new Nael();
		if(algvaluuta.equals("EUR")){
			if(loppvaluuta.equals("USD")){
				System.out.println(eur.dollariteks(summa));
			}
			else if(loppvaluuta.equals("GBP")){
				System.out.println(eur.naelteks(summa));
			}
		}
		
		if(algvaluuta.equals("GBP")){
			if(loppvaluuta.equals("USD")){
				System.out.println(pnd.dollariteks(summa));
			}
			else if(loppvaluuta.equals("EUR")){
				System.out.println(pnd.eurodeks(summa));
			}
		}
		
	} 
}