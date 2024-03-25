//********************************************************************
//*** Written by..: Henrique Lacerda
//*** Date Written: September 6, 2021
//*** Purpose.....: To calculate how many beers drank in a year
//                : To calculate how many calories gained in a year
//                : To calculate the weight gain in a year
//********************************************************************


package theBeerAssignment;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		final double CALSPERBEER = 150;
		final double OUNCESPERBEER = 12;
		double numBeersADay = 0;
		double numBeersAYear = 0;
		double calsAYear = 0;
		double weightGainPerBeer = 0;
		double weightGainAYear = 0;
		double costOfABeer = 0;
		double costBeersAYear = 0;
		
		
		// get user input here
		numBeersADay = getADouble("On average, how many beers will you consume each day? ");
		costOfABeer = getADouble("On average, how much will pay for each can of beer? ");
		
		// Calculate the number of beers consumed per year
		numBeersAYear = Methods.calcBeersPerYear(numBeersADay);
		
		// Calculate number of calories per year
		calsAYear = Methods.calcCalsPerYear(numBeersAYear, CALSPERBEER);
		
		// Calculate weight gain per year
		weightGainAYear = Methods.calcWeightGainPerYear(numBeersAYear, weightGainPerBeer);
		
		// Calculate the cost on beers per year
		costBeersAYear = Methods.calcCostBeersAYear(numBeersAYear, costOfABeer);
	
		System.out.println("That is approximately " + Methods.formatNumBeers(numBeersAYear) + " beers in one year.");
		System.out.println("In one year, you will consume approximately " + Methods.formatCalsAYear(calsAYear) + " calories from beer alone.");
		System.out.println("Without diet or exercise to counter these calories, you can expect to gain " + Methods.formatWeightAYear(weightGainAYear) + " pounds from drinking that much beer this year.");
		
	} // end of main
	
	public static double getADouble(String mess) {
		double result = 0;
		boolean badValue = true;
		Scanner in = new Scanner(System.in);
		
		while(badValue) {
		
		System.out.print(mess);
		result = in.nextDouble();
		
		if(result < 0) {
			System.out.println("You must type a positive value.");
			badValue = true;
		}
		
		else
			badValue = false;
		
		} //end of while loop
		
		return result;
		
	} // end of getADouble
	
	
	
} // end of TestClassBeerProgram
