/* Cody Asher
May 2024
Program with test scenarios for portfolio */


/**
 * A class which creates and manages a basic account
 */
public class Account{
    
    private double balance;
    
    /**
     * Default, empty constructor, has no set values
     */
    public Account(){
    }
    
    /**
     * A constructor which sets the balance as a double
     * @param b the value which balance will be set to
     */
    public Account(double b){
        balance = Math.round(b*100)/100.0;
    }
    
    /**
     * A method to set the balance manually
     * @param amount the value for the account's balance
     */
    public void setBalance(double amount){
        balance = Math.round(amount*100)/100.0;
    }
    
    /**
     * A method to access an account's balance
     * @return the account's balance as a double
     */
    public double getBalance(){
        return balance;
    }
    
    
    /**
     * A method which withdraws an amount of money from an account, updating it's balance
     * Rounds to the nearest cent
     * Doesn't allow withdrawing 0 or negative amounts
     * @param amount the amount of money to withdraw
     */
    public void withdraw(double amount){
        amount = Math.round(amount*100.0)/100.0;
        
        if(balance == 0){
            System.out.println("Can't withdraw anything if you're broke.");
        }
        else if(balance < 0){
            System.out.println("You're already in debt, stop trying to take more.");
        }
        
        else if(balance > 0){    
            if(balance > amount && amount > 0){
                balance -= amount;
                System.out.println("Transaction successful! Your balance is now $"+balance+".");
            }
            else if(balance < amount){
                System.out.println("Error:\n└─── Insufficient funds.");
            }
            else if(amount < 0){
                System.out.println("Error:\n└─── Cannot withdraw a negative amount.");
            }
            else if(amount == 0){
                System.out.println("Error:\n└─── Cannot withdraw $0.");
            }
        }
    }
    
    /**
     * A method to deposit money into the account, updating the balance
     * Rounds the amount to the nearest cent
     * Doesn't allow depositing 0 or negative amounts
     * @param amount the amount to deposit
     */
    public void deposit(double amount){
        amount = Math.round(amount*100)/100.0;
        
        if(amount < 0){
            System.out.println("Error:\n└─── Cannot deposit a negative amount, try \"withdrawing.\"");
        }
        else if(amount == 0){
            System.out.println("Error:\n└─── Cannot deposit $0.");
        }
        else if(balance < 0){
            if(amount >= balance*-1){
                balance += amount;
                System.out.println("Deposit successful! You are now out of debt!");
            }
            else{
                balance += amount;
                System.out.println("Deposit successful! You are now only $"+balance*-1+" in debt!");
            }
        }
        else{
            balance += amount;
            System.out.println("Deposit successful! Your balance is now $"+balance+".");
        }
    }
    
    
    /**
     * Outputs the balance of the account as a String
     * @return A string stating the balance
     */
     @Override
    public String toString(){
        return "Your account balance is currently $"+balance+".\n";
    }
}