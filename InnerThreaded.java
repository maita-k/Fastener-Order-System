public class InnerThreaded extends Threaded {
	/**
	 * 
	 */
	private static final long serialVersionUID = 985306093857169523L;

	public InnerThreaded(String d,String m,String f,double uP,int uN) throws IllegalFastener {
    	super(d,m,f,uP,uN); 
    	setFinish(f);

}
	
    private void setFinish(String f) throws IllegalFastener {
		if (f.equalsIgnoreCase("Black Phosphate")||f.equalsIgnoreCase("ACQ 1000 Hour")
		  ||f.equalsIgnoreCase("Lubricated")){
			throw new IllegalFastener("Illegal finish: " + f);}}	
}// end InnerThreaded constructor
