package practical_slip;
import java.io.*;
import java.util.*;
interface Operation
{
	final static float pi=3.142f;
	void area();
	void volume();
}
  class cylinder implements Operation
{	

	double radius,height;
	public void input() //throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius and height :");
		radius=sc.nextDouble();
		height=sc.nextDouble();
	}
	public void area()
	{
		 double a=(2*pi*radius*height)+(2*pi*radius*radius);
		 System.out.println("the area of cylinder is " +a); 
	}
	public void volume()
	 {
		 double v=pi*radius*radius*height;
		 System.out.println("the volume of cylinder is "+v); 
	 }
}
public class Slip_11
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		cylinder c1=new cylinder();
		c1.input();
		c1.area();
		c1.volume();
	}

}
