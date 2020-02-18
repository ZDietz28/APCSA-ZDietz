package Chapter9;

public class DogTester
{
	public static void main(String[] args)
	{
		// create Dog object
		Dog d = new Dog("Collie","Bella");
		System.out.println(d.toString());
		System.out.println();
		WorkDog d2 = new WorkDog("Husky", "Sled Dog", false, "Jenny");
		System.out.println(d2.toString());
		System.out.println();
		d2.setWork("Military Dog");
		d2.trainToFight();
		System.out.println(d2.toString());
	}
}