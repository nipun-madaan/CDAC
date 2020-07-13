class Up{
	static int x;
	int y;
	static{
		x=5;
	}
	Up(){
		y=10;
	}
	static void fun(){
		System.out.println("Up::fun()");
	}
	void test(){
		System.out.println("Up::test()");
	}
}
class Down extends Up{
	static int a;
	int b;
	static{
		a=15;
	}
	Down(){
		b=20;
	}
	static void fun(){
		System.out.println("Down::fun()");
	}
	void test(){
		System.out.println("Down::test()");
	}
	
	public static void main(String[] args){
		Up u = (Up)new Down();    //Upcasting
		System.out.println(u.x);   //5
		System.out.println(u.y);   //10
		//System.out.println(u.a);   //error
		//System.out.println(u.b);   //error
		u.test();                  //Down::test()
		u.fun();				   //Up::fun()
	}
}