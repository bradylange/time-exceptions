package time_format_application;

// Importing this library to get user input and exceptions
import java.util.InputMismatchException;
import java.util.Scanner;

import time_format.InvalidHrException;
import time_format.InvalidMinException;
import time_format.InvalidPrdException;
import time_format.InvalidSecException;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: TimeFormatApplication
 * Language: Java
 * Date: 11/8/17
 * Description: This class contains attributes and algorithms that relate to the format of time and the program.
 */

// This class contains a driver method and methods that manipulate time input into a 24 hour time clock
public class TimeFormatApplication
{
	// Instance variables 
    static private Scanner console = new Scanner(System.in);											// Scan for user input
// ------------------- Main Method -------------------
    // Method that compiles and runs the program 
    public static void main(String [] args)
    {
    	// Local variables
        int hours;																						// Hours of the day 1-12 (AM/PM)
        int minutes;																					// Minutes of the day 1-60
        int seconds;																					// Seconds of the day 1-60
        String period;																					// Time period of the day - AM or PM
        
		System.out.println("***************************************** 24 Hour Clock Converter: *******************************************");
		
        // Retrieve user inputs for what time it is in 12 hour clock format 
        hours = getHours();
        minutes = getMinutes();
        seconds = getSeconds();
        period = getPeriod();
        
        System.out.println();
        System.out.print("24 hour clock time: ");
        
        // Call the method that formats the time input into a 24 hour time clock
        print24HourTime(hours, minutes, seconds, period);
		System.out.println("*********************************************************************************************\n");
 
    } 
// ------------------- End Main Method -------------------

// ------------------- Get Hours Method -------------------
    // Method that returns the hour of the day with error checking -- 1 to 12 
    public static int getHours()
    {
    	// Local variables
    	int hour = 1;																					// Hours of the day 1-12 (AM/PM)
    	boolean hrDone = false;																			// Flag to check for no errors
    	String strError;																				// Holds exception input 
    	
    	// Make sure the user enters the correct input
    	do 
    	{
    		try 
    		{
    			// Get user input 
    			System.out.print("Enter the hour: ");
    			hour = console.nextInt();
    			
    			// Exception handling:
    			// Hours cannot be negative 
    			if (hour < 1)
    			{
    				throw new InvalidHrException("Hours cannot be negative.");
    			}
    			// Hours cannot be greater than 12 
    			if (hour > 12)
    			{
    				throw new InvalidHrException("Hours cannot be more than 12.");
    			}
    			
    			// If no exceptions pass this step
    			hrDone = true;
    		} 
    		
    		// Catch blocks:
    		// If the input is not an Integer 
    		catch (InputMismatchException ime) 
    		{
    			 strError = console.next();
    			 System.out.println("Exception: " + ime.toString() + " " + strError);
    		} 
    		// If the input is not in 12 hour time format 
    		catch (InvalidHrException ihe) 
    		{
    			System.out.println("Exception: " + ihe.toString());
    		}
    		
		} while (!hrDone);
    	
    	return hour;																					// Return the hour 
    } 
// ------------------- End Get Hours Method -------------------
    
// ------------------- Get Minutes Method -------------------
    // Method returns the minutes of the current hour with error checking -- 1 to 59
    public static int getMinutes()
    {
    	// Local variables
    	int minutes = 1;																				// Minutes of the day 1-59
    	boolean minDone = false;																		// Flag to check for no errors
    	String strError;																				// Holds exception input 
    	
    	// Make sure the user enters the correct input
    	do 
    	{
    		try 
    		{
    			// Get user input 
    			System.out.print("Enter minutes: ");
    			minutes = console.nextInt();
    			
    			// Exception handling:
    			// Minutes cannot be negative 
    			if (minutes < 1)
    			{
    				throw new InvalidMinException("Minutes cannot be negative.");
    			}
    			// Minutes cannot be greater than 59
    			if (minutes > 59)
    			{
    				throw new InvalidMinException("Minutes cannot be more than 59.");
    			}
    			
    			// If no exceptions pass this step
    			minDone = true;
    		} 
    		
    		// Catch blocks:
    		// If the users input is not an Integer 
    		catch (InputMismatchException ime) 
    		{
    			strError = console.next();
    			System.out.println("Exception: " + ime.toString() + " " + strError);
    		}
    		// If the users input is not a Integer from 1 to 59
    		catch (InvalidMinException imine) 
    		{
    			System.out.println("Exception: " + imine.toString());
    		}
    	} while (!minDone); 
    	
    	return minutes;																					// Return the minutes 
    } 
// ------------------- End Get Minutes Method -------------------
    
// ------------------- Get Seconds Method -------------------
    // Method that returns the seconds of the minute with error checking -- 1 to 59
    public static int getSeconds()
    {
    	// Local variables
    	int seconds = 1;																				// Seconds of the day 1-59
    	boolean secDone = false;																		// Flag to check for no errors
    	String strError;																				// Holds exception input
    		
    	// Make sure the user enters the correct input
    	do 
    	{
    		try 
    		{
    			// Get user input 
    			System.out.print("Enter seconds: ");
    			seconds = console.nextInt();
    			
    			// Exception handling:
    			// Seconds cannot be negative 
    			if (seconds < 1)
    			{
    				throw new InvalidSecException("Seconds cannot be negative.");
    			}
    			// Seconds cannot exceed 59
    			if (seconds > 59)
    			{
    				throw new InvalidSecException("Seconds cannot be more than 59.");
    			}
    			
    			// If no exceptions pass this step 
    			secDone = true;
    		} 
    		
    		// Catch blocks:
    		// If the user input is not an Integer 
    		catch (InputMismatchException ime) 
    		{
    			strError = console.next();
    			System.out.println("Exception: " + ime.toString() + " " + strError);
    		} 
    		// If the users input is not an Integer from 1 to 60
    		catch (InvalidSecException ise) 
    		{
    			System.out.println("Exception: " + ise.toString());
    		}
    	} while (!secDone); 
    	
    	return seconds;																					// Return the seconds 
    }
// ------------------- End Get Seconds Method -------------------
    
// ------------------- Get Period Method -------------------
    // Method that gets the period of day with error checking -- AM or PM
    public static String getPeriod()
    {
    	// Local variables
    	String period = "";																				// The period of the day AM or PM									
    	boolean perDone = false;																		// Flag to check for no errors 	
    	String strError; 																				// Holds exception input
    	
    	// Make sure the user enters the correct input
    	do 
    	{
    		try 
    		{
    			// Get user input 
    			System.out.print("Enter time period: ");
    			period = console.next();
    			
    			// Exception handling:
    			// Time period has to be either PM or AM
    			if (!period.equalsIgnoreCase("pm") && !period.equalsIgnoreCase("am"))
    			{
    				throw new InvalidPrdException();
    			}
    			
    			// If no exceptions pass this step
				perDone = true;
    		} 

    		// Catch blocks:
    		// If the users input is not an Integer 
    		catch (InputMismatchException ime) 
    		{
    			strError = console.next();
    			System.out.println("Exception: " + ime.toString() + " " + strError);
    		} 
    		// If the users input is not AM or PM 
    		catch (InvalidPrdException ipe) 
    		{
    			System.out.println("Exception: " + ipe.toString());
    		}
    		
    	} while (!perDone); 
    	
    	return period;																					// Return the period
    } 
// ------------------- End Get Period Method -------------------
    
// ------------------- Print Twenty-Four Hour Time Method -------------------
    // Method that formats a 12 hour time input into a 24 hour time format 
    public static void print24HourTime(int hours, int minutes, int seconds, String period)
    {
    	// Local variables 
    	int hourFormat = 12;																			// Formats the hour to the correct hour based upon the period

    	if (period.equalsIgnoreCase("pm"))																// Hours from 12 to 24 (PM)
    	{
    		if (hours == 12)																			// Hours equals 12, don't add 12 hours to the time 
    		{
    			System.out.println(hours + ":" + minutes + ":" + seconds + " " + period);
    		}
    		else 																						// Add 12 hours to the hour to format it to 24 hour format 
    		{
				hours += hourFormat; 
				System.out.println(hours + ":" + minutes + ":" + seconds + " " + period);
    		}
    	}
	
    	if (period.equalsIgnoreCase("am"))																// Hours from 0 to 11 (AM)
    	{
    		if(hours == 12)																				// If the time is 12 AM minus 12 hours because in 24 hour format it is 0:00 (HR:MINS)
    		{
    			hours -= hourFormat;
    			System.out.println(hours + ":" + minutes + ":" + seconds + " " + period);
    		}
    		else																						// Hours is anything but 12 
    		{
    			System.out.println(hours + ":" + minutes + ":" + seconds + " " + period);
    		}
    	}
    } 
// ------------------- End Print Twenty-Four Time Method -------------------
} // End of class TimeFormatApplication
