package q2;

import java.util.Scanner;

/**
 * <p>This is an application that reads an integer number from the user,
 * value in seconds. Convert the seconds into hours, minutes and seconds
 * in the format hh:mm:ss.</p>
 * 
 * @author Seungpyo Hong
 * @version 1.0
 */
public class SecondsConvert {
    /**<p>Static variable that shows how many seconds are in one hour.</p>*/
    public static final int HOUR_IN_SECONDS = 3600;
    /**<p>Static variable that shows how many seconds are in one minute.</p>*/
    public static final int MINUTE_IN_SECONDS = 60;

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        int integer;
        // remaining seconds after being used up by hours and minutes
        int remainder;
        int hour;
        int minute;
        int second; 

        Scanner scan = new Scanner(System.in);
        
        // Prompt for the user
        System.out.print("Enter an integer number (value in seconds): ");
        integer = scan.nextInt();

        // Calculates how many hours in the seconds
        hour = integer / HOUR_IN_SECONDS;
        remainder = integer % HOUR_IN_SECONDS;

        // Calculates how many minutes in the remaining seconds
        minute = remainder / MINUTE_IN_SECONDS;
        remainder = remainder % MINUTE_IN_SECONDS;

        // Calculates how many seconds in the remaining seconds
        second = remainder;


        System.out.println("Your integer number converted to hh:mm:ss format: " 
                + hour + ":" + minute + ":" + second + "\n");

        System.out.println("Question two was called and ran sucessfully.");

        scan.close();
    }

};
