interface factorialI
{
	public int fact(int n);
}
class Prob4
{
	public static void main(String[] args) {
		/*factorialI f=(n)->{
			int temp=1;
			for(int i=1;i<=n;i++)
			{
				temp*=i;
			}
			return temp;
		};*/
		factorialI f=new Logic()::fact;
		System.out.println("Factorial result:"+f.fact(5));
	}
}