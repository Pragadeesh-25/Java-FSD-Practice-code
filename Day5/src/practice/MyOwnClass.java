package practice;

public class MyOwnClass {
int age;
String name;
public MyOwnClass(int age, String string) {
	super();
	this.age = age;
	this.name = string;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.age+this.name);
	}

}
