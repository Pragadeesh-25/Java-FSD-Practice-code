package bank;

public class SBAccount extends Account{
	String type;
	public SBAccount(double amount,String type) throws Userdef {
		super(amount);
		// TODO Auto-generated constructor stub
		this.type=type;
		if (!type.equals("NRI")||!type.equals("Normal")) {
            throw new Userdef("Invalid input type. Please enter correct values.");
        }
	}
	//double interestRate;
	//double amount;
	
	 double calculateInterest()
	 {
		 if(this.type.equals("Normal"))
			 interestRate=4;
		 if(this.type.equals("NRI"))
			 interestRate=6;
		 return ((amount*interestRate)/100);
		 
			 
	 }
}
