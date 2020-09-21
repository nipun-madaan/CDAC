package cdac;

class StaticNInitBlock{
	
	static int i;
	int j;
	static{   //static block - initializes the static variable
		System.out.println("Static block ");
		i = 10;
		//j=30;   //error
	}
	{        //init block - initializes the init block
		System.out.println("init block");
		j = 20;
		i=50;
	}
	public static void main(String[] args){
		System.out.println(i);
		StaticNInitBlock h = new StaticNInitBlock();
		System.out.println("main");
		System.out.println(i);
		System.out.println(h.j);
	}
}