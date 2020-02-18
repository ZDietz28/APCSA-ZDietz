package Chapter9;

public class WorkDog extends Dog{
	String typeOfWork;
	boolean attack;
	public WorkDog(String br, String work, boolean fight, String nm) {
		super(br, nm);
		typeOfWork = work;
		attack = fight;
	}
	public WorkDog(String br, String work) {
		super(br);
		typeOfWork = work;
	}
	public String getWork() {
		return typeOfWork;
	}
	public boolean isFighter() {
		return attack;
	}
	public void setWork(String work) {
		typeOfWork = work;
	}
	public void trainToFight() {
		attack = true;
	}
	public String toString() {
		String output = "Breed: " + getBreed();
		output += "\nName: " + getName();
		output += "\nType of Work: " + getWork();
		if(isFighter()) {
			output += "\n" + getName() + " knows how to fight ";
		} else {
			output += "\n" + getName() + " does not know how to fight ";
		}
		return output;
	}
}
