public class CommonNail extends Nail {
	// size, length, gauge, finish, price/unit, unit size

	private static final long serialVersionUID = -2695689606408644905L;
	
	public String size;
	public double length;
	public double gauge;

	public CommonNail(String s,double l,double g,String f,double uP,int uN) throws IllegalFastener{
	super("Steel",f, uP,uN);
	
	setFinish(f);
	setSize(s);
	setLength(l);
	setGauge(g); 
	}

	
	private void setSize(String s) throws IllegalFastener {
		//Sizes for Common Nails: 6D, 8D, 10D, 12D, 16D, 60D.
		if(s.equalsIgnoreCase("6D")||s.equalsIgnoreCase("8D")||s.equalsIgnoreCase("10D")||
		   s.equalsIgnoreCase("12D")||s.equalsIgnoreCase("16D")||s.equalsIgnoreCase("60D")) {
			size = s;}
		
		else {
			throw new IllegalFastener("Illegal size: " + s);}
	}
		

	private void setLength(double l) throws IllegalFastener{
		//Lengths for Common Nails: 2, 2.5, 3, 3.25, 3.5, 6 (in inches).
		if(l==2||l==2.5||l==3||l==3.25||l==3.5||l==6) {
		length = l;}
		else {
			throw new IllegalFastener("Illegal length: " + l);}
	}
		

	private void setGauge(double g) throws IllegalFastener{
		//Gauge for Common Nails: 2, 8, 9, 10.25, 11.5
		if(g==2||g==8||g==9||g==10.25||g==11.5) {
		gauge = g;}
		else {
			throw new IllegalFastener("Illegal gauge: " + g);}
		}
		
	//Finishes for Common Nails: Bright, Hot Dipped Galvanized.
	private void setFinish(String f) throws IllegalFastener {
		if (f.equalsIgnoreCase("Bright")||f.equalsIgnoreCase("Hot Dipped Galvanized")){
			finish=f;}
		else{
			throw new IllegalFastener("Illegal finish: " + f);}		

}

//Common Nail, 16D size, 3.5" long, 8.0 gauge, Steel, with a Bright finish. 
//2450 in a unit, $174.29 per unit.

public String toString() {
	String out =  "Common Nail, "+size+" size, "+length+" long, "
			+gauge+" gauge, Steel, with a "+finish
			+" finish. "+unitNumb+" in a unit, $"+unitPrice+" per unit.";
			
	return out;
} // end toString


}
