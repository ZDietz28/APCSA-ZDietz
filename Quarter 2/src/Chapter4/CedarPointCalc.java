package Chapter4;
import java.util.Scanner;

public class CedarPointCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Defining all magic numbers
		final double TICKET_PRICE_SPRING = 36.00;
		final double TICKET_PRICE_FALL = 32.00;
		final double SCHOOL_BUS_COST = 1300.42;
		final double CHARTER_BUS_COST = 1738.92;
		final double FOOD_COST = 25.00;
		final int STUDENTS_PER_CHARTER = 56;
		final int STUDENTS_PER_SCHOOL = 45;
		final int STUDENTS_PER_FREE = 16;
		//Start with empty Variables
		int students, chaperones, charterBuses, schoolBuses, tickets;
		System.out.printf("%s", "How many students are going? ");
		students = input.nextInt();
		chaperones = students/4;
		System.out.printf("%d%s\n", chaperones, " chaperones are needed");
		charterBuses = 1;
		schoolBuses = 1;
		charterBuses += ((students+chaperones)/STUDENTS_PER_CHARTER);
		schoolBuses += ((students+chaperones)/STUDENTS_PER_SCHOOL);
		tickets = (students + chaperones)-((students + chaperones)/STUDENTS_PER_FREE);
		System.out.printf("%s%8.2f%s%d%s\n", "The cost for tickets will be $", (tickets * TICKET_PRICE_SPRING), " for ", tickets, " spring tickets");
		System.out.printf("%s%8.2f%s%d%s\n", "The cost for tickets will be $", (tickets * TICKET_PRICE_FALL), " for ", tickets, " fall tickets");
		System.out.printf("%s%8.2f%s%d%s\n","The school bus cost will be $", (schoolBuses * SCHOOL_BUS_COST), " for ", schoolBuses, " buses");
		System.out.printf("%s%8.2f%s%d%s\n","The charter bus cost will be $", (charterBuses * CHARTER_BUS_COST), " for ", charterBuses, " buses");
		System.out.printf("%s%8.2f\n", "The food cost will be $", (FOOD_COST * (students + chaperones)));
		System.out.printf("%s\n", "-------------------------");
		System.out.printf("%-17s%s%8.2f\n", "Spring Tickets", "", (tickets * TICKET_PRICE_SPRING));
		System.out.printf("%-17s%s%8.2f\n", "School Buses", "", (schoolBuses * SCHOOL_BUS_COST));
		System.out.printf("%-15s%s%8.2f\n", "Food", "+ ", (FOOD_COST * (students + chaperones)));
		System.out.printf("%-15s%s%8.2f\n", "Total", "= ", ((tickets * TICKET_PRICE_SPRING) + (schoolBuses * SCHOOL_BUS_COST) + (FOOD_COST * (students + chaperones))));
		System.out.printf("%22s\n", "-------------------------");
		System.out.printf("%-17s%s%8.2f\n", "Spring Tickets", "", (tickets * TICKET_PRICE_SPRING));
		System.out.printf("%-17s%s%8.2f\n", "Charter Buses", "", (charterBuses * CHARTER_BUS_COST));
		System.out.printf("%-15s%s%8.2f\n", "Food", "+ ", (FOOD_COST * (students + chaperones)));
		System.out.printf("%-15s%s%8.2f\n", "Total", "= ", ((tickets * TICKET_PRICE_SPRING) + (charterBuses * CHARTER_BUS_COST) + (FOOD_COST * (students + chaperones))));
		System.out.printf("%22s\n", "-------------------------");
		System.out.printf("%-17s%s%8.2f\n", "Fall Tickets", "", (tickets * TICKET_PRICE_FALL));
		System.out.printf("%-17s%s%8.2f\n", "Charter Buses", "", (charterBuses * CHARTER_BUS_COST));
		System.out.printf("%-15s%s%8.2f\n", "Food", "+ ", (FOOD_COST * (students + chaperones)));
		System.out.printf("%-15s%s%8.2f\n", "Total", "= ",  ((tickets * TICKET_PRICE_FALL) + (charterBuses * CHARTER_BUS_COST) + (FOOD_COST * (students + chaperones))));
		System.out.printf("%22s\n", "-------------------------");
		System.out.printf("%-17s%s%8.2f\n", "Fall Tickets", "", (tickets * TICKET_PRICE_FALL));
		System.out.printf("%-17s%s%8.2f\n", "School Buses", "", (schoolBuses * SCHOOL_BUS_COST));
		System.out.printf("%-15s%s%8.2f\n", "Food", "+ ", (FOOD_COST * (students + chaperones)));
		System.out.printf("%-15s%s%8.2f\n", "Total", "= ",  ((tickets * TICKET_PRICE_FALL) + (schoolBuses * SCHOOL_BUS_COST) + (FOOD_COST * (students + chaperones))));
		System.out.printf("%22s\n", "-------------------------");
		
	}

}
