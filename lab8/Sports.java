import java.util.Scanner;
class Sports
{
		public String getName()
	{
	return "Generic sports";
	}
		public void getNumberOfTeamMembers()
	{
	System.out.println("each team has n players in " +getName()); 
	}
}
class Cricket extends Sports
{
	Scanner sc=new Scanner(System.in);

			public String getName()
			{
			return "cricket";
			}
		public void getNumberOfTeamMembers()
		{
		System.out.print("enter number of players= ");
		int n=sc.nextInt();
		System.out.println("each team has "+ n+" players in " +getName()); 
		}	
}
class Soccer extends Sports
{
	Scanner sc=new Scanner(System.in);
	public String getName()
			{
			return "soccer";
			}
		public void getNumberOfTeamMembers()
		{
		System.out.print("enter number of players= ");
		int n=sc.nextInt();
		System.out.println("each team has "+ n+" players in " +getName()); 
		}
}
class Demos
{
	public static void main(String args[])
	{
	Sports sp=new Sports();
	Cricket c=new Cricket();
	Soccer s=new Soccer();
	//cricket class
	Sports r;
	r=c;
	System.out.println("the game is= "+r.getName());
	r.getNumberOfTeamMembers();
	r=s;
	//soccer class
	System.out.println();
	System.out.println("the game is= "+r.getName());
	r.getNumberOfTeamMembers();
	}
}