package time_format;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: InvalidPrdException
 * Language: Java
 * Date: 11/8/17
 * Description: This class is used to display a message to the user to detail of their period format error.
 */

// This class contains a method that details the user on their given error and is an exception
@SuppressWarnings("serial")
public class InvalidPrdException extends Exception 										// Is an Exception 
{
// ------------------- Default Constructor -------------------
	// Default Constructor that displays a message to the user notifying them of their error of incorrect period 
	public InvalidPrdException()
	{
		super("Period must be either 'AM' or 'PM'.");									// Exception message
	}
// ------------------- End Default Constructor -------------------
} // End of class InvalidPrdException
