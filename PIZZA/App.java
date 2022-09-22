// import the Scanner class
import java.util.Scanner;

public class App {

	// Scanner Object
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		orderPizza();
	}

	static void orderPizza() {

		System.out.println("Welcome to Pizza Hut!");

		System.out.println("Enter letter A if you want a Hawaiian pizza!");
		System.out.println("Enter letter B if you want a Pepperoni pizza!");

		System.out.print("Enter your choice: ");
		char choice = scan.next().charAt(0);

		// Initial value
		String pizza = "";
		double price = 0;

		switch (choice) {
			case 'A':
				pizza = "Hawaiian pizza";
				price = 599.00;
				break;
			case 'B':
				pizza = "Pepperoni pizza";
				price = 535.00;
				break;
			default:
				System.out.println("Please enter A or B!");
				return; // EXIT PROGRAM
		}

		System.out.println("Your order is: " + pizza);
		System.out.println("Your total order amount is: " + price);

		System.out.println("Enter X if you want your crust Hand tossed!");
		System.out.println("Enter Y if you want  your crust Thin crust!");

		System.out.print("Enter your choice: ");
		String paymentMethod = scan.next();

		switch (paymentMethod) {
			case "X":
				System.out.println("One hand tossed coming right up!");
				break;
			case "Y":
				System.out.print("One thin crust coming right up!");
				break;
			default:
				System.out.println("Trip moko?!");
				return; // EXIT PROGRAM
		}

		System.out.println("What size do you want? (Small, Medium, Large !)");
		System.out.print("Please enter S, M or L: ");
        String size = scan.next();
       
        switch (size) {
			case "S":
				System.out.println("You will have small size");
				break;
			case "M":
				System.out.print("You will have medium size:");
				break;
             case "L":
				System.out.print("You will have Large size:");
				break;
			default:
				System.out.println("Y?!");
				return;// EXIT PROGRAM
		}
       
        System.out.println("\n" + "Quantity of your order!");
        int quantity = scan.nextInt();

        double total;
        total = quantity * price;

        System.out.println("\n" + "Your subtotal is: php! " + total);

		
		scan.close();
	}
}


