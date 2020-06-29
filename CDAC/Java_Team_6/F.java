class F{
	{
		System.out.println("init 1");
	}
	static{
		new F();
		System.out.println("static");
	}
	{
		//new F();    //this will go into infinite loop
		System.out.println("init 2");
	}
	F(){
		System.out.println("F");
	}
	
	public static void main(String[] args){
		int a = fun();
		System.out.println(a);
		new F();
	}
	
	static int fun(){
		System.out.println("fun");
		return 5;
	}
}