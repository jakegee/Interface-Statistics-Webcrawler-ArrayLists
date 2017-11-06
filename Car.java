/**
 * @author Jacob Smith
 * A program for class Car that uses inheritance from class Vehicle
 * Also calculates for fuel consumption in addition
 */
public class Car extends Vehicle { // Using inheritance for class Vehicle

		private double fuelConsumption;

		public Car(double maxSpeed, int maxPassengers, double fuelConsumption) { // Constructor
			super(maxSpeed, maxPassengers); // Has a super to bring in objects from class Vehicle
			this.fuelConsumption = fuelConsumption;

		}

		public double getFuelConsumption() { // getter for fuelConsumption
			return fuelConsumption;
		}

		public void setFuelConsumption(double fuelConsumption) { // setter for fuelConsumption
			this.fuelConsumption = fuelConsumption;

		}
	public String toString() { // toString that includes a super.toString which brings class Vehicles
								// toString in addition to the new fuel consumption toString from this class
		return super.toString() + " Its fuel consumption is " + fuelConsumption + " l/100km.";
	}
}