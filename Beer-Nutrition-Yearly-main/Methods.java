package theBeerAssignment;

import java.text.DecimalFormat;

public class Methods {

	public static double calcBeersPerYear(double numBeersADay) {
		double result = 0;
		result = numBeersADay * 365;

		return result;

	} // end of calcBeersPerYear

	public static double calcCalsPerYear(double numBeersAYear, double CALSPERBEER) {
		double result = 0;
		result = numBeersAYear * CALSPERBEER;

		return result;

	} // end of gainPerYear

	public static double calcWeightGainPerYear(double numBeersAYear, double weightGainPerBeer) {
		double result = 0;
		
		weightGainPerBeer = (double) 15 / 365;
		result = weightGainPerBeer * numBeersAYear;
		
		return result;
		
	} // end of calcWeightGainPerYear
	
	public static double calcCostBeersAYear(double numBeersAYear, double costOfABeer) {
		double result = 0;
		
		result = numBeersAYear * costOfABeer;
		
		return result;
		
	} // end of costBeersAYear
	
	public static String formatNumBeers(double numBeersAYear) {
		String result = "";
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		result = df.format(numBeersAYear);
		
		return result;
	} //end formatNumBeers
	
	public static String formatCalsAYear(double calsAYear) {
		String result = "";
		
		DecimalFormat df = new DecimalFormat("####.00");
		result = df.format(calsAYear);
		
		return result;
	} // end formatCalsAYear
	
	public static String formatWeightAYear(double weightGainAYear) {
		String result = "";
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		result = df.format(weightGainAYear);
		
		return result;

	} // end formatWeightAYear
} // end class Methods