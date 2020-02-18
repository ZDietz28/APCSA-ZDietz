package Chapter8;

//<First Name> <Last Name>
//<Class period>


//Directions:   Fill in the missing variables and methods to create the Store class.
//Their will only be 3 pieces of data for each store: the type of store (pet or grocery), the time the store opens and the time the store closes.
//To simplify the opening and closing times, our stores will only open and close on the hour.   The times will be stored in 24-hour format, so we will not be
//storing am or pm.   For example, 7 am will be stored as 7.   7pm will be stored as 19 (because 12 + 7 = 19).
//If a store has been created, you can assume that the closing time is after the opening time (and no stores are open 24 hours a day).


//When your program is complete:
//Double check that you have filled in your first name, last name and class period
//Upload your program to Canvas

public class Store
{
	String type;
	int openTime;
	int closeTime;
	
	// type of store (String)
	// opening time (int)
	// closing time (int)






	// First constructor: One parameter(store type), opening time set to 10 (10am) and closing time set to 21 (9pm)
	public Store(String _type)
	{
		type = _type;
		openTime = 10;
		closeTime = 21;

	}
	// Second constructor: 3 parameters: store type, opening time and closing time
	public Store(String _type, int _openTime, int _closeTime)
	{
		type = _type;
		openTime = _openTime;
		closeTime = _closeTime;

	}

	// Return the type of store
	public String getType()
	{
		return type;

	}
	// Return the number of hours open.
	// For example, if the store opens at 10 and closes at 18, the number of hours open is 8
	public int getNumHoursOpen()
	{
		return closeTime - openTime;

	}

	// If the store is open at currentTime, return true
	// If the store is not open at currentTime, return false
	public boolean isOpen(int currentTime)
	{
		if(currentTime >= openTime && currentTime < closeTime) {
			return true;
		}
		return false;

	}

	// If newType is Grocery or Pet (not case sensitive), set the type and return true;
	// Otherwise, the type remains unchanged and false is returned.
	public boolean setType(String newType){	
		String _newType = newType.toLowerCase();
		if(_newType.equals("grocery") || _newType.equals("pet")) {
			type = _newType;
			return true;
		}
		return false;

	}
	public boolean setHours(int newOpen, int newClose){
		if(newOpen >= 0 && newOpen <= 23 && newClose > newOpen && newClose <= 23 ) {
			openTime = newOpen;
			closeTime = newClose;
			return true;
		}
		return false;
		
	}

	
	public static String convertTime(int timeToConvert)
	{
		if(timeToConvert >= 12) {
			return (timeToConvert % 12) + "pm";
		}
		return timeToConvert + "am";
	}

	
	public String toString()
	{
		return type + " store is open from " + Store.convertTime(openTime) + " to " + Store.convertTime(closeTime);
	}




}