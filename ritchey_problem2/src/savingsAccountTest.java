public class savingsAccountTest {

    public savingsAccountTest() {
    }
    public static void main(String[] args)
    {
    	savingsAccount saver1, saver2;
        saver1 = new savingsAccount (2000.0);
        saver2= new savingsAccount (3000.0);
      
        //int total = 0;

       
       savingsAccount.modifyInterestRate (0.04);
       System.out.println("saver1 Balance");
        
       for(int i=0; i<12; i++) 
       {
        saver1.calculateMonthlyInterest();            
        System.out.println("Month " + (i+1)+" - "+ String.format("%.2f",saver1.getSavingBalance()));
       }
       
       System.out.println("\nsaver2 Balance\n");
       
       for(int i=0; i<12; i++) 
       {
       saver2.calculateMonthlyInterest();
       System.out.println("Month " + (i+1)+" - "+ String.format("%.2f",saver2.getSavingBalance()));
       }
       
       savingsAccount.modifyInterestRate(0.05);
       System.out.println("\nsaver1");
       System.out.println("Annual Interest Rate 5%\n");
        
       for(int i=0; i<12; i++) 
       {
        saver1.calculateMonthlyInterest();            
        System.out.println("Month " + (i+1)+" - "+ String.format("%.2f",saver1.getSavingBalance()));
       }
       
       System.out.println("\nsaver2");
       System.out.println("Annual Interest Rate 5%\n");
       
       for(int i=0; i<12; i++)
       {
       saver2.calculateMonthlyInterest();
       System.out.println("Month " + (i+1)+" - "+ String.format("%.2f",saver2.getSavingBalance()));
       }

}
}