class A{
	int x = 10;
	void sum(){
		System.out.println("A::sum()");
	}
}
class B extends A{
	int x = 20;
	void fun(){
		System.out.println(x);
		System.out.println(this.x);  //20
		System.out.println(super.x);  //10
		super.sum();  //A::sum()
	}
	/*static void sum(){   //this and super can only be called using object only
		this.fun();			//this and super are instance
		System.out.println("B::sum()");
	}*/
	public static void main(String[] args){
		B b = new B();
		b.fun();
		//sum();
	}
}
class C extends B{
	void sub(){
		System.out.println(super.x);
	}
	
	public static void main(String[] args){
		C c = new C();
		c.sub();
	}
}	