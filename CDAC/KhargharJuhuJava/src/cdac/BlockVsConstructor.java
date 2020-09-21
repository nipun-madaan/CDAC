package cdac;

class BlockVsConstructor{
	int j;
	static{  //static block
		System.out.println("static block");
	}
	
	{    //init block
		System.out.println("init block "+j);
		j=10;
		System.out.println("init block "+j);
	}
	
	BlockVsConstructor(){   //constructor
		System.out.println("constructor "+j);
		j=20;
		System.out.println("constructor "+j);
	}
	
	public static void main(String[] args){
		System.out.println("main");
		BlockVsConstructor i = new BlockVsConstructor();
		System.out.println(i.j);
	}
}