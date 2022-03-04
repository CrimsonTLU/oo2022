import java.util.*;
public class List_proov{
	public static void main(String[] arg){
		List k=new List();
		k.lisa(2);
		k.lisa(6);
		k.lisa(4);
		k.lisa(5);
		k.lisa(3);
		System.out.println(Arrays.toString(k.libisevKeskmine()));
	}
}