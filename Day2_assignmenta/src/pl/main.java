package pl;
import java.util.*;
import service.Service;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of the employee-ID,Name,Salary,Designation");
		int id=sc.nextInt();
		String str=sc.next();
		int salary=sc.nextInt();
		String designation=sc.next();
		Service ser=new Service();
		
		
		
		
		ser.getDetails(id,str,salary,designation);
		ser.insScheme(salary,designation);
		ser.printDetails();

		
	

	}

}
