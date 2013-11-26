package q1;

import java.util.Scanner;

/**
 * <p> This is an application that reads a double value representing
 * a monetary amount. Then determine the fewest number of each 
 * bill and coin needed to represent that amount, 
 * starting with the highest to the lowest (except loonie).</p>
 * 
 * @author Seungpyo Hong
 * @version 1.0
 */
public class Change {
    /**<p>Static variable for the correct number of pennies in the output.</p>*/
    public static final int CONVERSION = 100;
    /**<p>Static variable represents the value of ten dollars bill.</p>*/
    public static final int TEN_VALUE = 10 * CONVERSION;
    /**<p>Static variable represents the value of five dollars bill.</p>*/
    public static final int FIVE_VALUE = 5 * CONVERSION;
    /**<p>Static variable represents the value of two dollars coin.</p>*/
    public static final int TOONIE_VALUE = 2 * CONVERSION;
    /**<p>Static variable represents the value of 25 cents coin.</p>*/
    public static final double QUARTER_VALUE = 0.25 * CONVERSION;
    /**<p>Static variable represents the value of 10 cents coin.</p>*/
    public static final double DIME_VALUE = 0.10 * CONVERSION;
    /**<p>Static variable represents the value of 5 cents coin.</p>*/
    public static final double NICKLE_VALUE = 0.05 * CONVERSION;
    /**<p>Static variable represents the value of 1 cent coin.</p>*/
    public static final double PENNY_VALUE = 0.01 * CONVERSION;


    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // your code will go here!!!

        double monetaryAmount;
        int tenBill;
        int fiveBill;
        int toonies;
        int quarters;
        int dimes;
        int nickles;
        int pennies;
        // What is left after converting the monetary amount
        double remainder;

        Scanner scan = new Scanner(System.in);


        // Prompt for the user to enter the monetary amount
        System.out.print("Enter the amount of money: ");
        monetaryAmount = scan.nextDouble() * CONVERSION;

        // Calculates how many ten dollar bills are needed
        tenBill =  (int) (monetaryAmount / TEN_VALUE);
        remainder = monetaryAmount - TEN_VALUE * tenBill;

        // Calculates how many five dollar bills are needed
        fiveBill =  (int) (remainder / FIVE_VALUE);
        remainder = remainder - FIVE_VALUE * fiveBill;

        // Calculates how many two dollar coins are needed
        toonies = (int) (remainder / TOONIE_VALUE);
        remainder = remainder - TOONIE_VALUE * toonies;

        // Calculates how many ten twenty-five cent coins are needed
        quarters = (int) (remainder / QUARTER_VALUE);
        remainder = remainder - QUARTER_VALUE * quarters;

        // Calculates how many ten cent coins are needed
        dimes = (int) (remainder / DIME_VALUE);
        remainder = remainder - DIME_VALUE * dimes;

        // Calculates how many five cent coins are needed
        nickles = (int) (remainder / NICKLE_VALUE);
        remainder = remainder - NICKLE_VALUE * nickles;

        // Calculates how many one cent coins are needed
        pennies = (int) (remainder / PENNY_VALUE);


        System.out.println(tenBill + " ten dollar bills" + "\n"
                + fiveBill + " five dollar bills" + "\n" 
                + toonies + " two dollar coins" + "\n"
                + quarters + " quarters" + "\n"
                + dimes + " dimes" + "\n"
                + nickles + " nickles" + "\n"
                + pennies + " pennies" + "\n");

        System.out.println("Question one was called and ran sucessfully.");

        scan.close();
    }

};
