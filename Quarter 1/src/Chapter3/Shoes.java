package Chapter3;

public class Shoes {
	String color;
	String brand;
	String type;
	double size;
	
	public Shoes(String colorInput, String brandInput, String typeInput, double sizeInput) {
		this.color = colorInput;
		this.brand = brandInput;
		this.type = typeInput;
		this.size = sizeInput;
	}
	public Shoes() {
	}
	void setColor(String colorInput) {
			this.color = colorInput;
	}
	void setBrand(String brandInput) {
		this.brand = brandInput;
	}
	void setType(String typeInput) {
		this.type = typeInput;
	}
	void setSize(double sizeInput) {
		this.size = sizeInput;
	}
	public String toString() {
		return "Your shoes are a " + type + " type that are size " + size + " " + color + " " + brand + "'s "; 
	}
	
}
