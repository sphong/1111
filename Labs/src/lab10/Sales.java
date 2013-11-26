package lab10;

//***************************************************************
//Sales.java
//
//Reads in and stores sales for each of 5 salespeople. Displays
//sales entered by salesperson id and total sales for all salespeople.
//
//***************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        double average;
        int maxId = 0;
        int maxSales = 0;
        int minId = 0;
        int minSales = 0;
        int value;
        
        Scanner scan = new Scanner(System.in);
        
        for (int i=0; i<sales.length; i++)
            {
                System.out.print("Enter sales for salesperson " + i + ": ");
                sales[i] = scan.nextInt();
                
                if (sales[i] > sales[maxId]){
                    maxId = i;
                    maxSales = sales[i];
                } else if (sales[i] < sales[maxId] ) {    
                    maxSales = sales[maxId];
                }
            }
        
        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0; 
        for (int i=0; i<sales.length; i++)
            {
                System.out.println(" " + i + " " + sales[i]);
                sum += sales[i];
                
                if (sales[i] < sales[minId]){
                    minId = i;
                    minSales = sales[i];
                } else if (sales[i] > sales[minId] ) {    
                    minSales = sales[minId];
                }
            }
        
        System.out.println("\nTotal sales: " + sum);
        average = (double) sum / SALESPEOPLE;
        System.out.println("Average sales: " + average);
        System.out.println("Sales person " + maxId + " has the highest sale with $" + maxSales + ".");
        System.out.println("Sales person " + minId + " has the lowest sale with $" + minSales + ".");
        
        System.out.println("Enter a value: ");
        value = scan.nextInt();       
    }
}