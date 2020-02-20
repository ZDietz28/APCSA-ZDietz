package Chapter9;
import java.util.Scanner;
public class QuestionTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double points = 0.0;
		MCQuestion question1 = new MCQuestion("What day of the week is it? ", 7.5,  "Monday", "Tuesday", "Wednesday", "Thursday", 'd', 7.5);
		TrueFalseQuestion question2 = new TrueFalseQuestion("Does Ronit have hair? ", 0.5, true);
		System.out.print(question1.toString());
		String responser = question1.getResponse(input);
		question1.setAnswer(responser);
		if(question1.checkAnswer()) {
			System.out.println("Correct!");
			points += question1.pointValue;
		} else {
			System.out.println("Incorrect!");
		}
		System.out.print(question2.toString());
		responser = question2.getResponse(input);
		question2.setAnswer(responser);
		if(question2.checkAnswer()) {
			System.out.println("Correct!");
			points += question2.pointValue;
		}else {
			System.out.println("Incorrect!");
		}
		System.out.println(points + " points");
	}

}
