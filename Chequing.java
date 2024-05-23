/* Cody Asher
May 2024
Program with test scenarios for portfolio */

/**
 * A class extending Account
 * Represents a chequing account with a transaction limit
 */
public class Chequing extends Account{
    
    private int transactions;
    private int tLimit;
    
    /**
     * The basic constructor, setting the transaction limit to 15
     */
    public Chequing(){
        tLimit = 15;
    }
    
    /**
     * A constructor allowing you to set the balance, while the limit defaults to 15
     * @param b the amount for the balance to be set to as a double
     */
    public Chequing(double b){
        super(b);
        tLimit = 15;
    }
    
    /**
     * A constructor which sets the transaction limit, without a balance
     * @param limit the transaction limit as an integer
     */
    public Chequing(int limit){
        tLimit = limit;
    }
    
    /**
     * A constructor setting both the limit and balance
     * @param b the amount for your balance as a double
     * @param limit your transaction limit
     */
    public Chequing(double b, int limit){
        super(b);
        tLimit = limit;
    }
    
    /**
     * A method to return your current transaction limit as an int
     * @return your transaction limit as an integer
     */
    public int getLimit(){
        return tLimit;
    }
    /**
     * A method for setting your transaction limit
     * @param limit the transaction limit
     */
    public void setLimit(int limit){
        tLimit = limit;
    }
    
    /**
     * A method to return how many transactions have been made
     * @return the amount of transactions made as an integer
     */
    public int getTransactions(){
        return transactions;
    }
    /** 
     * A method which sets your transactions to a given number
     * @param t the number of transactions
     */
    public void setTransactions(int t){
        transactions = t;
    }
    
    /**
     * An overridden withdraw method
     * Has unique output based on your number of transactions
     * @param amount the amount to withdraw
     */
    @Override
    public void withdraw(double amount){
        amount = Math.round(amount*100)/100.0;
        
        double temp = super.getBalance();
        super.withdraw(amount);
        
        if(super.getBalance() < temp){
            transactions += 1;
            if(transactions > tLimit){
                System.out.println("You are over your monthly transaction limit by "+(transactions-tLimit)+". You will be charged at the end of the month for every transaction over the limit.");
            }
            else if(transactions == tLimit){
                System.out.println("You have reached your monthly transaction limit. Each additional transaction will lead to charges.");
            }
            else{
            System.out.println("You have made "+transactions+" out of your monthly transaction limit of "+tLimit+".");
            }
        }
    }
    /**
     * A method which applies any monthly fees based on transactions
     * Fines $2.50 for each transaction over the limit
     */
    public void monthlyFees(){
        transactions -= tLimit;
        
        if(transactions > 0){
            super.setBalance(super.getBalance() - (transactions * 2.5));
            
            if(super.getBalance() < 0.0){
                System.out.println("Congratulations! You are now in debt due to the monthly fees!");
            }
            else{
                System.out.println("After the monthly fees, your balance is $"+super.getBalance()+".");
            }
        }
        else{
            System.out.println("You did not exceed the monthly transaction limit. No additional fees are required.");
        }
    }
    
    /**
     * Returns the current balance, transactions, and transaction limit
     * @return a string with the current balance, transactions, and transaction limit
     */
    @Override
    public String toString(){
        return "Your account balance is currently $"+super.getBalance()+".\nYou are at "+transactions+" transactions out of the monthly limit of "+tLimit+".\n";
    }
}