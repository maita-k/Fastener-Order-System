public class Bolt extends Threaded {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4235324374311323456L;
	
	public double length;
	
	public Bolt(double le,String d,String m,String f,double uP,int uN) throws IllegalFastener {
		super(d,m,f,uP,uN);
		setLength(le);
		setFinish(f,m);
		

			
		



}// end Bolt constructor
	
    private void setFinish(String f,String m) throws IllegalFastener {
		if (f.equalsIgnoreCase("Black Phosphate")||f.equalsIgnoreCase("ACQ 1000 Hour")
		  ||f.equalsIgnoreCase("Lubricated")){			
			throw new IllegalFastener("Illegal finish: " + f);}

		}
    
	
	private void setLength(double le) throws IllegalFastener {
		//Lengths for Bolts and Screws: 1/2" to 6" in units of 1/4", 
		//6" to 11" in units of 1/2", 11 to 20" in units of 1".
		
		if( (le>=0.5 && le<=6) && le%0.25==0.0) {
			length = le;}
			
		else if((le>=6 && le<=11) && le%0.50==0) {
			length = le;}
		
		else if(le>=11 && le<=20) {
			length = le;}
 		

		else {
			throw new IllegalFastener("Illegal length: " + le);}
			
		}

	

}
