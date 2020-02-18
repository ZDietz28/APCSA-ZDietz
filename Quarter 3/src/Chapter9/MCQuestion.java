package Chapter9;

public class MCQuestion extends Question{
	String answerA;
	String answerB;
	String answerC;
	String answerD;
	char answer;
	public MCQuestion(String q, String _answerA, String _answerB, String _answerC, String _answerD, char _answer) {
		super(q);
		answerA = _answerA;
		answerB = _answerB;
		answerC = _answerC;
		answerD = _answerD;
		answer = _answer;
	}
	
}
