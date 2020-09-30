class A{
	int x;
	int y;
	A(){
		System.out.println("A()");
	}
	A(int x,int y){
		System.out.println("A(int,int)");
		this.x=x;
		this.y=y;
	}
}
class B extends A{
	int a;
	int b;
	B(int a,int b,int x,int y){ 
		this(x,y);
		System.out.println("B(int,int,int,int)");
		this.a=a;
		this.b=b;
	}
	B(int x,int y){
		super(x,y);
		System.out.println("B(int,int)");
	}
	public static void main(String[] args){
		B b = new B(10,20,30,40);
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println("The End");
	}
}