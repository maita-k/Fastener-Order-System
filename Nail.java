public class Nail extends Fastener  {
	
	private static final long serialVersionUID = 1L;

	
	public Nail(String m,String f,double uP,int uN) throws IllegalFastener {
	    	super("Steel",f,uP,uN);
	    	setFinish(f);
	    }// end Nails constructor

	
    private void setFinish(String f) throws IllegalFastener {
    	if(f.equalsIgnoreCase("ACQ 1000 Hour")) {
			throw new IllegalFastener("Illegal finish: " + f);}}
	
	}

	

