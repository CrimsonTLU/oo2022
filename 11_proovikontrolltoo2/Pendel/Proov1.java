import java.util.*;
public class Proov1{
    public static void main(String[] arg){
        Pendel p = new Pendel(0.25);

        p.minutiHammasteArv(3);
        p.tunniHammasteArv(2);

        System.out.println(p.vonkeperiood());

        System.out.println(p.ooteaeg());

        new Timer().scheduleAtFixedRate(new TimerTask(){
			 public void run(){
				 System.out.println("tiks");
                 p.liigutaHammasratast();
                 System.out.println("minutid: " + p.minutid());
                 System.out.println("tunnid: " + p.tunnid());
			 }
		 }, 0, p.ooteaeg());
    }
}