class A{
	int x;
	A(int x){
		System.out.println("A(int)");
		this.x = x;
	}
	A(){
		System.out.println("A()");
	}
	
}
class B extends A{
	B(int x){
		//super(x);  //if no super or this constructor is present by default super() is called
		this();
		super.x=x;
		System.out.println("B(int)");
	}
	B(){
		//super();
		System.out.println("B()");
	}
	public static void main(String[] args){
		B b = new B(10);
		System.out.println(b.x);
	}
}