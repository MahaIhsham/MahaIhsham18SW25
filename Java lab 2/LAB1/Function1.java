import java.util.*;
class Function1
{
	public void detail()
	{


	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	String rollNum=sc.nextLine();
	System.out.println(name + rollNum);
}
public static void main(String[]args)
{
	Function1 f1=new Function1();
	f1.detail();
}
}