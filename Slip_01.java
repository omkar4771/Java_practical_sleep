package practical_slip;
import java.util.Scanner;
public class Slip_01
{
	public static void main(String[] args)
	{
		int n,n1,div;
		System.out.println("Enter the array size");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int omkar[]=new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<n;i++)
		{
			omkar[i]=sc.nextInt();
		}
		System.out.print("The entire element are :");
		for(int i=0;i<n;i++)
		{
			System.out.print( omkar[i]+"\t");
		}
		System.out.print("Prime number are :");
		for(int i=0;i<n;i++)
		{
			n1=omkar[i];
			div = 0;
			for(int j=2;j<(n1/2);j++)
			{
				if(n1%j==0)
				{
					div=1;
					break;
				}
			}
			if(div==0)
			{
				System.out.print(omkar[i]+"\t");
			}
		}

	}

}
