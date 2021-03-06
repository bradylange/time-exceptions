package time_format;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: InvalidHrException
 * Language: Java
 * Date: 11/8/17
 * Description: This class is used to display a message to the user to detail of their hour format error.
 */

// This class contains a method that details the user on their given error and is an exception
@SuppressWarnings("serial")
public class InvalidHrException extends Exception 											// Is an Exception 
{
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor that displays a message to the user notifying them of their error of incorrect hour format
	public InvalidHrException(String str)
	{
		super("Hours can only be from 1 to 12. (12 hour clock format) " + str);				// Exception message
	}
// ------------------- End Alternate Constructor -------------------
} // End of class InvalidHrException
