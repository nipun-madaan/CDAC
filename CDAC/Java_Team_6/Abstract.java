abstract class E1{
	abstract void test();
	
	void fun(){
		System.out.println("fun");
	}
}
class E2 extends E1{
	void test(){
		System.out.println("test");
	}
	
	public static void main(String[] args){
		E2 e = new E2();
		e.test();
		e.fun();
		
	}
}