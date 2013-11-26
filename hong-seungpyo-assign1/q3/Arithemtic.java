package q3;

import java.util.Scanner;

/**
 * <p> an application that reads two floating point numbers and prints
 * their sum, difference, quotient, and product.</p>
 * 
 * @author Seungpyo Hong
 * @version 1.0
 */
public class Arithemtic {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        float num1;
        float num2;
        double sum;
        double difference;
        int quotient;
        double product;

        Scanner scan = new Scanner(System.in);

        // Prompt for the user to enter the first number
        System.out.print("Enter a number: ");
        num1 = scan.nextFloat();

        // Prompt for the user to enter the second number
        System.out.print("Enter another number: ");
        num2 = scan.nextFloat();

        // Sum of the two numbers
        sum = num1 + num2;
        System.out.println("\n" + "Sum of the two numbers: " + sum);

        // Difference of the two numbers
        difference = Math.abs(num1 - num2);
        System.out.println("Difference of the two numbers: " + difference);

        // Quotient of the two numbers
        quotient = (int) (num1 / num2);
        System.out.println("Quotient of the two numbers: " + quotient);

        // Product of the two numbers
        product = num1 * num2;
        System.out.println("Product of the two numbers: " + product + "\n");

        System.out.println("Question three was called and ran sucessfully.");

        scan.close();
    }

};
