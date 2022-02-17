public class Nael{
	public double teisendus;
	//EURtoUSD = 1.13;
	//EURtoGBP = 0.84;
	
	public double dollariteks(int summa){
		double teisendus = summa*1.36;
		return teisendus;
	}
	public double eurodeks(int summa){
		double teisendus = summa*1.20;
		return teisendus;
	}

}