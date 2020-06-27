class StaticIntBlk{
	int i;
	static int j;
	static{
		System.out.println("static block");
		//j=10;         //static variable can be initialized here 
		//i=20;         //inst variable can't be intialized here
	}
	{
		System.out.println("Inst block");
		j=10;
		i=20;
	}
	
	/*void fun(){
		i=50;            //static variable can also be initialized here inside function
	}*/
	
	public static void main(String[] args){
		System.out.println(StaticIntBlk.j);
		StaticIntBlk s = new StaticIntBlk();
		//s.fun();
		System.out.println(s.i);
		System.out.println(StaticIntBlk.j);
	}
}