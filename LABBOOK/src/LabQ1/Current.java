package LabQ1;

public class Current extends Account
{
	private final double overdraftLimit=5000;
	@Override
	public void withDraw(double withdrawCash) {
		if((super.getBalance()+withdrawCash)>overdraftLimit)
		{
			System.out.println("OverLimit exceed");
		}
		else 
			{ 
				System.out.println("OverLimit not exced");
			}
		
	}
	public double isOverdraftLimit()
	{
		return overdraftLimit;
	}

}