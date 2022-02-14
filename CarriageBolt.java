public class CarriageBolt extends Bolt  {
	// length, thread,  material, finish, price/unit, unit size

/**
	 * 
	 */
	private static final long serialVersionUID = 1181646945813279233L;

public CarriageBolt (double le,String d,String m,String f,double uP,int uN) throws IllegalFastener {
	super(le,d,m,f,uP,uN);
}
//Carriage Bolt 0.75" long, 1/4-20 thread, Stainless Steel, 
//with a Plain finish. 50 in a unit, $18.825 per unit.


public String toString() {
	String out =  "Carriage Bolt "+length+" long, "
			+diameter+" thread, "+material+", with a "+finish
			+" finish. "+unitNumb+" in a unit, $"+unitPrice+" per unit.";
			
	return out;
} // end toString

}
