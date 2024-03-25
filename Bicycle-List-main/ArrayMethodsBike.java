import java.util.ArrayList;

public class ArrayMethodsBike {

	public static void loadArray(ArrayList<Bicycle> bicycles) {
		Bicycle bikes = new Bicycle();

		bicycles.add(bikes);
	}

	public static void displayArray(ArrayList<Bicycle> bikes) {

		for (int i = 0; i < bikes.size(); i++) {
			System.out.println(bikes.get(i));

		} // end for loop

	} // end displayWords

}
