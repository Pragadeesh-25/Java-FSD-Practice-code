
public class Currentacc extends Account{

	int overdraftLimit=3000;
	public void withdraw(double amt)
	{
		
		if(amt>overdraftLimit)
		{
			System.out.println("Limit exceeded, can't withdraw");;
		}
		else
			setBalance(super.getBalance()-amt);

			
	}
	
}
