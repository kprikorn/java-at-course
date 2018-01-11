

public class CH3_12_Invoice {
	// instance variables
	private String partNumber;
	private String partDescription;
	private int itemQuantity;
	private double itemPrice;

	// constructor initializes partNumber,partDescription,itemQuantity and itemPrice

	public CH3_12_Invoice(String partNumber, String partDescription, int itemQuantity, double itemPrice) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;

		if (itemQuantity > 0) {// itemQuantity is valid
			this.itemQuantity = itemQuantity;
		}
		if (itemPrice > 0.00) {// itemPrice is valid
			this.itemPrice = itemPrice;
		}
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public String getPartDescription() {
		return partDescription;
	}

	
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public double getInvoiceAmount() {
		return itemQuantity * itemPrice;
	}
}

/*
 * 3.12 (Invoice Class) Create a class called Invoice that a hardware store
 * might use to represent an invoice for an item sold at the store. An Invoice
 * should include four pieces of information as instance variables—a part number
 * (type String), a part description (type String), a quantity of the item being
 * purchased (type int) and a price per item (double). Your class should have a
 * constructor that initializes the four instance variables. Provide a set and a
 * get method for each instance variable. In addition, provide a method named
 * getInvoiceAmount that calculates the invoice amount (i.e., multiplies the
 * quantity by the price per item), then returns the amount as a double value.
 * If the quantity is not positive, it should be set to 0. If the price per item
 * is not positive, it should be set to 0.0. Write a test app named InvoiceTest
 * that demonstrates class Invoice’s capabilities.
 */
