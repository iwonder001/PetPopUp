import java.util.ArrayList;
import java.util.Currency;
import java.util.Scanner;

public class Calculations {
//	Scanner sc = new Scanner (System.in);
//	public double counter;
//	public double ShoppingCart;
	
//	public double productCount(double x){
//		return counter++;
//	}//end of userSubtotal
	
	public static double userTax(){
		double tax = (1.05);
		return tax;
		
	}// end of user tax
	
	public static double userGrandTotal(ArrayList<Product> shoppingCart){
		double subtotal =CartTotal(shoppingCart);
		
		double grandtotal =(subtotal * userTax());
		return grandtotal;
	}//end of userGrandTotal
	

	//Get user input for payment methods and establish change
	public static double userChange(double cashTendered, ArrayList<Product> shoppingCart){
		double grandTotal = userGrandTotal(shoppingCart);
		double change = ( cashTendered - grandTotal);
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
		
		public static ArrayList<Product> addToCart(int numberChoice, ArrayList<Product> shoppingCart,ArrayList<Product> products){
            
            
        switch (numberChoice) {

        case 1:
            shoppingCart.add(products.get(0));
            break;
            
        case 2:
            shoppingCart.add(products.get(1));
            break;
            
        case 3:
            shoppingCart.add(products.get(2));
            break;    
            
        case 4:
            shoppingCart.add(products.get(3));
            break;
            
        case 5:
            shoppingCart.add(products.get(4));
            break;
            
        case 6:
            shoppingCart.add(products.get(5));
            break;
        
        case 7:
            shoppingCart.add(products.get(6));
            break;
            
        case 8:
            shoppingCart.add(products.get(7));
            break;
            
        case 9:
            shoppingCart.add(products.get(8));
            break;
            
        case 10:
            shoppingCart.add(products.get(9));
            break;
            
        case 11:
            shoppingCart.add(products.get(10));
            break;
            
        case 12:
            shoppingCart.add(products.get(11));
            break;
        }
        return shoppingCart;
        }
		
	public static String userReceipt(ArrayList<Product>shoppingCart){
		String receipt = "";
		for( int i = 0; i < shoppingCart.size(); i++){
			String name =shoppingCart.get(i).getItemName();
			String price = Product.formatNumber(shoppingCart.get(i).getItemPrice());	
			receipt+= (name+ "$"+ price);
	}
		return receipt;
	

	}//end of userReciept
	
	}//end of class
