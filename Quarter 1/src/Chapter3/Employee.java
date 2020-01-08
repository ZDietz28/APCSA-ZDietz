package Chapter3;

public class Employee {
	String name; 
	double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void raiseSalary(double byPercent) {
		salary *= ((byPercent/100)+1);
	}
}
