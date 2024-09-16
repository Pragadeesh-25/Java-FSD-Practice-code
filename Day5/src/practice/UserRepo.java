package practice;
import java.util.*;

public class UserRepo {
	static Map<String, String>mp=null;
	static {
		 mp=new HashMap<String, String>();
		 mp.put("admin", "admin123");
		 mp.put("HR", "hr123");
		 
	}
	public static Map<String, String> getUsers()
	{
		return mp;
	}
	

}
