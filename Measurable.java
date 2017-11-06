/**
 * @author Jacob Smith
 * This interface links the invoice and patient classes through their use of getMeasure
 */
public interface Measurable {

	double getMeasure(); // This calculates the amount and weight from the
							// invoice and patient class
}
