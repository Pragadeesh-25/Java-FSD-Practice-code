interface example
{
	public double find(int x,int y);
}
public class Prob2 {
public static void main(String[] args) {
	//example e=(x,y)->(Math.pow((double)x, (double)y)); //Using lambda expression
	example e=new Logic()::power;
	System.out.println("Result "+e.find(10, 2));
}
}
