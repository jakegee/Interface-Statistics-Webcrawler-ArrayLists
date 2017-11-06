/**
 * @author Jacob Smith
 * A program to give marks based on a question
 */
public class ExamQuestion {

	private String questionText;
	private int maximalMark;
	
	public ExamQuestion(String questionText, int maximalMark) { // Constructor with question text and marks
		this.questionText = questionText;
		this.maximalMark = maximalMark;
	}

	public String getQuestionText() { // getter for questionText
		return questionText;
	}
	public void setQuestionText(String questionText) { // setter for questionText
		this.questionText = questionText;
	}
	
	public int getMaximalMark() { // getter for maximalMark
		return maximalMark;
	}
	public void setMaximalMark(int maximalMark) { // setter for maximalMark
		this.maximalMark = maximalMark;
	}
	
	public String toString() { // toString to reflect marks for the question text
		return "Question (maximal mark: " + maximalMark + "): " + questionText; 		
	}
}

