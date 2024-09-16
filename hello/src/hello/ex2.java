package hello;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter: 1-red,2-yellow,3-green");
		str=sc.next();
		switch(str)
		{
		case "red":
			System.out.print("Stop");
			break;
		case "yellow":
			System.out.print("Ready");
			break;
		case "green":
			System.out.print("Go");
			break;	
		}

	}

}
