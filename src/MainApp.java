import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		//greeting 
		System.out.println("Welcome to PopUpPup!!! Please browse our menu: ");
		
		System.out.println();
		//while loop variables
		String userCont; // Variable to allow the user to continue the program
		// (handle the loop)
		boolean cont = true; // Variable to control while loop and initialize
		// variable to true
		
		Scanner input = new Scanner(System.in); 
		
		//created Product object
		
		//create Arraylist
		ArrayList<Product> products = new ArrayList <Product>();
		products.add(new Product("Delight Dry","food" , "Dry food", 5.00));
		products.add(new Product("Moist Delight","food" , "Canned food", 5.00));
		products.add(new Product("Organic Delight", "food" ,"Organic food", 10.00));
		products.add(new Product("Puppy Delight","food", "Puppy food", 5.00));
		products.add(new Product("Delightful Treats","food", "Treats", 3.00));
		products.add(new Product("Good Bone", "food" ,"Dog bone", 2.00));
		products.add(new Product("Blush Winter Coat","" ,"Red", 20.00 ));
		products.add(new Product("Pale Winter Coat","Sweater", "Pink", 20.00));
		products.add(new Product("Grass Winter Coat","Sweater","Green", 20.00));
		products.add(new Product("Night Winter Coat","Sweater", "Black", 20.00));
		products.add(new Product("Daisy Winter Coat","Sweater", "Yellow", 20.00));
		products.add(new Product("Citrus Winter","Sweater","Orange", 20.00));
		
		while (cont) {
			
			System.out.println("Are you shopping for dog food or a warm dog sweater? Press 1 for dog food, 2 for dog sweater: ");
			int categoryChoice = input.nextInt();
			
			for(int i=0; i<products.size(); i++){
				
				products.get(i);
				if(categoryChoice==1){
					if(products.get(i).getCategory()== "food"){
						System.out.println(products.get(i));
					}//Second if loop close
					
				}//first if loop close
				
			}//first for loop close
			
			
			
			
			
			//Ask to check out 
			System.out.println("Check out? (y/n):");
			userCont = input.nextLine();
			userCont = input.nextLine();

			// If the user says yes cont = true
			// Else cont = false
			if (userCont.equalsIgnoreCase("y")) {
				cont = true;

			} else {
				cont = false;
			} // if/else statement
		}//while loop close
		
		
		
		

	}//close psvm

}//close MainApp class
