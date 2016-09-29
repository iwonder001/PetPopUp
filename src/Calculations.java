
public class Calculations {

	//declare variables
//	public int quantity;
//	public int quantityTotal;
//	public double lineTotal;
//	public double subtotal;
//	public double grandTotal;
//	public double tax;	
//	public static int saveItem = 0;
//	
	public Calculation (double)
public double Calculation (double total){
	double subtotal = sub;
	saveItem += total;	
}
   //acquire methods for the quantity
	public int userQuantity(int quantity){
		return quantity;
		
	}//end of userQuantity
	public double userSubtotal(double subtotal){
		return subtotal;
		
	}//end of userSubtotal
	public double userTax(){
		double tax = (1.05);
		return tax;
		
	}// end of user tax
	public double userGrandTotal(int quantity, double subtotal){
		double grandtotal =(quantity * subtotal * userTax());
		return grandtotal;
	}//end of userGrandTotal
	public int userQuantityTotal(int quatityTotal)
	int quantityTotal = quatityTotal * int userQuantity(); 
}//end of class
