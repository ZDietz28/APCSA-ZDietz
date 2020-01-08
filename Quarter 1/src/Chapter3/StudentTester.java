package Chapter3;

public class StudentTester {

	public static void main(String[] args) {
		Student jerry = new Student("Jerry");
		jerry.addQuiz(15, 16);
		System.out.println(jerry.getScores());
		jerry.addQuiz(20, 23);
		System.out.println(jerry.getScores());
		System.out.println(jerry.getAverageScores());
	}

}
