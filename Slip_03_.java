package practical_slip;
import java.util.*;
class patient
{
	String name;
	int age,oxylevel,HRCTreport;
	patient(String name,int age,int oxylevel,int HRCTreport)
	{
		this.name=name;
		this.age=age;
		this.oxylevel=oxylevel;
		this.HRCTreport=HRCTreport;
	}
}
public class Slip_03_ extends Exception 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hoe many patient you want to enter :");
		int n=sc.nextInt();
		patient[]ob=new patient[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter name :");
			String name=sc.next();
			System.out.print("Enter age :");
			int age=sc.nextInt();
			System.out.print("Enter oxy level :");
			int oxylevel=sc.nextInt();
			System.out.print("Enter HRTC report :");
			int HRTCreport=sc.nextInt();
			ob[i]=new patient(name,age,oxylevel,HRTCreport);
		}
		for(int j=0;j<n;j++)
		{
			if(ob[j].oxylevel<95 &&ob[j].HRCTreport>10)
				try
			{
				throw new NullPointerException("\n");
			}
			catch(Exception e)
			{
				System.out.println("Patient is Covid Positive(+) and Need to Hospitalized");
			}
			else
			{
				
			}
		}
	}

}
