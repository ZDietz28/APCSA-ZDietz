package Chapter8;
import java.util.Scanner;
public class GeometryTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Height?: ");
		double height = input.nextDouble();
		System.out.print("Radius?: ");
		double radius = input.nextDouble();
		System.out.printf("%-20s%4.2f\n", "Cube Volume: ", GeometryClass.cubeVolume(height));
		System.out.printf("%-20s%4.2f\n", "Cube Surface: ", GeometryClass.cubeSurface(height));
		System.out.printf("%-20s%4.2f\n", "Cylinder Volume: ", GeometryClass.cylinderVolume(radius,height));
		System.out.printf("%-19s%4.2f", "Cylinder Surface: ", GeometryClass.cylinderSurface(radius,height));
		
	}

}
