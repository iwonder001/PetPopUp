import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		//greeting 
		System.out.println("Welcome to PopUpPup!!! Please browse our menu: ");
		
		System.out.println();
		//while loop variables
		String cont;
		cont = "y";
		
		Scanner sc = new Scanner(System.in); 
		
		//created Product object
		Product p = new Product (name, category, description, price);
		
		//create Arraylist
//		ArrayList<String> name = new Arraylist <String> (String number, String title);
		ArrayList<Product> products = new ArrayList <Product>();
		Products.add(new Product("Delight Dry" "Dry food", 5.00));
		Products.add(new Product("Moist Delight", "Canned food", 5.00));
		Products.add(new Product("Organic Delight", "Organic food", 10.00));
		Products.add(new Product("Puppy Delight", "Puppy food", 5.00));
		Products.add(new Product("Delightful Treats", "Treats", 3.00));
		Products.add(new Product("Good Bone", "Dog bone", 2.00));
		Products.add(new Product("Blush Winter Coat","Red Sweater", 20.00 ));
		Products.add(new Product("Pale Winter Coat", "Pink Sweater", 20.00));
		Products.add(new Product("Grass Winter Coat","Green Sweater", 20.00));
		Products.add(new Product("Night Winter Coat", "Black Sweater", 20.00));
		Products.add(new Products("Daisy Winter Coat", "Yellow Sweater", 20.00));
		Products.add(new Products("Citrus Winter", "Orange Sweater", 20.00));
		
		while (cont.equalsIgnoreCase("y")) {
			
			
			
			
			
			
			
			
			
			
			//Ask to check out 
			System.out.println("Check out? (y/n):");
			cont = input.nextLine();
			cont = input.nextLine();
			
		}//while loop close
		
		
		
		

	}//close psvm

}//close MainApp class
