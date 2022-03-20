public class battleshipTuum1 implements battleshipTuum{
    int laevX, laevY;
    int pommitusX, pommitusY = 0;
    final int laius=10, korgus=10;

    public void asetaLaev(){
        laevX=(int)(laius*Math.random());
		laevY=(int)(korgus*Math.random());
    }

    public void pommitus(int x, int y){
        pommitusX = x; pommitusY = y;
    }

    public int[] pommita(){
        return new int[]{pommitusX, pommitusY};
    }

    public int[] laevaKoht(){
        return new int[]{laevX, laevY};
    }

    public int laevaX(){
        return laevX;
    }

    public int laevaY(){
        return laevY;
    }

    public String tulemus(){
        if(pommitusX == laevX && pommitusY == laevY){
            return "pihtas";
        }else {
            return "moodas";
        }
    }
}
