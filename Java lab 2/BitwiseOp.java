class BitwiseOp
{
	public static void main(String[]args)
	{
		int a=11,b=10,c=35,d=13,result;
		result=a|b;
		System.out.println(result);
		result=a&b;
		System.out.println(result);

		result= ~ c;
		System.out.println(result);

		result=a^b;
		System.out.println(result);


		System.out.println(d<<1);
		System.out.println(d<<2);
		System.out.println(d<<3);

		System.out.println(d>> 1);
		System.out.println(d>> 2);
		System.out.println(d>> 3);

		System.out.println(a>> 1);
		System.out.println(a>>> 1);
		System.out.println(b >>1);
		System.out.println(b >>>1);

	}
}