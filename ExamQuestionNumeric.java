/**
 * @author Jacob Smith
 * A program for giving a numeric value for an answer utilising inheritance
 */
public class ExamQuestionNumeric extends ExamQuestion { // Calls the class ExamQuestion

	private int answer;
	
		public ExamQuestionNumeric(String questionText, int maximalMark, int answer) { // Constructor
		super(questionText, maximalMark); // Calls the objects from class ExamQuestion
		this.answer = answer;
		}

		public int mark(int value) { // method to give a answer a value
		if  (answer == value){
			return getMaximalMark(); // returns maximalMark
		}
		else{return 0;} // else it returns a 0
		
			
		}
			

		@Override
		public String toString() { // toString that calls class ExamQuestions in addition to this one
		return super.toString() + " The answer is " + answer;
		}
		
			
			

/**			public static void main(String[] args){
				ExamQuestionNumeric i = new ExamQuestionNumeric("3+2", 10, 78);
				System.out.println(i.toString());
				System.out.println(i.mark(78));
*/			
			
}
