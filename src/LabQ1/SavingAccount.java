package LabQ1;

public class SavingAccount extends Account {
	
	private final double minimumBalance=500;

	@Override
	public void withDraw(double withdrawCash) 
	{
		if((super.getBalance()- withdrawCash)>=minimumBalance)
		{
			super.withDraw(withdrawCash);
		}
		else
		{
			System.out.println("Cannot withdraw minimum balance should be 500");
		}
	}


	
	

}