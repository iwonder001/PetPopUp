
public class Product {

	// the instance variables
	public String itemName;
	public String category;
	public String description;
	public double itemPrice;
	public int quantity;

	// the constructor
	public Product(String n, String c, String d, double p) {

		itemName = n;
		category = c;
		description = d;
		itemPrice = p;
		quantity = 0;
	}

	// the get and set methods for the item name variable
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String n) {
		itemName = n;
	}

	//the get method for the category variable
	public String getCategory() {
		return category;
	}

	//the get method for the description variable
	public String getDescription() {
		return description;
	}

	//the get method for the description variable
	public double getItemPrice() {
		return itemPrice;
	}

	//the get and set methods for the quantity variable
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int userQuantity) {
		userQuantity = quantity;
	}
}
