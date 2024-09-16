interface check
{
	public boolean validate(String name, String pass);
}
public class Prob5 {
public static void main(String[] args) {
	/*check c=(name,pass)->{
		if(pass.equals(name+"123"))
			return true;
		else 
			return false;
	
	};*/
	check c=new Logic()::validate;
	if(c.validate("Hari", "Hari123"))
		System.out.println("Hari:"+"Valid details.");
	else {
		System.out.println("Hari:"+"Wrong credentials");
	}
	if(c.validate("abi", "abi789"))
		System.out.println("abi"+"Valid details.");
	else {
		System.out.println("abi:"+"Wrong credentials");
	}

}
}
