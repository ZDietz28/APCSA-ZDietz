package Chapter2;
import java.time.LocalDate;
public class Project9 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate piDay = LocalDate.of(today.getYear(), 3, 14);
		LocalDate programmerDay = LocalDate.ofYearDay(today.getYear(),256);
		LocalDate tenK = today.minusDays(10000);
		System.out.println("Pi day is " + piDay.getDayOfWeek() + " " + piDay);
		System.out.println("Programmer day is " + programmerDay.getDayOfWeek() + " " + programmerDay);
		System.out.println("10000 days in the past is " + tenK.getDayOfWeek() + " " + tenK);
	}

}
