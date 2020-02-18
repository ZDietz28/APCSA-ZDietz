package Chapter9;

public class Dog
{
	private String breed;
	public String name;

	public Dog(String br, String nm)
	{
		name = nm;
		breed = br;
		
	}

	public Dog(String br)
	{
		breed = br;
		name = "";
	}

	public String getBreed()
	{
		return breed;
	}

	public String getName()
	{
		return name;
	}

	public String toString()
	{
		String output = "Breed: " + getBreed();
		output += "\nName: " + getName();
		return output;
	}
}
