import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
/**
 * Public tests for Worksheet 4, Exercise 1. They test the
 * getMeasure() methods for invoices and patients. Furthermore the
 * mean and standard deviation for ArrayList of type Measurable.
 *
 * @author David McDonald and Jacob Smith (Test 5-8)
 *
 */
public class MeasurableTest {

	@Test
	public void ex1PublicTest1() {
		Invoice invoice = new Invoice("14525489", "77-95-62", 1000);
		
		double expected = 1000;
		double actual = invoice.getMeasure();
		double tolerance = 1e-8;
		
		assertEquals(expected, actual, tolerance);
	}

	@Test
	public void ex1PublicTest2() {
		Patient patient = new Patient("John Doe", 35, 85.5);
		
		double expected = 85.5;
		double actual = patient.getMeasure();
		double tolerance = 1e-8;
		
		assertEquals(expected, actual, tolerance);
	}
	
	@Test
	public void ex1PublicTest3() {
		
		ArrayList<Measurable> invoices = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++){
			invoices.add(new Invoice("14525489", "77-95-62", i*1000));
		}
		
		double expected = 5500;
		double actual = Statistics.mean(invoices);
		double tolerance = 1e-8;
		
		assertEquals(expected, actual, tolerance);
	}
	
	@Test
	public void ex1PublicTest4() {
		
		ArrayList<Measurable> patients = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++){
			patients.add(new Patient("John Doe", 35, i*20));
		}
		
		double expected = 57.445626465380286;
		double actual = Statistics.standardDeviation(patients);
		double tolerance = 1e-8;
		
		assertEquals(expected, actual, tolerance);
	}
@Test
public void ex1PublicTest5() {
	Invoice invoice = new Invoice("9876543", "69-42-00", 999);
	
	double expected = 999;
	double actual = invoice.getMeasure();
	double tolerance = 1e-8;
	
	assertEquals(expected, actual, tolerance);
}

@Test
public void ex1PublicTest6() {
	Patient patient = new Patient("Del Boy", 45, 75.2);
	
	double expected = 75.2;
	double actual = patient.getMeasure();
	double tolerance = 1e-8;
	
	assertEquals(expected, actual, tolerance);
}

@Test
public void ex1PublicTest7() {
	
	ArrayList<Measurable> invoices = new ArrayList<>();
	
	for (int i = 1; i <= 10; i++){
		invoices.add(new Invoice("9876543", "69-42-00", i*1000));
	}
	
	double expected = 5500;
	double actual = Statistics.mean(invoices);
	double tolerance = 1e-8;
	
	assertEquals(expected, actual, tolerance);
}

@Test
public void ex1PublicTest8() {
	
	ArrayList<Measurable> patients = new ArrayList<>();
	
	for (int i = 1; i <= 10; i++){
		patients.add(new Patient("Del Boy", 45, i*20));
	}
	
	double expected = 57.445626465380286;
	double actual = Statistics.standardDeviation(patients);
	double tolerance = 1e-8;
	
	assertEquals(expected, actual, tolerance);
}
}