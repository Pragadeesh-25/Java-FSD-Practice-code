import java.util.*;
interface examplee
{
	public void display(String arr);
}
public class Prob3 {
public static void main(String[] args) {
	
	//examplee ex = (String arr)->{for(int i=0;i<arr.length();i++) {System.out.print(arr.charAt(i)+" ");}};
	examplee ex=new Logic()::display;
	ex.display("Hello");
}

}

