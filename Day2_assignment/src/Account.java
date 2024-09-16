
public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	public void deposit(double amt)
	{
		this.balance+=amt;
	}
	public void withdraw(double amt)
	{
		this.balance-=amt;
	}
	public double getBalance()
	{return balance;}
	
	public void setaccNum(long accNum)
	{
		this.accNum=accNum;
	}
	public void setaccHolder(Person accHolder )
	{
		this.accHolder=accHolder;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public long getaccNum()
	{
		return accNum;
	}
	


}
