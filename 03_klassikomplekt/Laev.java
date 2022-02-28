public class Laev{
	String kutsung, klass;
	double x, y, kurssRad, kiirus;
	public Laev(String uusKutsung, String uusKlass, double uusX, double uusY, double uusKurssKraadides, double uusKiirus){
		kutsung=uusKutsung; klass=uusKlass; x=uusX; y=uusY; kurssRad=Math.toRadians(uusKurssKraadides); kiirus=uusKiirus;
	}
	public String toString(){
		return "kutsung: "+kutsung+ " ("+x+", "+y+") / klass: "+klass+" / kurss: "+Math.round(Math.toDegrees(kurssRad))+ " kraadi / kiirus: "+kiirus+" kn";
	}
	
	public double kaugus(double ux, double uy){
        double dx=ux-x; double dy=uy-y;
        return Math.sqrt(dx*dx+dy*dy);
    }
}
