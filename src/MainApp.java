import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		//greeting 
		System.out.println("Welcome to PopUpPup!!!");
		
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
		products.add(new Product("Delight Dry      ","  Food",   "  Dry food     ", 5.00));
		products.add(new Product("Moist Delight    ","  Food" ,  "  Canned food  ", 5.00));
		products.add(new Product("Organic Delight  ","  Food" ,  "  Organic food ", 10.00));
		products.add(new Product("Puppy Delight    ","  Food",   "  Puppy food   ", 5.00));
		products.add(new Product("Delightful Treats","  Food",   "  Treats       ", 3.00));
		products.add(new Product("Good Bone        ","  Food" ,  "  Dog bone     ", 2.00));
		products.add(new Product("Blush Winter Coat","  Sweater","  Red          ", 20.00 ));
		products.add(new Product("Pale  Winter Coat","  Sweater","  Pink         ", 20.00));
		products.add(new Product("Grass Winter Coat","  Sweater","  Green        ", 20.00));
		products.add(new Product("Night Winter Coat","  Sweater","  Black        ", 20.00));
		products.add(new Product("Daisy Winter Coat","  Sweater","  Yellow       ", 20.00));
		products.add(new Product("Peach Winter Coat","  Sweater","  Orange       ", 20.00));
		
		ArrayList<Product> shoppingCart = new ArrayList <>();
		//test
//		shoppingCart.add(products.get(0));
//		shoppingCart.add(new Product("Daisy Winter Coat","  Sweater","  Yellow       ", 20.00));
//		shoppingCart.add(new Product("Peach Winter Coat","  Sweater","  Orange       ", 20.00));
//		
//		System.out.println(Calculations.CartTotal(shoppingCart));
//		author Armani--
		
		//test
		
		while (cont) {
			
			System.out.println("Are you shopping for dog food or a warm dog sweater? Press 1 for dog food, 2 for dog sweater: ");
			int categoryChoice = input.nextInt();
			
			for(int i=0; i<products.size(); i++){
				
				//products.get(i);
				if(categoryChoice==1){
					if(products.get(i).getCategory().contentEquals("  Food")){
						System.out.println(products.get(i).getItemName() + products.get(i).getCategory() + products.get(i).getDescription() + products.get(i).getFormattedItemPrice());
					}//second if close
					
				}else {
						
						if(products.get(i).getCategory().contentEquals("  Sweater")){
						System.out.println(products.get(i).getItemName() + products.get(i).getCategory() + products.get(i).getDescription() + products.get(i).getFormattedItemPrice());
						}//third if close
					}//first if/else close 
				
			}//first for loop close
			if (categoryChoice==1){
				System.out.println("Please press 1 for Delight Dry, 2 for Moist Delight, 3 for Organic Delight, 4 for Puppy Delight, 5 for Delightful Treats, 6 for Good Bone.");
			
			}else{
				System.out.println("Please press 7 for Blush Winter Coat, 8 for Pale Winter Coat, 9 for Grass Winter Coat, 10 for Night Winter Coat, 11 for Daisy Winter Coat, 12 for Peach Winter Coat.");
			}
			int numberChoice = input.nextInt(); //user input for choosing number for item for food or sweater

			Calculations.addToCart(numberChoice, shoppingCart, products);
			for(int i = 0; i<shoppingCart.size(); i++){
			System.out.print(shoppingCart.get(i).getItemName());
			System.out.print(shoppingCart.get(i).getCategory());
			System.out.print(shoppingCart.get(i).getDescription());
			System.out.print(shoppingCart.get(i).getItemPrice());
			System.out.println();

			}
			//Ask to check out 
			System.out.println("Check out? (y/n):");
			userCont = input.nextLine();
			userCont = input.nextLine();

			// If the user says no cont = true
			// Else cont = false
			if (userCont.equalsIgnoreCase("n")) {
				cont = true;
			} else {
				cont = false;
				System.out.println("Thank you for checking out, your total is: " + Calculations.userGrandTotal(shoppingCart) );
				System.out.println();
				System.out.println("Please select 1 for Cash, 2 for Credit or 3 for Check");
				int paymentMethod = input.nextInt();
				
				switch (paymentMethod) {
				
				case 1: //cash

					System.out.println("How much cash?");
					double cashTendered = input.nextDouble();
					System.out.println("You got $" + Calculations.userChange(cashTendered, shoppingCart) + " as your change");
					System.out.println();
					System.out.println("Here is your receipt: ");
					System.out.println(Calculations.userReceipt(shoppingCart));
				   break;
				case 2: //credit
					System.out.println("Please enter your credit card number:");
					String creditNumber = input.nextLine();
					input.nextLine();
					System.out.println("Please enter your expiration date: ");
					String creditExp = input.nextLine();
					System.out.println("Please enter your CVV number: ");
					String creditBack = input.nextLine();
					System.out.println("Thank you for entering your credit card information. Here is your receipt: ");
					System.out.println(Calculations.userReceipt(shoppingCart));
					
					break;
						
				case 3: //check
					System.out.println("Please enter your check number: ");
					String checkNumber = input.nextLine();
					input.nextLine();
					System.out.println("Your check has cleared. Here is your receipt: ");
					System.out.println(Calculations.userReceipt(shoppingCart));
					
					break;
					
					
				}
				
				System.out.println("THANK YOU FOR SHOPPING AT PopUpPup!!");
				
			} // if/else statement
		}//while loop close
			

	}//close psvm

}//close MainApp class
