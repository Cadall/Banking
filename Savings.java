/* Cody Asher
May 2024
Program with test scenarios for portfolio */

/**
 * A class extending Account 
 * Represents a Savings account, with an annual interest rate
 */
public class Savings extends Account{
    
    private double annualRate;
    
    /**
     * Default constructor, setting the rate to 2%
     */
    public Savings(){
        annualRate = 0.02;
    }
    /**
     * A constructor allowing you to set the balance, with a 2% interest rate
     * @param b the balance as a double
     */
    public Savings(double b){
        super(b);
        annualRate = 0.02;
    }
    /**
     * A constructor which sets the annual rate
     * Intakes an int (Ex. 5) and stores it as a double (Ex. 0.05)
     * @param r an int, which will be converted to a double representing your annual interest rate
     */
    public Savings(int r){
        annualRate = r/100.0;
    }
    /**
     * A constructor allowing you to set balance and the interest rate
     * @param b the balance as a double
     * @param r an int which will be stored as a double representing your interest rate
     */
    public Savings(double b, int r){
        super(b);
        annualRate = r/100.0;
    }
    
    /**
     * A method to return the annual interest rate as a double
     * @return the current interest rate as a double
     */
    public double getRate(){
        return annualRate;
    }
    /**
     * A method to manually set the interest rate
     * @param r the rate as an int, to be stored as a double representing the interest rate
     */
    public void setRate(int r){
        annualRate = r/100.0;
    }
    
    /**
     * Applies the monthly interest rate to your current balance
     * Multiplies the current balance by 1/12 of the annual rate
     * Prints an update on the balance
     */
    public void applyMonthly(){
        super.setBalance((super.getBalance() * annualRate * (1.0/12)) + super.getBalance());
        System.out.println("Your monthly interest has been applied, your balance is now "+super.getBalance()+".");
    }
    
    /**
     * Outputs the current balance and annual interest rate as a percentage
     * @return the current balance and annual interest rate as a percentage
     */
    @Override
    public String toString(){
        return "Your current balance is "+super.getBalance()+", and your annual interest rate is "+annualRate*100+"%.\n";
    }
}