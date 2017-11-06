/**
 * @author Jacob Smith
 * A program for a patient and their weight, linked with an interface
 */
public class Patient implements Measurable { // Links to the interface for getMeasure

	private String name;
	private int age;
	private double weight;
	
	public Patient(String name, int age, double weight) { // Constructor for patient's info
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}

	private double getWeight() { // Getter to return a weight
		return weight;
	}
	
	@Override
	public String toString() { // Simple toString created from Source menu
		return "Patient [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	@Override
	public double getMeasure() { // Links back to the interface
		return getWeight(); // returns the weight
	}
}
