interface Z2{
	void test();
}
interface z3 extends Z2{
	void fun();
}class Z4 implements z3{
	public void test(){
		System.out.println("Z4 :: test()");
	}	
	
	public void fun(){
		System.out.println("Z4 :: fun()");
	}
	
	public static void main(String[] args){
		Z4 z = new Z4();
		z.test();
		z.fun();
	}
}
