public class Admiral{
	double sx, sy;
	public static void main(String[] arg){
		double sx = Double.parseDouble(arg[0]);
		double sy = Double.parseDouble(arg[1]);
		Laevastik lk1=new Laevastik("SNMG1");
		Laev l1=new Laev("UL12EN", "hävitaja", 5, 2, 180, 9);
		Laev l2=new Laev("WK31EN", "fregatt", 3, 6, 180, 9);
		Laev l3=new Laev("LO28EN", "hävitaja", 1, 2, 180, 9);
		lk1.lisaLaev(l1);
		lk1.lisaLaev(l2);
		lk1.lisaLaev(l3);
		System.out.println("\n"+"Allveelaev koordinaatidel "+sx+" "+sy+"\n");
		System.out.println(lk1);
		System.out.println("lähim laev: "+lk1.lahim(sx, sy));
	}
}
