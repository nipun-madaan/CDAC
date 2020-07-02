class B1{
	public void test(int x){
		System.out.println("B1::test(int)");
	}
	static void fun(int x){
		System.out.println("B1::test(int)");
	}
	public void test(int x,int y){
		System.out.println("B1::fun(int,int)");
	}
	static void fun(int x,int y){
		System.out.println("B1::fun(int,int)");
	}
}