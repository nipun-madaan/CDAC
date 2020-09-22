package cdac;
public class Base{
	protected static int i;
	public int j;
	static{
		i=5;
	}
	{
		j=10;
	}
	
	protected static void sum(){
		System.out.println("Base :: sum()");
	}
	
	public void sub(){
		System.out.println("Base :: sub()");
	}
}