class Task2{
	public static void main(String[]args)
	{
		String name;
		name="MahaIhsham";
		short totalmarks=1100;
		int obtainedmarks=900;
		char grade='A';
		double per=(obtainedmarks*100)/totalmarks;
		boolean t=true;
		boolean f=false;
		if((per>50)==true)
		{
			System.out.println("status:pass");

		}
		else
		{
			System.out.println("status:fail");

		}

System.out.println("name:"+name);
System.out.println("totalmarks:"+totalmarks);
System.out.println("obtainedmarks:"+obtainedmarks);
System.out.println("grade:"+grade);
System.out.println("percentage:"+per);



	}
}