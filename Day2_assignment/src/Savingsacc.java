
public class Savingsacc extends Account{
	
	final double minBal=500;
	public void withdraw(double amt)
	{ double x=super.getBalance();
		if(x>500)
		{
			x-=amt;
		}
		else
			System.out.println("Can't withdraw, balance is less than min balance");
			
	}


}
