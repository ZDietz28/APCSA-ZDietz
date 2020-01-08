package Chapter3;

public class Balloon {
	double radius;
	public Balloon() {
		this.radius = 0.0;
	}
	public Balloon(double radius) {
		this.radius = radius;
	}
	void inflate(double radius) {
		this.radius += radius;
	}
	void deflate(double radius) {
		this.radius -= radius;
	}
	public double getVolume() {
		return ((double) 4/3)*Math.PI*(Math.pow((this.radius),3));
	}
}
