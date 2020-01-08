package Chapter5;
import java.util.Scanner;
public class PaintCalculator {
  public static void main(String[] args) {
    double length, width, height, totalFeet; 
    int windows, doors;
	double gallonFloor;
	double gallonCeil;
    double gallons;
    double quarts;
    String quartDisplay;
    final int GALLON_SIZE, QUART_SIZE;
    String gallonDisplay;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the room dimensions below");
    System.out.print("Length: ");
    length = input.nextDouble();
    System.out.print("Width: ");
    width = input.nextDouble();
    System.out.print("Height: ");
    height = input.nextDouble();
    System.out.println("");
    System.out.print("How many windows does the room have?: ");
    windows = input.nextInt();
    System.out.print("How many doors does the room have?: ");
    doors = input.nextInt();
    System.out.println("");
    totalFeet = ((2*(length * height)) + (2*(width * height))) - ((windows * 12) + (doors * 21));
    System.out.printf("%-20s%5.2f\n","Total Square feet: " , totalFeet);
    GALLON_SIZE = 300;
    QUART_SIZE = 75;
    gallons = ((double) totalFeet) / GALLON_SIZE;
    gallonCeil = Math.ceil(gallons);
    gallonFloor = Math.floor(gallons);
    if(gallonCeil == 1) {
    	gallonDisplay = "Gallon";
    } else {
    	gallonDisplay = "Gallons";
    }
    System.out.printf("%-20s%-2.0f%s\n","Gallons only: ", Math.ceil(gallons), gallonDisplay);
    if(gallonFloor == 1) {
    	gallonDisplay = "Gallon";
    } else {
    	gallonDisplay = "Gallons";
    }
    quarts =  Math.ceil((totalFeet - (Math.floor(gallons) * GALLON_SIZE)) / QUART_SIZE);
    if(quarts == 4) {
    	gallons += 1;
    	quarts = 0;
    }
    if(quarts == 1) {
    	quartDisplay = " and 1 quart";
    } else if(quarts == 0) {
    	quartDisplay = "";
    } else {
    	quartDisplay = " and " + (int) quarts + " quarts";
    }
    gallonFloor = Math.floor(gallons);
    if(gallonFloor == 1) {
    	gallonDisplay = "Gallon";
    } else {
    	gallonDisplay = "Gallons";
    }
    
    System.out.printf("%-20s%-2.0f%s\n","Gallons and Quarts:", gallonFloor, gallonDisplay + quartDisplay);
    
  }
}