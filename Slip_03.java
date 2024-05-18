package practical_slip;
import java.util.*;
public class Slip_03 
{
	public static void main(String[] args)
	{
		int n;
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		n=sc.nextInt();
		String omkar[]=new String[n];
		System.out.println("Enter city name :");
		for(int i=0;i<n;i++)
		{
			omkar[i]=sc.next();
		}
		System.out.println("Entire cities are :");
		for(int i=0;i<n;i++)
		{
			System.out.print(omkar[i]+"\t");
		}
		System.out.println("\ncities Sorted in ascending order are :");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(omkar[i].compareTo(omkar[j])>0)
				{
					temp=omkar[i];
					omkar[i]=omkar[j];
					omkar[j]=temp;
				}
			}
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(omkar[k]+"\t");
		}
	}
}
