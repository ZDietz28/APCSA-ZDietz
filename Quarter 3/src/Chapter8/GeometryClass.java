package Chapter8;

public class GeometryClass {

	public static double cubeVolume(double h) {
		return h*h*h;
	}
	public static double cubeSurface(double h) {
		return (h*h)*6;
	}
	public static double cylinderVolume(double r, double h) {
		return (Math.PI*(Math.pow(r, 2))*h);
	}
	public static double cylinderSurface(double r, double h) {
		return (((2 * Math.PI) * r) * h) + (((2  * Math.PI) * (Math.pow(r,2))));
	}
}
