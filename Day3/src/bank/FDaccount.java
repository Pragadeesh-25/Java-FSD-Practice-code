package bank;

public class FDaccount extends Account{

	//double interestRate;
	//double amount;
	int noOfDays;
	String ageOfACHolder;
	public FDaccount( double amount, int noOfDays, String ageOfACHolder) throws Userdef {
		super(amount);
		if (noOfDays <= 0) {
            throw new Userdef("Invalid input for days or age. Please enter correct values.");
        }
		if (!ageOfACHolder.equals("Senior")||!ageOfACHolder.equals("General")) {
            throw new Userdef("Invalid input ageOfACHolder. Please enter correct values.");
        }
		this.amount = amount;
		this.noOfDays = noOfDays;
		this.ageOfACHolder = ageOfACHolder;
	}
	
	double calculateInterest()
	{
		if(this.amount<10000000)
		{
			if(noOfDays>7&&noOfDays<=14&&ageOfACHolder.equals("General"))
				interestRate=4.5f;
			else if(noOfDays>7&&noOfDays<=14&&ageOfACHolder.equals("Senior"))
				interestRate=5.0f;
			else if(noOfDays<=29&&ageOfACHolder.equals("General"))
				interestRate=4.75f;
			else if(noOfDays<=29&&ageOfACHolder.equals("Senior"))
				interestRate=5.25f;
			else if(noOfDays<45&&ageOfACHolder.equals("General"))
				interestRate=5.50f;
			else if(noOfDays<45&&ageOfACHolder.equals("Senior"))
				interestRate=6.00f;
			else if(noOfDays<=60&&ageOfACHolder.equals("General"))
				interestRate=7.0f;
			else if(noOfDays<=60&&ageOfACHolder.equals("Senior"))
				interestRate=7.5f;
			else if(noOfDays<=184&&ageOfACHolder.equals("General"))
				interestRate=7.5f;
			else if(noOfDays<=184&&ageOfACHolder.equals("Senior"))
				interestRate=8.0f;
			else if(noOfDays<=365&&ageOfACHolder.equals("General"))
				interestRate=8.0f;
			else if(noOfDays<=365&&ageOfACHolder.equals("Senior"))
				interestRate=8.50f;
			
			
				
		}
			
		else 
			{if(noOfDays>7&&noOfDays<=14)
				interestRate=6.5f;
			else if(noOfDays<=29)
				interestRate=6.75f;
			else if(noOfDays<45)
				interestRate=6.50f;
			else if(noOfDays<=60)
				interestRate=8.0f;
			else if(noOfDays<=184)
				interestRate=8.5f;
			else if(noOfDays<=365)
				interestRate=10.00f;}
		
		return Math.pow(amount*(1+interestRate/100),noOfDays );
	}
	
	
}
