
public class Logic {

	public double power(int a,int b)
	{
		return (double)Math.pow(a, b);
	}
	public void display(String str)
	{
		for(int i=0;i<str.length();i++) 
		{
			System.out.print(str.charAt(i)+" ");
		}
	}
	public int fact(int n)
	{int temp=1;
	for(int i=1;i<=n;i++)
	{
		temp*=i;
	}
	return temp;
}
	public boolean validate(String name, String pass)
	{
		if(pass.equals(name+"123"))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
