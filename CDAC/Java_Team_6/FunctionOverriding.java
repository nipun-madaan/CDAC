class C1{
	void test(){
		System.out.println("C1::test()");
	}
	
	@Override
	void fun(){
		System.out.println("C1::fun()");
	}
}
class C2 extends C1{
	public void test(){
		System.out.println("C2::test()");
	}
	
	void fun(int x){
		System.out.println("C2::fun(int)");
	}
	
	public static void main(String[] args){
		C1 c = new C2();     //upcasting
		c.test();
		c.fun();
	}
}