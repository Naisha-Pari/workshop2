package workshop2;

public class savingaccount {
	
	static private double annualinterestrate;
	private double savingbalance;
	
	public  savingaccount(double savingbalance)
	{
		this.savingbalance=savingbalance;
	}
public double getSavingbalance()
{
	return this.savingbalance;
}
public static void modifyInteresttRate(double interestrate){
	annualinterestrate=interestrate;
}

public void calculateMonthlyInterest()
{
        double monthlyI; 
        monthlyI= (double)(this.savingbalance*annualinterestrate/12);
        this.savingbalance+=monthlyI;
}


public static void main(String[] args) {

                // To test the class designed above
        //Instantiate 2 saving account objects saver1 and saver2
        savingaccount saver1, saver2;
        saver1 = new savingaccount (2000.0);
        saver2= new savingaccount (3000.0);
        
        int total = 0;

        //Set the annual interest rate to 4%=0.04
        savingaccount.modifyInteresttRate (0.04);

        //Calculate monthly interest 
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        //Print out the new balances for both savers
        System.out.println("This month:\nSaver 1 balance= "+ saver1.getSavingbalance());
        System.out.println("Saver 2 balance= "+ saver2.getSavingbalance());


        //Change annual interest rate to 5%=0.05
        savingaccount.modifyInteresttRate(0.05);

        //Calculate the next month interest rate and print out balances
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Next month:\nSaver 1 balance= "+ saver1.getSavingbalance());
        System.out.println("Saver 2 balance= "+ saver2.getSavingbalance());

}
}












