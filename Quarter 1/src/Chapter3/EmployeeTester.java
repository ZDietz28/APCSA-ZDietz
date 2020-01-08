package Chapter3;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee harry = new Employee("Harry Hacker", 50000);
		System.out.println(harry.getSalary());
		harry.raiseSalary(10);
		System.out.println(harry.getName());
		System.out.println(harry.getSalary());
	}

}
