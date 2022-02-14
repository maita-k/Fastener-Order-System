public class WoodScrew extends Screw {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4998264357855203022L;
	public String point;
	
	// length, thread,  material, finish, head, drive, point, price/unit, unit size

	public WoodScrew(double le,String d,String m,String f,String h,String dr,String p,double uP,int uN) throws IllegalFastener {
		super(le,d,m,f,h,dr,uP,uN);
		setPoint(p);
	}

	private void setPoint(String p) throws IllegalFastener {
		//Point for Wood Screws: Double Cut, Sharp, Type 17
		if(p.equalsIgnoreCase("Double Cut")||p.equalsIgnoreCase("Sharp")||
		   p.equalsIgnoreCase("Type 17")) {
				point=p;}
		
		else {
			throw new IllegalFastener("Illegal point: " + p);}

}
	
	
	//Wood Screw, Sharp point, Flat head, Square drive, 0.75" long, 
	//#8-15 thread, Steel, with a Zinc finish. 100 in a unit, $8.84 per unit.
	
	public String toString() {

		String out =  "Wood Screw "+point+" point, "+drive+" drive, "+length+" long, "
				+diameter+" thread, "+material+", with a "+finish
				+" finish. "+unitNumb+" in a unit, $"+unitPrice+" per unit.";
		return out;
		
	} // end toString


}
