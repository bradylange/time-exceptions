package time_format;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: InvalidMinException
 * Language: Java
 * Date: 11/8/17
 * Description: This class is used to display a message to the user to detail of their minute format error.
 */

// This class contains a method that details the user on their given error and is an exception
@SuppressWarnings("serial")
public class InvalidMinException extends Exception 									// Is an Exception
{
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor that displays a message to the user notifying them of their error of incorrect minute format
	public InvalidMinException(String str)
	{
		super("Minutes must be 1 to 59. " + str);									// Exception message
	}
// ------------------- End Alternate Constructor -------------------
} // End of class InvalidMinException 
