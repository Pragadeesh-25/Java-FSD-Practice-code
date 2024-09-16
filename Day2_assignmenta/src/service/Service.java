package service;
import bean.Employee;
interface servicei
{
	void getDetails(int id,String name, int salary, String designation);
	void insScheme(int salary, String designation);
	void printDetails();
}
public class Service implements servicei {
	Employee e=new Employee();
	public void getDetails(int id,String name, int salary, String designation)
	{
		e.setName(name);
		e.setSalary(salary);
		e.setDesignation(designation);
		e.setId(id);
		
	}
	public void insScheme(int salary, String designation)
	{
		if((salary>30000)&&(designation.equals("trainee")))
			e.setInsScheme("basic");
		else if((salary>50000)&&(designation.equals("senior")))
			e.setInsScheme("standard");
		else
			e.setInsScheme("Elite");

		
	}
	public void printDetails()
	{
	System.out.println(e);	
	}
	
}
