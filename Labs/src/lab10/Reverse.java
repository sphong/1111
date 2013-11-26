package lab10;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        
        int numOfVal;
        int num;
        int[] intArray;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an integer value: ");
        numOfVal = scan.nextInt();
        
        intArray = new int[numOfVal];
        
        System.out.println("\nNow Enter " + numOfVal + " values" );
        
        for (int i = 0; i < numOfVal; i++) {
            System.out.print("Enter a value: ");
            intArray[i] = scan.nextInt();
        }
        
        System.out.println("\nArray before reversing");
        System.out.println(" ---------------------");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Value in index " + i + ": " + intArray[i]);
        }
        
        for (int i = 0; i < numOfVal/2; i++ ) {
            num = intArray[numOfVal - 1 - i];   
            intArray[numOfVal - 1 - i] = intArray[i];        
            intArray[i] = num;
        }
        
        System.out.println("\nArray after reversing");
        System.out.println(" ---------------------");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Value in index " + i + ": " + intArray[i]);
        }
    }
    

}
