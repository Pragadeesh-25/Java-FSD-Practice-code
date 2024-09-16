package bean;

public class Employee {
	 private int id;
	 private String name;
	 private int salary; 
	 private String designation;
	 private String insScheme;


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insScheme=" + insScheme + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getInsScheme() {
		return insScheme;
	}


	public void setInsScheme(String insScheme) {
		this.insScheme = insScheme;
	}

}
