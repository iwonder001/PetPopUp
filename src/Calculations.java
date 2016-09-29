import java.util.Currency;
import java.util.Scanner;

public class Calculations {
	Scanner sc = new Scanner (System.in);
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
	
	//captures and saves the quantity of the items
	public static int saveUserQuantity(){
	return saveQuantity;
	}
	//captures and saves the subtotal
	public static double saveUsersubtotal(){
	return saveSubtotal;
	}
	//Get user input for payment methods and establish change
	public double userChange(double x, double grandTotal){
		
		
		double change = ( sc.nextDouble()- grandTotal);
		return change;
	}

	
	
}//end of class
