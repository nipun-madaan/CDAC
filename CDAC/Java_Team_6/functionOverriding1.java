class D1{
	static void test(){
		System.out.println("D1::test()");
	}
	
	void fun(){
		System.out.println("D1::fun()");
	}
}
class D2 extends D1{
	static void test(){
		System.out.println("D2::test()");
	}
	
	void fun(){
		System.out.println("D2::fun()");
	}
	
	public static void main(String[] args){
		D1 d = new D2();
		d.test();    //overriding does not occur for static functions
		d.fun();
		//static functions depends on refrence variable  and inst functions depend on object
	}
}