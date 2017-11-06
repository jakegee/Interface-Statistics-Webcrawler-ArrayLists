import java.util.ArrayList;

/**
 * @author Jacob Smith
 * The goal of this program is to calculate mean values and standard deviation of a non-empty ArrayList
 * of elements
 */
public class Statistics {

	public static double mean(ArrayList<Measurable> list) { // This website helped me
															// http://stackoverflow.com/questions/10791568/calculating-average-of-an-array-list
		double sum = 0; // Initializing the sum to 0
		if (!list.isEmpty()) { // If the list for ArrayList is empty
			for (Measurable i : list) { // for each loop
				sum += i.getMeasure(); // sum is addition of itself to i of
										// i.getMeasure
			}
			return sum / list.size(); // Returns the sum divided by the array
										// list size
		}
		return sum; // Return the sum
	}

	public static double standardDeviation(ArrayList<Measurable> list) { // This website helped me
																			// http://stackoverflow.com/questions/14839056/standard-deviation-of-any-sized-array-java
		double sum = 0; // Initialized the sum to 0
		double mean = mean(list); // mean gets the list mean
		for (Measurable i : list) { // for each loop of measurabe i and list
			sum += Math.pow(i.getMeasure() - mean, 2); // using map.pow to square i.getMeasure
														// then subtract it by the mean and summing it all
		}
		return Math.sqrt(sum / list.size()); // returns the square root of sum
												// divided by list size

	}
}
