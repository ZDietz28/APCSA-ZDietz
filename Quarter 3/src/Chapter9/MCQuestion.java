package Chapter9;
import java.util.Scanner;
public class MCQuestion extends Question{
	String answerA;
	String answerB;
	String answerC;
	String answerD;
	String availableAnswers = "a b c d";
	double pointValue;
	char answer;
	char answerResponse;
	public MCQuestion(String q, double pV, String _answerA, String _answerB, String _answerC, String _answerD, char _answer, double _pointValue) {
		super(q, pV);
		answerA = _answerA;
		answerB = _answerB;
		answerC = _answerC;
		answerD = _answerD;
		answer = _answer;
		pointValue = _pointValue;
	}
	
	private boolean convertAnswer() {
		if(response.length() == 1) {
			answerResponse = response.charAt(0);
			return true;
		}
		return false;
	}
	public boolean checkAnswer() {
		if(convertAnswer()) {
			if(answerResponse == answer) {
				return true;
			}
		} else {
			System.out.println("only put 'a', 'b', 'c' or 'd'");
		}
		return false;
	}
	public String toString() {
		return question + "(" + pointValue + " points)" + "\na) " + answerA + "\nb) " + answerB + "\nc) " + answerC + "\nd) " + answerD + "\n"; 
	}
}
