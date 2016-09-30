

public class Product {

	// the instance variables
	public String itemName;
	public String category;
	public String description;
	public double itemPrice;

	// the constructor
	public Product(String n, String c, String d, double p) {

		itemName = n;
		category = c;
		description = d;
		itemPrice = p;
	}

	// the get and set methods for the item name variable
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String n) {
		itemName = n;
	}

	// the get method for the category variable
	public String getCategory() {
		return category;
	}

	// the get method for the description variable
	public String getDescription() {
		return description;
	}

	// the get method for the description variable
	public double getItemPrice() {
		return itemPrice;
	}

	// a custom method for the number variable
	public String formatNumber(double x) {
		String formattedNumber = String.format("%,.2f", x);
		return formattedNumber;
	}
	// pass the getArea method into the formatting
		public String getFormattedItemPrice() {
			String myItemPrice = formatNumber(getItemPrice());
			return myItemPrice;
		}
}
