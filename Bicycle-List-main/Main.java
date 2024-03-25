import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		boolean repeat = true;
		char choice = ' ';
		int eSize = 0;
		
		ArrayList<Bicycle> bicycles = new ArrayList<Bicycle>();

		while (repeat) {
			try {
				do {
					choice = MenuMethods.getChoice();
					switch (choice) {
					case 'A': // adding name method
						System.out.println("\nEnter the bike's information below!");
						ArrayMethodsBike.loadArray(bicycles);
						eSize++;
						break;
					case 'D': // display array method
						if (eSize == 0)
							System.out.println("There are no bikes added to the list! Please try again.\n");
						else
							ArrayMethodsBike.displayArray(bicycles);
						break;
					case 'Q': // quit program
						MenuMethods.marquee("Thanks for using my program!");
						break;
					default:
						MenuMethods.marquee("Please enter from the options below!");
						break;
					} // end switch

				} while (choice != 'Q');
			} catch (Exception e) {
				System.out.println("\nINPUT INVALID!");
				System.out.println();
				repeat = true;
			}
		}
	}
}
