class B{
	static int i;
	int j;
	{
		//j=20;
		System.out.println("init");
	}
	static{
		i=10;
		System.out.println("static");
	}
	public static void main(String[] args){
		System.out.println(new B().j);
		B b = new B();
		b.test();
		System.out.println(b.j);
	}
	
	B(){
		//j=30;
		System.out.println("B");
	}
	
	void test(){
		j=40;
		//return;       //Below this line code will become unreachable so gives error
		System.out.println("test");
		return;
	}
}