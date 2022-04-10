public abstract class Laev{
    int laevX, laevY, laevHP;
    String laevNimi = "laev";

    public abstract void asetaLaev();

    public void pommita(){
        laevHP -= 1;
    }

    public abstract int[][] tagastaAsukoht();

    public abstract int tagastaElud();

    public abstract String tagastaNimi();
}