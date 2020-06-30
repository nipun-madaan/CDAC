class L extends K{
	int x;
	L(){
		super(10);
		System.out.println("L");
	}
	
	L(int i){
		super(i);
		System.out.println("L(int)");
	}
	
	
	L(int i,int x){
		//super(i);
		this(i);   //we can't write this and super keyword together 
		this.x=x;
		System.out.println("L(int,int)");
	}
	
	public static void main(String[] args){
		L l = new L(10,20);
		l.test();
		
	}
	
	void test(){
		System.out.println(super.i);
		System.out.println(this.x);
		super.fun();
		this.fun();
		System.out.println("L::test()");
	}
	
	void fun(){
		System.out.println("L::fun()");
	}
}