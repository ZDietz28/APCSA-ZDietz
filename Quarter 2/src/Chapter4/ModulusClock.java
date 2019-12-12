package Chapter4;
import java.util.Scanner;
public class ModulusClock {

	public static void main(String[] args) {
		/* 
		 Prompt the user for the hour of the start time.
		Prompt for the minutes of the start time.
		Prompt for the number of hours later
		Prompt for the number of minutes later.
		Calculate the future time.
		 */
		Scanner input = new Scanner(System.in);
		int hour, minute;
		final int MINUTES = 60;
		final int HOURS = 12;
		System.out.printf("%s", "What is the start hour? ");
		hour = input.nextInt();
		System.out.printf("%s", "What is the start minute? ");
		minute = input.nextInt();
		
		System.out.printf("%s%02d\n", "Current time is " + hour + ":", minute);
		System.out.printf("%s",  "How many hours later? ");
		hour += input.nextInt();
		hour = hour % HOURS;
		System.out.printf("%s", "How many minutes later? ");
		minute += input.nextInt();
		hour += (minute / MINUTES);
		minute = minute % MINUTES;
		if (hour == 0) {
			hour = HOURS;
		}
		System.out.printf("%s%02d\n", "Current time is " + hour + ":", minute);
	}

}
