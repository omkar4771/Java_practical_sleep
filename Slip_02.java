package practical_slip;
import java.util.Scanner;
public class Slip_02 
{

	public static void main(String[] args) 
	{
		double weight,height,BMI;
		String fname,lname;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter first name :");
		fname=sc.next();
		System.out.print("Enter last name :");
		lname=sc.next();
		System.out.print("Enter the Weight & height :");
		weight=sc.nextDouble();
		height=sc.nextDouble();
		BMI=weight/(height*height);
		System.out.println("BMI :"+BMI);
	}

}
