import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Public tests for Worksheet 4, Exercise 2. Four tests to check the toString()
 * method for the Vehicle and Car classes.
 * @author David McDonald and Jacob Smith (tests 5-8)
 *
 */
public class VehicleTest {
	
	private Vehicle vehicle;

	@Test
	public void ex2PublicTest1() {
		vehicle = new Vehicle(120.0, 5);
		
		String expected = "The vehicle has a maximal speed of 120.0 km/h. " +
				"It carries 5 passengers.";
		String actual = vehicle.toString();
		
		assertEquals(expected, actual);
	}

	@Test
	public void ex2PublicTest2() {
		vehicle = new Vehicle(65.0, 1);
		
		String expected = "The vehicle has a maximal speed of 65.0 km/h. " +
				"It carries 1 passenger.";
		String actual = vehicle.toString();
		
		assertEquals(expected, actual);
	}

	@Test
	public void ex2PublicTest3() {
		vehicle = new Car(120.0, 5, 6.3);
		
		String expected = "The vehicle has a maximal speed of 120.0 km/h. " +
				"It carries 5 passengers. " +
				"Its fuel consumption is 6.3 l/100km.";
		String actual = vehicle.toString();
		
		assertEquals(expected, actual);
	}

	@Test
	public void ex2PublicTest4() {
		vehicle = new Car(65.0, 1, 7.5);
		
		String expected = "The vehicle has a maximal speed of 65.0 km/h. " +
				"It carries 1 passenger. " +
				"Its fuel consumption is 7.5 l/100km.";
		String actual = vehicle.toString();
		
		assertEquals(expected, actual);
	}
@Test
public void ex2PublicTest5() {
	vehicle = new Vehicle(160.0, 8);
	
	String expected = "The vehicle has a maximal speed of 160.0 km/h. " +
			"It carries 8 passengers.";
	String actual = vehicle.toString();
	
	assertEquals(expected, actual);
}

@Test
public void ex2PublicTest6() {
	vehicle = new Vehicle(55.0, 1);
	
	String expected = "The vehicle has a maximal speed of 55.0 km/h. " +
			"It carries 1 passenger.";
	String actual = vehicle.toString();
	
	assertEquals(expected, actual);
}

@Test
public void ex2PublicTest7() {
	vehicle = new Car(100.0, 3, 5.3);
	
	String expected = "The vehicle has a maximal speed of 100.0 km/h. " +
			"It carries 3 passengers. " +
			"Its fuel consumption is 5.3 l/100km.";
	String actual = vehicle.toString();
	
	assertEquals(expected, actual);
}

@Test
public void ex2PublicTest8() {
	vehicle = new Car(45.0, 2, 8.5);
	
	String expected = "The vehicle has a maximal speed of 45.0 km/h. " +
			"It carries 2 passengers. " +
			"Its fuel consumption is 8.5 l/100km.";
	String actual = vehicle.toString();
	
	assertEquals(expected, actual);
}
}