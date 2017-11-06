/**
 * @author Jacob Smith
 * A program for a class vehicle, figuring out the speed and passengers
 */
public class Vehicle {

	private double maxSpeed;
	private int maxPassengers;

	public Vehicle(double maxSpeed, int maxPassengers) { // Constructor for the speed and passengers
		this.maxSpeed = maxSpeed;
		this.maxPassengers = maxPassengers;
	}

	public double getMaxSpeed() { // getter for maxSpeed
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) { // setter for maxSpeed
		this.maxSpeed = maxSpeed;

	}

	public double getMaxPassengers() { // getter for maxPassengers
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) { // setter for maxPassengers
		this.maxPassengers = maxPassengers;

	}

	@Override
	public String toString() { // toString has an if statement where
		if (maxPassengers == 1) { // if the maxPassengers is just 1 then passenger is singular
			return "The vehicle has a maximal speed of " + maxSpeed + " km/h. It carries " + maxPassengers + " passenger.";
		} else // else, the plural form passengers will be used
			return "The vehicle has a maximal speed of " + maxSpeed + " km/h. It carries " + maxPassengers
					+ " passengers.";
	
	}
}
