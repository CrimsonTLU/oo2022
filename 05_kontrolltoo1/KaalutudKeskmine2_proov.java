public class KaalutudKeskmine2_proov{
    public static void main(String[] arg){
        KaalutudKeskmine2 k = new KaalutudKeskmine2();
        k.lisaAinepunkt(6);
        k.lisaAinepunkt(4);
        k.lisaAinepunkt(3);
        k.lisaHinne(3);
        k.lisaHinne(4);
        k.lisaHinne(5);
        System.out.println(k.kaal());
        System.out.println(k.summa());
        System.out.println(k.kaalKeskmine());
    }
}