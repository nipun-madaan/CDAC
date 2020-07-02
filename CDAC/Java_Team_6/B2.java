class B2 extends B1{
	private void test(int x,int y,int z){
		System.out.println("B2::test(int)");
	}
	
	public static void main(String[] args){
		B1 b1 = new B1();
		b1.test(10);
		b1.test(10,20);
		B1.fun(5);
		B1.fun(40,50);
		//b1.test(10,20,30);
	}
}