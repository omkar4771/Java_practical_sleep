package practical_slip;
import java.util.*;
abstract class Staff
{
	protected int id;
	protected String name;
	Staff(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
  class OfficeStaff extends Staff
{
	String department;
	OfficeStaff(String department,int id,String name)
	{
		super(id,name);
		this.department=department;
	}
	void display()
	{
		System.out.println("ID="+id);
		System.out.println("Name="+name);
		System.out.println("Department="+department);
	}
}
public class Slip_01_ 
{
	public static void main(String[] args) 
	{
		int n,id;
		String name,department;
		System.out.println("Ente the limit");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		OfficeStaff[] ob=new OfficeStaff[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Id,Name and Department:");
			id=sc.nextInt();
			name=sc.next();
			department=sc.next();
			ob[i]=new OfficeStaff(department,id,name);
		}
		System.out.println("Display ::");
		for(int j=0;j<n;j++)
		{
			ob[j].display();
		}
	}
}
