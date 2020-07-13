class XY{
	static int x;
	int y;
	static{
		x=5;
	}
	XY(){
		y=10;
	}
	static void fun(){
		System.out.println("XY::fun()");
	}
	void test(){
		System.out.println("XY::test()");
	}
}
class YZ extends XY{
	static int a;
	int b;
	static{
		a=15;
	}
	YZ(){
		b=20;
	}
	static void fun(){
		System.out.println("YZ::fun()");
	}
	void test(){
		System.out.println("YZ::test()");
	}
	
	public static void main(String[] args){
		//YZ y = (YZ)new XY();     //Downcasting
		XY x = new YZ();
		YZ y = (YZ)x;    //  YZ y = new YZ();
		System.out.println(y.x);   //5
		System.out.println(y.y);   //10
		System.out.println(y.a);   //15
		System.out.println(y.b);   //20
		y.test();                  //YZ::test()
		y.fun();				   //YZ::fun()
	}
}