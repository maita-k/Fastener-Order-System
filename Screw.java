public class Screw extends Threaded {
/**
	 * 
	 */
	private static final long serialVersionUID = -4476332495778239418L;
	public String head;
	public String drive;
	public double length;


public Screw(double le, String d, String m, String f, String h, String dr, double uP, int uN) throws IllegalFastener {
	super(d,m,f,uP,uN);
	

	setHead(h);
	setDrive(dr);
	setLength(le);
	setFinish(f,m);

}//end Screw constructor
/* 
 */

private void setHead(String h) throws IllegalFastener {
	//Head for all Screws: Bugle, Flat, Oval, Pan, Round.
	if(h.equalsIgnoreCase("Bugle")||h.equalsIgnoreCase("Flat")||h.equalsIgnoreCase("Oval")||h.equalsIgnoreCase("Pan")||h.equalsIgnoreCase("Round")) {
	head = h;}
	else {
		throw new IllegalFastener("Illegal head: " + h);}
}

 
private void setDrive(String dr) throws IllegalFastener {
	//Drive for all Screws: 6-Lobe, Philips, Slotted, Square

	if(dr.equalsIgnoreCase("6-Lobe")||dr.equalsIgnoreCase("Philips")||
	   dr.equalsIgnoreCase("Slotted")||dr.equalsIgnoreCase("Square")) {
	drive = dr;}
	else {
		throw new IllegalFastener("Illegal drive: " + dr);}
}

 
private void setLength(double le) throws IllegalFastener {
	//Lengths for Bolts and Screws: 1/2" to 6" in units of 1/4", 
	//6" to 11" in units of 1/2", 11 to 20" in units of 1".
	
	
	if( (le>=0.5 && le<=6) && le%0.25==0) {
		length = le;}
		
	else if((le>=6 &&le<=11) && le%0.50==0) {
		length = le;}
	
	else if(le>11.0 && le<=20.0) {
		length = le;}

	else {
		throw new IllegalFastener("Illegal length: " + le);}
}



private void setFinish(String f, String m) throws IllegalFastener {
	
	//Additional Finishes for Steel Screws only: Black Phosphate, ACQ 1000 Hour, Lubricated.
	if(m.equalsIgnoreCase("Steel")){
		if (f.equalsIgnoreCase("Black Phosphate")||f.equalsIgnoreCase("ACQ 1000 Hour")
		  ||f.equalsIgnoreCase("Lubricated")){
		finish=f;}}	

	else{
		throw new IllegalFastener("Illegal finish: " + f);}
}

}
