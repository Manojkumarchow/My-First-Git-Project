import java.util.Scanner;
public class VendingMachine {
	public static void main(String[] args) {
		int coldCoffee, hotCoffee, filteredCoffee;
		float price1=70, price2=40, price3=120, balance, amountGiven, cost, quantity;
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.print("Select Coffee Type:\n");
		System.out.println("*******************");
		System.out.println("1. Cold Coffee---Rs.70");
		System.out.println("2. Hot Coffee---Rs.40");
		System.out.println("3. Filtered Coffee---Rs.120");
		choice = s.nextInt();
		switch (choice) {
		case 1:	System.out.println("Enter Quantity for Cold_Coffee:");
				quantity = s.nextFloat();
				cost = price1 * quantity;
				System.out.println("Please Give Amount:");
				amountGiven = s.nextFloat();
				if(amountGiven<cost) {System.out.println("Please Give Valid Amount");}
				else {
				balance = amountGiven - cost;
				System.out.println("Please Take Your Amount:"+balance);
				break;
				}
		case 2: System.out.println("Enter Quantity for Hot_Coffee:");
		        quantity = s.nextFloat();
		        cost = price2 * quantity;
		        System.out.println("Please Give Amount:");
		        amountGiven = s.nextFloat();
		        if(amountGiven<cost) {System.out.println("Please Give Valid Amount");}
		        else {
		        balance = amountGiven - cost;
				System.out.println("Please Take Your Amount:"+balance);
		        break;
		        }
		case 3: System.out.println("Enter Quantity for Filtered_Coffee:");
				quantity = s.nextFloat();
				cost = price3 * quantity;
				System.out.println("Please Give Amount:");
				amountGiven = s.nextFloat();
				if(amountGiven<cost) {System.out.println("Please Give Valid Amount");}
				else {
				balance = amountGiven - cost;
				System.out.println("Please Take Your Amount:"+balance);
				}
		default: System.out.println("Please Select the Coffee Type");
			break;
		}
	}
}