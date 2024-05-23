/* Cody Asher
May 2024
Program with test scenarios for portfolio 
Created to showcase knowledge of superclass mechanics, and some basic Math
*/

/**
 * The class housing main, which will run test scenarios for the program
 */
public class TestCases{
    
    /**
     * Main, the start of the program, testing every other class
     */
    public static void main(String[] args)
    {
        // Creating one object per constructor, ensuring they all work
        
        Account acc1 = new Account();
        Account acc2 = new Account(100.50);
        
        Savings sav1 = new Savings();
        Savings sav2 = new Savings(91.4);
        Savings sav3 = new Savings(5);
        Savings sav4 = new Savings(343.0, 6);
        
        Chequing chq1 = new Chequing();
        Chequing chq2 = new Chequing(173.0);
        Chequing chq3 = new Chequing(24);
        Chequing chq4 = new Chequing(887.1, 4);
        
        System.out.println("════════════ Pre Test-Scenarios ════════════\n");
        
        System.out.println("Regular ────────────────");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println("Savings ────────────────");
        System.out.println(sav1);
        System.out.println(sav2);
        System.out.println(sav3);
        System.out.println(sav4);
        System.out.println("Chequing ────────────────");
        System.out.println(chq1);
        System.out.println(chq2);
        System.out.println(chq3);
        System.out.println(chq4);
        
        System.out.println("════════════ Test-Scenarios ════════════\n");
        
        // Accessing most methods for each class to check functionality
        // (Not checking the most simple methods)
        
        System.out.println("Regular ────────────────");
        // Check to make sure setBalance rounds amounts properly.
        System.out.println("setBalance");
        acc1.setBalance(100.35509);
        acc2.setBalance(100.35441);
        System.out.println(acc1);
        System.out.println(acc2);
        // Accessing every possible outcome in the withdraw method
        System.out.println("withdraw");
        acc1.withdraw(30.30);
        acc1.withdraw(100);
        acc1.withdraw(-10);
        acc1.withdraw(0);
        acc1.setBalance(0);
        acc1.withdraw(10);
        acc1.setBalance(-10);
        acc1.withdraw(10);
        // Every outcome for deposit
        System.out.println("\ndeposit");
        acc1.deposit(1.53);
        acc1.deposit(10);
        acc1.deposit(10);
        acc1.deposit(0);
        acc1.deposit(-10);
        
        System.out.println("\nSavings ────────────────");
        System.out.println("setRate");
        sav1.setRate(5);
        System.out.println(sav1);
        
        System.out.println("applyMonthly");
        sav2.applyMonthly();
        
        System.out.println("\nChequing ────────────────");
        // Every outcome for the Chequing class's overridden withdraw
        System.out.println("withdraw");
        chq2.withdraw(10);
        chq2.setTransactions(14);
        chq2.withdraw(10);
        chq2.withdraw(10);
        
        // Printing out chq2 to see what the balance and limit are before testing monthlyFees
        System.out.println("\n"+chq2);
        System.out.println("\nmonthlyFees");
        chq2.monthlyFees();
        chq2.monthlyFees();
        chq2.setTransactions(100);
        chq2.monthlyFees();
        
        System.out.println("════════════ Testing Complete ════════════");
    }
}