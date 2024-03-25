public class MenuMethods {

	public static char getChoice() {
		char result = ' ';
		displayTheMenu();

		result = TestClassBicycle.in.next().toUpperCase().charAt(0);
		return result;

	} // end getChoice

	public static void displayTheMenu() {
		// System.out.println("** MAIN MENU **");
		marquee("MAIN MENU");
		System.out.println("[A]dd a bike to the list");
		System.out.println("[D]isplay all bikes");
		System.out.println("[Q]uit");
		System.out.print("\nEnter selection: ");
	} // end of displayTheMenu

	public static void marquee(String mess) {
		int size = mess.length() + 6;
		for (int i = 0; i < size; i++)
			System.out.print("*");
		System.out.println("\n" + "** " + mess + " **");
		for (int i = 0; i < size; i++)
			System.out.print("*");
		System.out.println();

	} // end of marquee

}
