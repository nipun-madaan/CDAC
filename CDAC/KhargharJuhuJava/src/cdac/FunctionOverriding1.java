class Parent1{
	int a=10;
	
	void sum(){
		System.out.println("Parent1 :: sum()");
	}
	
	static void sub(){
		System.out.println("Parent1 :: sub()");
	}
	
	void printA(){
		System.out.println("Parent1 :: printA() "+a);  //this.a
	}
}
class Child1 extends Parent1{
	int a=20;
	@Override
	void sum(){
		System.out.println("Child1 :: sum()");
	}
	
	static void sub(){
		System.out.println("Child1 :: sub()");
	}
	
	void printA(){
		System.out.println("Child1 :: printA() "+a);  //this.a
	}
	
	public static void main(String[] args){
		Parent1 p = new Child1();  //upcasting
		Child1 c = (Child1)p;  //downcasting  Child1 c = (Child1)(new Child1())  Child1 c = new Child1()
		c.sub();  //Child1.sub()
		c.sum();   
		p.sub();   //Parent1.sub
		p.sum();
		p.printA();   //20
		c.printA();   //20
		System.out.println(p.a);  //10
		System.out.println(c.a);  //20
		Parent1 p1 = new Parent1();
		Child1 c1 = new Child1();  
		System.out.println(p1.a);  //10
		System.out.println(c1.a);  //20
	}
}