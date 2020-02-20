package Chapter9;
import java.util.Scanner;
public class TrueFalseQuestion extends Question{
	boolean answer;
	boolean answerResponse;
	
	public TrueFalseQuestion(String q, double pV, boolean _answer) {
		super(q, pV);
		answer = _answer;
	}
	
	private boolean convertAnswer() {
		if(response.equals("true")) {
			answerResponse = true;
			return true;
		}else if(response.equals("false")) {
			answerResponse = false;
			return true;
		}
		return false;
	}
	public boolean checkAnswer() {
		if(convertAnswer()) {
			if(answerResponse == answer) {
				return true;
			}
			return false;
		}
		System.out.println("Please answer only true or false");
		return false;
	}
	public String toString() {
		return question + "(" + pointValue + " points)" + " true or false?: ";
	}
}
