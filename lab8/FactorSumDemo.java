import java.util.Scanner;
interface AdvancedArithmetic
{
 public int sumOfFactors(int n);
}
class FactorSum implements AdvancedArithmetic
{
		public int sumOfFactors(int n)
	{
	int sum=0;
	for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			sum=sum+i;
			}
		}
		return sum;
	}
}

class FactorSumDemo
{
	public static void main(String args[])
	{
	FactorSum f=new FactorSum();
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number(1-1000)= ");
	int n=sc.nextInt();
	System.out.println("the sum of the factors of the entered number is= " +f.sumOfFactors(n));
	}
}