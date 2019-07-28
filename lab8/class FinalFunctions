class FinalFunctions
{
	public void show()
	{
	System.out.println("show this");
	}
	final public void display()
	{
	System.out.println("display this");
	}
}
class FinalFunctions1 extends FinalFunctions
	{
		//THIS FUNCTION CANT BE OVERRIDDEN CAUSE OF FINAL KEYWORD.
	/*public void display()
	{
	System.out.println("overridden function with final keyword cant be done" );
	}*/		
	public void otherFunc()
		{
			System.out.println(" this is another function");
		}
	}
class FinalFunctionsDemo
{
	public static void main(String args[])
	{
	FinalFunctions1 f=new FinalFunctions1();
	f.display();    //it will call base class's display function.   
	}
}