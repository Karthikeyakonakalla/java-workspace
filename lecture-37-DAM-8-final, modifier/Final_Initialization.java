class Final_Initialization
{
	final int x;

	//constructor
	Test()
	{
	x=10;;
	}

	// instance block
	{	
		x=1;
	}
	public static void main(String[] args)
	{
	Test t=new Test();
	System.out.println(t.x);	
	}
}