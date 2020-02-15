
public class savingsAccount {

	
    static private double annualInterestRate;
    private double savingsBalance;

    public savingsAccount()
    {
        this.savingsBalance=0;
    }
    
    public savingsAccount(double savingBalance)
    {
            this.savingsBalance=savingBalance;
    }
    
    public double getSavingBalance()
    {
            return this.savingsBalance;
    }
    
    public static void modifyInterestRate(double newInterestRate)
    {
            annualInterestRate=newInterestRate;
    }
   
    public void calculateMonthlyInterest()
    {
            double monthlyI;
            monthlyI= (double)(this.savingsBalance*annualInterestRate/12);
            this.savingsBalance+=monthlyI;
    }
}
