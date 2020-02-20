package Chapter9;
import java.util.Scanner;
public class Question {
	String question;
	String response;
	double pointValue;
	public Question(String q, double pV) {
		question = q;
		pointValue = pV;
	}
	public String getQuestion() {
		return question;
	}
	public String getResponse(Scanner inScanner) {
		response = inScanner.next();
		return response;
	}
	public void setAnswer(String answer) {
		answer = response;
	}
}
