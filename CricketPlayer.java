package practical_slip;
import java.util.Scanner;
public class CricketPlayer 
{
	int playerCode,run,no_of_innings,no_of_times_notout;
	String name;
	static int count=0;
	float avg;
	CricketPlayer()
	{
		count++;
		playerCode=0;
		name="";
		run=0;
		no_of_innings=0;
		no_of_times_notout=0;
	}
	CricketPlayer(int playerCode,String name,int run,int no_of_innings,int no_of_times_notout)
	{
		count++;
		this.playerCode=playerCode;
		this.name=name;
		this.run=run;
		this.no_of_innings=no_of_innings;
		this.no_of_times_notout=no_of_times_notout;
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Player Code :");
		playerCode=sc.nextInt();
		System.out.print("Enter the player name :");
		name=sc.next();
		System.out.print("Enter the runs :");
		run=sc.nextInt();
		System.out.print("Enter the number of innings :");
		no_of_innings=sc.nextInt();
		System.out.print("Enter the not out ");
		no_of_times_notout=sc.nextInt();
		avg=run/no_of_innings;
	}
	void display()
	{
		System.out.println("Average run of multiple player :"+avg);
	}
	static void count()
	{
		System.out.println("Number of object :"+count);
	}
	static void AvgRunOfSinglePlayer(CricketPlayer ob[],int id)
	{
		int flag=0;
		for(int i=0;i<count;i++)
		{
			if(ob[i].playerCode==id)
			{
				System.out.println("Average run of single player :"+ob[i].avg);
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Id not match");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit :");
		int n=sc.nextInt();
		CricketPlayer[] ob= new CricketPlayer[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new CricketPlayer();
			ob[i].accept();
		}
		int ch;
		do
		{
			System.out.println("1.Display average runs of a single player");
			System.out.println("2.Display average runs of a multiple player");
			System.out.println("Enter Your Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Player Code:");
				int id=sc.nextInt();
				CricketPlayer.AvgRunOfSinglePlayer(ob,id);
				break;
			case 2:
				for(int i=0;i<n;i++)
				{
					ob[i].display();
				}
				break;
			default:
				System.out.println("Invalid Choice......");	
			}
		}
		while(ch<3);
	}
}
