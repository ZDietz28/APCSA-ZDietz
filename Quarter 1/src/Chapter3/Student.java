package Chapter3;

public class Student {
	public String name; 
	public int quizzesTaken;
	public double quizScores, quizTotals;
	
	public Student(String name) {
		this.name = name;
		this.quizScores = 0;
		this.quizTotals = 0;
	}
	public void addQuiz(double quizScore, double quizTotal) {
		this.quizScores += quizScore;
		this.quizTotals += quizTotal;
	}
	public String getScores() {
		return quizScores + " out of " + quizTotals;
	}
	public String getAverageScores() {
		double averageScore;
		averageScore = (quizScores / quizTotals);
		averageScore *= 100;
		return averageScore + "%";
	}
}
