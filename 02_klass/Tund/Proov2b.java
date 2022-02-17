public class Proov2b{
	public static void main(String[] arg) {
		String juhis="eke"; //keera edasi edasi
		if(arg.length>0) {juhis=arg[0];}
		Kilpkonn k1=new Kilpkonn();
		laud[k1.kysiY()][k1.kysiX()]=1;
		//int[][] laud=new int[10][10];
		for(int i=0; i<juhis.length(); i++){
			if(juhis.charAt(i)=='e'){k1.edasi();} else {k1.keera();}
			laud[k1.kysiY()][k1.kysiX()]=1;
		for(int u=0; u<10; u++){
			for(int j=0; j<10; j++){
				System.out.print(laud[u][j]);
			}
			System.out.println();
		}
			//System.out.println(k1);
		}
		System.out.println(k1.kysiX());
	}
}