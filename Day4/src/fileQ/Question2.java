package fileQ;
import java.io.File;
import java.io.*;
import java.util.*;
public class Question2 {

	public static void main(String args[])
	{
		String str=null;
		System.out.println("Enter the file name");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		String stt="C:\\Users\\pragadeesh.b\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\Day4\\src\\fileQ\\"+str;
		File file=new File(stt);

		if(file.exists()) 
		{
			System.out.println("File exists");
			if(file.canRead())
			{
				System.out.println("File is readable");
			}
			else {
				System.out.println("File is not readable");
			}
			if(file.canWrite())
			{
				System.out.println("File is writtable");
			}
			else {
				System.out.println("File is not writtable");
			}
			
			if(file.isDirectory())
			{
				System.out.println("Directory");
			}
			else if(file.isFile())
			{
				System.out.println("File");
			}
			else {
				System.out.println("Unknown type");
			}
			
			System.out.print("Length of the file"+file.length()+"Bytes");

		}
		else {
			System.out.println("File does not exist");
		}
		
		
	}
}
