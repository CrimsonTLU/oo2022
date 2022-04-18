public class Proov1{
    public static void main(String[] arg){
        SamaTyypiPaar<Integer> asukoht=new SamaTyypiPaar<>();
        asukoht.esimene=7;
        asukoht.teine=4;
        System.out.println(asukoht.esimene);
        System.out.println(asukoht);

        SamaTyypiPaar<String> nimi=new SamaTyypiPaar<>();
        nimi.esimene="Maali";
        nimi.teine="Maasikas";
        System.out.println(nimi.esimene);
        System.out.println(nimi);
    }
}