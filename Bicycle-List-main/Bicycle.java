import java.util.*;

public class Bicycle {
	Scanner input = new Scanner(System.in);
	private String brand;
	private String color;
	private String type;
	private char hasGears;
	private double wheelSize;
	private String[] bikeTypes = { "City", "Hybrid", "Off-road" };
	boolean validInput;

	public Bicycle() {
		getBike();
	}

	public Bicycle(String brand, String color, char hasGears, String type, double wheelSize) {
		super();
		this.brand = brand;
		this.color = color;
		this.hasGears = hasGears;
		this.type = type;
		this.wheelSize = wheelSize;
	}

	public String getBrand() {
		System.out.print("\nEnter the bicycle\'s brand: ");
		brand = input.nextLine();
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		System.out.print("\nEnter the bicycle\'s color: ");
		color = input.nextLine();
		color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getHasGears() {
		System.out.print("\nDoes the bicycle have gears (Y/N)? ");
		hasGears = input.next().toUpperCase().charAt(0);
		return hasGears;
	}

	public void setHasGears(char hasGears) {
		this.hasGears = hasGears;
	}

	public String getType() {
		System.out.print("\nIs the bike type city, off-road, or hybrid? ");
		type = input.next();
		type = type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase();
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWheelSize() {
		System.out.print("\nEnter the wheel size for the bike: ");
		wheelSize = input.nextDouble();
		return wheelSize;
	}

	public void setWheelSize(double wheelSize) {
		this.wheelSize = wheelSize;
	}

	public void validateInput() {
		if (Arrays.asList(bikeTypes).contains(type)) {
			validInput = true;
		} else if (hasGears == 'Y' || hasGears == 'N')
			validInput = true;
		else
			validInput = false;
	}

	public void getBike() {
		do {
			getBrand();
			getColor();
			getHasGears();
			getWheelSize();
			validateInput();

			if (validInput == false)
				System.out.println("\nINVALID INFO!\nTRY AGAIN!");
		} while (validInput == false);
	}

	@Override
	public String toString() {
		String result = "\nBIKE INFO";
		result += "Brand: " + brand;
		result += "Color: " + color;
		result += "Gears: " + hasGears;
		result += "Wheel size: " + wheelSize;

		return result;
	}
} // end Bicycle
