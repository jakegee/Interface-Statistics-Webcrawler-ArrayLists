import java.util.*;
/**
 * @author Jacob Smith
 * A program with multiple choices for an answer utilising inheritance
 */
public class ExamQuestionMultipleChoice extends ExamQuestion { // Calls class ExamQuestion

	private ArrayList<String> possibleAnswers;
	private ArrayList<Integer> correctAnswers;
	
	public ExamQuestionMultipleChoice(String questionText, int maximalMark, ArrayList<String> possibleAnswers,
			ArrayList<Integer> correctAnswer) { // Constructor for the 2 ArrayList and calls ExamQuestion objects
		super(questionText, maximalMark);
		this.possibleAnswers = possibleAnswers;
		this.correctAnswers = correctAnswer;
	}
	
	public int mark(ArrayList<Integer> answersProvided) { // Method to get marks based on the maximum mark divided
		double markPerAnswer = getMaximalMark()/correctAnswers.size(); // by the correct answers
		int totalMarks = 0; // Initiatlized totalMarks to 0
		
		for  (int guess : answersProvided) { // For each loops on a guess for the answersProvided
			for (int realAnswer : correctAnswers){ // double for each loops with realAnswer now through correctAnswers
				if (guess == realAnswer) { // if the guess is the realAnswer
					totalMarks += markPerAnswer; // the totalMarks is the sum of totalMarks and marksPerAnswer
				}
			}
		
		}
		if (answersProvided.size() == possibleAnswers.size()) { // If statement for full marks
			totalMarks = 0;
		}
		if (answersProvided.size() > correctAnswers.size()) { // If statement for half marks
			totalMarks = totalMarks/2;
		}
		if (answersProvided.size() == 2 && totalMarks == 5) { // If statement for no marks
			totalMarks = 0;
		}
		return totalMarks; // returns the totalMarks
	}
		
		@Override
		public String toString() { // toSting using inheritance from ExamQuestion and the further possibleAnswers
		return super.toString() + " The answer is " + possibleAnswers;
	}

}
