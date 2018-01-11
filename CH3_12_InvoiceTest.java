

import java.util.Scanner;

public class CH3_12_InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		CH3_12_Invoice myInvoice1 = new CH3_12_Invoice("00001", "Xiaomi mi5", 5, 22.80);

		System.out.printf("Invoice number:%s for \"%s\" sold @ $%.2f, quantity: %d | amount: $%.2f",
				myInvoice1.getPartNumber(), myInvoice1.getPartDescription(), myInvoice1.getItemPrice(),
				myInvoice1.getItemQuantity(), myInvoice1.getInvoiceAmount());

		System.out.println();

		CH3_12_Invoice myInvoice2 = new CH3_12_Invoice("00002", "Samsung s8", 23, 66.80);

		System.out.printf("Invoice number:%s for \"%s\" sold @ $%.2f, quantity: %d | amount: $%.2f",
				myInvoice2.getPartNumber(), myInvoice2.getPartDescription(), myInvoice2.getItemPrice(),
				myInvoice2.getItemQuantity(), myInvoice2.getInvoiceAmount());

		System.out.println();

		System.out.printf("Enter new price for %S:",myInvoice1.getPartDescription()); // prompt to new price
		double itemPrice = input.nextDouble();
		System.out.printf("%nmodifying price for %S from $%.2f to $%.2f%n%n", myInvoice1.getPartDescription(), myInvoice1.getItemPrice(),
				itemPrice);
		myInvoice1.setItemPrice(itemPrice);

		System.out.printf("Invoice number:%s for \"%s\" sold @ $%.2f, quantity: %d | amount: $%.2f",
				myInvoice1.getPartNumber(), myInvoice1.getPartDescription(), myInvoice1.getItemPrice(),
				myInvoice1.getItemQuantity(), myInvoice1.getInvoiceAmount());

		System.out.println();
		System.out.printf("Enter new qunatity for %S:",myInvoice1.getPartDescription()); // prompt to new quantity
		int itemQuantity = input.nextInt();
		System.out.printf("%nmodifying quantity for %S from %d to %d%n%n",myInvoice1.getPartDescription(), myInvoice1.getItemQuantity(),itemQuantity);
		myInvoice1.setItemQuantity(itemQuantity);
		
		System.out.printf("Invoice number:%s for \"%s\" sold @ $%.2f, quantity: %d | amount: $%.2f",
				myInvoice1.getPartNumber(), myInvoice1.getPartDescription(), myInvoice1.getItemPrice(),
				myInvoice1.getItemQuantity(), myInvoice1.getInvoiceAmount());
		
	}

}
