package Chapter8;

public class Coin {
	//These are constants that are provided for your use.  For example, using the constant "TAILS" is the same as typing a 1.
	private final static int HEADS = 0;
	private final static int TAILS = 1;
	private final static int UNKNOWN = -1;

	//ADD: private instance variables, type (String), year (int), face (int)
	private String type;
	private int year;
	private int face;

	// ADD: set type and year to parameters, set face equal to UNKNOWN
	public Coin(String _type, int _year)
	{
		type = _type;
		year = _year;
	}

	//ADD: set type, year and face to parameters
	public Coin(String _type, int _year, int _face)
	{
		type = _type;
		year = _year;
		face = _face;
	}

	// ADD: return the value of variable type
	public String getType()
	{
		return type;
	}

	// ADD: if the year is between 1850 and 2015 (inclusive) set the year and retrn true.
	// Otherwise, just return false
	public boolean setYear(int _year)
	{
		if(_year > 1850 && _year < 2015) {
			return true;
		} else {
			return false;
		}
	}

	// ADD: return the value of the coin.  (.25 for a quarter, .10 for a dime, etc.)
	// Precondition: type will have a valid value of "quarter", "dime", "nickel" or "penny"
	public double getValue()
	{
		if(type.equals("quarter") || type.equals("dime") || type.equals("nickel") || type.equals("penny")) {
			if(type.equals("quarter")) {
				return .25;
			} else if(type.equals("dime")) {
				return .10;
			} else if(type.equals("nickel")) {
				return .05;
			} else if(type.equals("penny")) {
				return .01;
			}
		}
		return .00;
	}

	// ADD: return the year
	public int getYear()
	{
		return year;
	}

	// ADD: return the string "heads", "tails" or "unknown"
	public String getFace(int _face)
	{
		if(_face == 0) {
			return "heads";
		} else {
			return "tails";
		}

	}

	//ADD: Use Math.random to produce a random int (0 for heads, 1 for tails).  Set face equal to the value and then use the getFace method to return "heads" or "tails"
	//To call the getFace method, the code is simply:   getFace()
	public String flip()
	{
		double rando = Math.random();
		if(rando > 0 && rando <= 0.5) {
			return getFace(0);
		} else {
			return getFace(1);
		}
	}


	// ADD: return the year and type of coin.   For example: 1985 quarter
	public String toString()
	{
		return year + type;
	}
}
