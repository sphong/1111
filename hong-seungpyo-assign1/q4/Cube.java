package q4;

import java.util.Scanner;

/**
 * <p>This is an application that reads from the user an integer representing
 * the length of a cube's side, then using that integer,  prints the cube's
 * volume and surface area.</p>
 * @author Seungpyo Hong
 * @version 1.0
 */
public class Cube {
    /**<p>Static variable that represents the number of sides in a cube.</p>*/
    public static final int NUM_OF_SIDES = 6;

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        int cubeSide;
        double volume;
        double surfaceArea;

        Scanner scan = new Scanner(System.in);

        // Prompt for the user
        System.out.print("Enter the length of a cube's side: ");
        cubeSide = scan.nextInt();

        // Volume of the cube
        volume = cubeSide * cubeSide * cubeSide;
        System.out.println("\n" + "Volume of the cube is: " + volume);

        // Surface area of the cube
        surfaceArea = cubeSide * cubeSide * NUM_OF_SIDES;
        System.out.println("Surface area of the cube is: "
                + surfaceArea + "\n");

        System.out.println("Question four was called and ran sucessfully.");

        scan.close();
    }

};
