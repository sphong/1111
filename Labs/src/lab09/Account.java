package lab09;

//************************************************************
//Account.java
//
//A bank account class with methods to deposit to, withdraw from,
//change the name on, and get a String representation
//of the account.
//************************************************************\
import java.util.Random;

public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    private static int numAccounts = 0;
    
    //-------------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //-------------------------------------------------
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts++; 
    }
    
    public Account(double initBal, String owner) 
    {
        Random gen = new Random();
       
        balance = initBal;
        name = owner;
        acctNum = gen.nextInt(9999);
        numAccounts++;
    }
    
    public Account(String owner) {
        Random gen = new Random();

        name = owner;
        balance = 0;
        acctNum = gen.nextInt(9999);
        numAccounts++; 
    }
    
    //-------------------------------------------------
    //Checks to see if balance is sufficient for withdrawal.
    //If so, decrements balance by amount; if not, prints message.
    //-------------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount)
        balance -= amount;
         
        else
        System.out.println("Insufficient funds");
    }
    
    public void withdraw(double amount, double fee)
    {
        if (balance >= amount + fee) {
        balance -= amount;
        balance -= fee;
        } 
        else
        System.out.println("Insufficient funds");
    }
    
    //-------------------------------------------------
    //Adds deposit amount to balance.
    //-------------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    //-------------------------------------------------
    //Returns balance.
    //-------------------------------------------------
    public double getBalance()
    {
        return balance;
    }
    
    // Get number of accounts created so far
    public static int getNumAccounts() {
        return numAccounts;
    }
    
    // Get account name of the account
    public String getAcctName() {
        return name;
    }
    
    // Get account number of the account
    public long getAcctNum() {
        return acctNum;
    }
    
    // Closes an account
    public void close() {
        name = "CLOSED";
        balance = 0;
        numAccounts--;
    }
    
    // Consolidates two accounts
    public static Account consolidate(Account acct1, Account acct2) {
        
        double balance1 = acct1.getBalance();
        double balance2 = acct2.getBalance();
        String name1 = acct1.getAcctName();
        String name2 = acct2.getAcctName();
        long acctNum1 = acct1.getAcctNum();
        long acctNum2 = acct2.getAcctNum();
                
       if (name1.equals(name2) && acctNum1 != acctNum2) {
        Account acct3 = new Account((balance1 + balance2), name1);
        acct1.close();
        acct2.close();
        return acct3;
        
       } else {
           System.out.println("Invalid account names or account numbers");
           return null;
       }
    }

    //-------------------------------------------------
    //Returns a string containing the name, account number, and balance.
    //-------------------------------------------------
    public String toString()
    {
        return "Name:" + name +
        "\nAccount Number: " + acctNum +
        "\nBalance: " + balance;
    }
}
