class StaticFn{
	static void test(){
		System.out.println("test()");
	}
	public static void main(String[] args){
		StaticFn.test();
		test();
	}
}