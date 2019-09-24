import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number(+ve Integer):");
		int num=scan.nextInt();
		int fact=1;
			int i=1;
			if(num>=0){
			do
				fact=fact*i;
			while(i<=num);
			System.out.println("Factorial of "+num+" is "+fact);
		}
	}
}