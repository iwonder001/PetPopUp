import java.util.ArrayList;
import java.util.Currency;
import java.util.Scanner;

public class Calculations {
	Scanner sc = new Scanner (System.in);
	public double counter;
	public double ShoppingCart;
	public static double saveSubtotal;

	
	public double productCount(double x){
		return counter++;
	}//end of userSubtotal
	
	public double userTax(){
		double tax = (1.05);
		return tax;
		
	}// end of user tax
	
	public double userGrandTotal(double subtotal){
		double grandtotal =(subtotal * userTax());
		return grandtotal;
	}//end of userGrandTotal
	
	//captures and saves the subtotal
	public static double getUsersubtotal(){
	return saveSubtotal;
	}
	//Get user input for payment methods and establish change
	public double userChange(double x, double grandTotal){
		
		
		double change = ( sc.nextDouble()- grandTotal);
		return change;
	}
	
		//shopping cart methods
		
		public static double CartTotal(ArrayList<Product> shoppingCart){
			double cartTotal=0;
			for( int i = 0; i < shoppingCart.size(); i++){
			shoppingCart.get(i).getItemPrice();
			
			cartTotal += shoppingCart.get(i).getItemPrice();
 
		}	
			return cartTotal ;
		}
		
	
	
}//end of class
