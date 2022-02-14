public class WingNut extends InnerThreaded  {
    
	// thread,  material, finish, price/unit, unit size

    /**
	 * 
	 */
	private static final long serialVersionUID = -9122403307618676481L;

	public WingNut(String d,String m,String f,double uP,int uN) throws IllegalFastener {
    	super(d,m,f,uP,uN);
}// end WingNut constructor

	//Wing Nut 1/4-20 thread, Stainless Steel, with 
	//a Plain finish. 1 in a unit, $0.5528 per unit.
	
	public String toString() {
		String out =  "Wing Nut "+diameter+" thread, "+material+", with a "+finish
				+" finish. "+unitNumb+" in a unit, $"+unitPrice+" per unit.";
				
		return out;}
	


}
