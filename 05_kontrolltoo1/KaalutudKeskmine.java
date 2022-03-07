public class KaalutudKeskmine {
    static double ainepunktid1 = 3;
    static double ainepunktid2 = 6;
    static double hinne1 = 5;
    static double hinne2 = 3;
    public static double kaalutudKeskmine(){
        return (ainepunktid1*hinne1 + ainepunktid2*hinne2)/(ainepunktid1+ainepunktid2);
    }
    public static void main(String[] arg){
        System.out.println(kaalutudKeskmine());
    }
}