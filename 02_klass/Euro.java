public class Euro{
	public double teisendus;
	//EURtoUSD = 1.13;
	//EURtoGBP = 0.84;
	
	public double dollariteks(int summa){
		double teisendus = summa*1.13;
		return teisendus;
	}
	public double naelteks(int summa){
		double teisendus = summa*0.84;
		return teisendus;
	}
}