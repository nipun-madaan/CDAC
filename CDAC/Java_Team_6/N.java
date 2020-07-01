class N extends M{
	int k=10;
	static int x=20;
	public static void main(String[] args){
		N n = new N();
		System.out.println(n.i);
		System.out.println(n.j);   //M.j
		System.out.println(n.k);
		System.out.println(n.x);   //N.x
		n.test();
		n.fun();    //M.fun()
		n.test1();
		n.fun1();   //N.fun1()
	}
	
	void test1(){
		System.out.println("N::test");
	}
	
	static void fun1(){
		System.out.println("N::fun");
	}
}