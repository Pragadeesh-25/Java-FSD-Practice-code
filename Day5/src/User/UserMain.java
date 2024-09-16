package User;
import java.util.Scanner;

import Service.*;
import practice.*;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String name=null,pass=null;
		System.out.println("Enter the user name and password");
		name=scanner.next();
		pass=scanner.next();
		
		
		UserService usp=new UserService();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the operation 1-Login,2-Print,3-add user");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
			{
				if(usp.validateUser(name, pass))
						{
					System.out.println("Welcome"+name);
						}
				else {
					System.out.println("Invalid username and password");
				}
				break;
			}
			case 2:
			{
				usp.display(name);
			}
			case 3:
			{
				usp.addUser(name, pass);
			}
			}
		}
		
		

	}

}
