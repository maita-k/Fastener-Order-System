public class Threaded extends Fastener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4447329907905777582L;
	public String diameter;
	
    public Threaded(String d,String m,String f,double uP,int uN) throws IllegalFastener {
    	super(m,f,uP,uN);
    	setDiameter(d);  
    	setFinish(f);
    }// end Threaded constructor

    private void setFinish(String f) throws IllegalFastener {
		if (f.equalsIgnoreCase("Bright")){
			throw new IllegalFastener("Illegal finish: " + f);}

    	}
 
    
    private void setDiameter(String d) throws IllegalFastener {
		
		/*
		 * Diameter/Thread Size for any threaded Fastener: 
		 
		 * #8-13, #8-15, #8-32, 
		 * #10-13,#10-24, #10-32, 
		 * 1/4"-20, 5/16"-18, 3/8"-16,
		 * 7/16"-14, 1/2"-13, 5/8"-11, 
		 * 3/4"-10.
		 */
		
		if(d.equalsIgnoreCase("#8-13")  ||d.equalsIgnoreCase("#8-15")  ||d.equalsIgnoreCase("#8-32") ||
		   d.equalsIgnoreCase("#10-13") ||d.equalsIgnoreCase("#10-24") ||d.equalsIgnoreCase("#10-32")||
		   d.equalsIgnoreCase("1/4-20") ||d.equalsIgnoreCase("5/16-18")||d.equalsIgnoreCase("3/8-16")||
		   d.equalsIgnoreCase("7/16-14")||d.equalsIgnoreCase("1/2-13") ||d.equalsIgnoreCase("5/8-11")||
		   d.equalsIgnoreCase("3/4-10")) {
				
			diameter=d;}
		
		else{
			throw new IllegalFastener("Illegal diameter: " + d);}
	}}
