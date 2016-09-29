import java.util.Currency;

public class Calculations {
	
	private static int saveQuantity;
	private static double saveSubtotal;

	

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
	
	public static int saveUserQuantity(){
	return saveQuantity;
	}
	public static double saveUsersubtotal(){
	return saveSubtotal;
	}
	public double userChange(){
		double change = (sc - grandtotal);
		return change;
	}

	
	
}//end of class
