import java.util.*;
/**
 * @author Jacob Smith
 * A program with more than one answer utilising inheritance
 */
public class ExamQuestionSimpleChoice<possibleAnswers> extends ExamQuestion { // Inherits class Examquestion

	private  ArrayList<String> possibleAnswers;
	private int correctAnswer;
	


	public ExamQuestionSimpleChoice(String questionText, int maximalMark, ArrayList<String> possibleAnswers,
			int correctAnswer) { // Constructor that calls class ExamQuestion
		super(questionText, maximalMark);
		this.possibleAnswers = possibleAnswers;
		this.correctAnswer = correctAnswer;
	}

	public int mark(int value) { // method for when the value is the correctAnswer
	if  (correctAnswer == value) {
		return getMaximalMark(); // returns maximalMark when it is the correctAnswer
	}
	else{return 0;} // Else you get a 0
	}
	
	@Override
	public String toString() { // toString method that calls ExamQuestion and includes possibleAnswers
	return super.toString() + " The answer is " + possibleAnswers;
	}
	
}
