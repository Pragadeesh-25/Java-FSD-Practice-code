
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.setName("smith");
		p.setAge(50);
		
		Account a=new Account();
		a.setaccHolder(p);
		a.setBalance(2000);
		a.deposit(2000);
		System.out.println("Balance:"+a.getBalance());
		
		
		Person p1=new Person();
		p1.setName("katty");
		p1.setAge(30);
		
		Account a1=new Account();
		a1.setaccHolder(p1);
		a1.setBalance(3000);
		a1.withdraw(2000);
		System.out.println("Balance:"+a1.getBalance());
		
		
		Person p2=new Person();
		p2.setName("Virat");
		p2.setAge(35);
		Savingsacc sa=new Savingsacc();
		sa.setaccHolder(p2);
		sa.setBalance(400);
		sa.withdraw(2000);
		System.out.println("Balance:"+sa.getBalance());
		
		
		Person p3=new Person();
		p3.setName("Anushka");
		p3.setAge(32);
		Currentacc ca=new Currentacc();
		ca.setaccHolder(p3);
		ca.setBalance(1000);
		ca.withdraw(10000);
		System.out.println("Balance:"+ca.getBalance());
		

		
		
		
		

	}

}
