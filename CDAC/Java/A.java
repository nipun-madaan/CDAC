class A{
	private int x;
	
	public A(){
		super();
		System.out.println("A()");
	}
	
	public A(int x){
		this.x=x;
		System.out.println("A(int) "+this.x);
	}
}
class B extends A{
	private int a;
	
	public B(){
		super();
		System.out.println("B()");
	}
	
	public B(int a,int x){
		super(x);
		this.a=a;
		System.out.println("B(int,int) "+this.a);
	}
	
	public static void main(String[] args){
		B b=new B(10,20);
	}
}
class C extends B{
	public C(){
		super(10);
		System.out.println("C()");
	}
	
	public C(int a,int x){
		super(a,x);
		System.out.println("C(int,int)");
	}
	
	public static void main(String[] args){
		C c=new C(40,80);
	}
}