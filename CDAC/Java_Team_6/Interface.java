interface F1{
	final static int x=10;
	void fun();   //methods are by default abstract and public
	void test();
}
class F2 implements F1{
	public void fun(){
		System.out.println("fun");
	}
	public void test(){
		System.out.println("test");
	}
	public static void main(String[] args){
		F2 f = new F2();
		f.fun();
		f.test();
	}
}