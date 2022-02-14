import java.io.Serializable;
/*
*  A code model of a hierarchy for Fasteners. It holds descriptions 
*  of Carriage Bolts, Wood Screws, Wing Nuts and Common Nails.
*  
* @author Maita Kambarami
* @class CISC 124
* @studentID 20068051
* @NETID 17MK1
*/
public class Fastener implements Serializable{
	
	public static final long serialVersionUID= 19L;

	public String material;
	public String finish;
	public double unitPrice;
	public int unitNumb;
	public double orderCost;

	
	
	public Fastener(String m,String f,double uP,int uN) throws IllegalFastener {
		
		setMaterial(m);
		setFinish(f,m);
		setUnitPrice(uP);
		setUnitNumb(uN);
	}// end Fastener constructor
	
///
	
	
	private void setMaterial(String m) throws IllegalFastener {
		//Materials for all Fasteners: Brass, Stainless Steel, Steel.
		
		if (m.equalsIgnoreCase("Brass")||m.equalsIgnoreCase("Stainless Steel")||m.equalsIgnoreCase("Steel")){
			material=m;}
		
		else{
			throw new IllegalFastener("Illegal material: " + m);}
	}

	private void setFinish(String f, String m) throws IllegalFastener {
		
		//Finishes for Steel only: Chrome, Hot Dipped Galvanized, Plain, Yellow Zinc, Zinc.
		if(m.equalsIgnoreCase("Steel")){
			if (f.equalsIgnoreCase("Chrome")||f.equalsIgnoreCase("Hot Dipped Galvanized")||f.equalsIgnoreCase("Plain")
				||f.equalsIgnoreCase("Yellow Zinc")||f.equalsIgnoreCase("Zinc")||f.equalsIgnoreCase("Bright")
			   ||f.equalsIgnoreCase("ACQ 1000 Hour")){
			finish=f;}
			else{
				throw new IllegalFastener("Illegal finish: " + f);}}
			
		
		//Finish for Brass and Stainless Steel Materials: Plain.
		else if(m.equalsIgnoreCase("Brass")||m.equalsIgnoreCase("Stainless Steel")){
			if(!f.equalsIgnoreCase("Plain")) {
			throw new IllegalFastener("Illegal finish: " + f);}
			else{
				f="Plain";
				finish=f;}
			}
			
		else{
			throw new IllegalFastener("Illegal finish: " + f);}
	
		
	}

	/*"Number per Unit" must be at least 1, but could be as high as 10,000. This number will always be 
	 * one or if higher, evenly divisible by 5. The Unit Price, in dollars, must be greater than zero 
	 * and is the price per unit, where a unit could be anywhere from 1 to 10,000 fasteners.
	 */
	
	
	private void setUnitPrice(double uP) throws IllegalFastener {
		if(uP>0.0) {
		unitPrice = uP;}
		
		else {
			throw new IllegalFastener("Illegal price: " + uP);}
		
	}

	private void setUnitNumb(int uN) throws IllegalFastener{
		if(uN==1) {
			unitNumb=1;
		}
		else if ( (uN<=10000) && uN%5==0 ) {
			unitNumb = uN;}
		
		else {
			throw new IllegalFastener("Illegal number of units: " + uN);}

	}

	
///	
	public double getUnitPrice() {
		return unitPrice;
	}

	public int getUnitNumb() {
		return unitNumb;
	}

	public double getOrderCost(int units) {
		double b=getUnitPrice();
		
		double orderCost=b*units;
		
		return  orderCost;}



}
