class Base1{
	int a=10;
	int id=5;
	protected static void fun(){
		System.out.println("Base1 :: fun()");
	}
	
	void stub(){
		System.out.println("Base1 :: stub()");
	}
}
class Derived1 extends Base1{
	int id=20;
	public static void fun(){
		System.out.println("Derived1 :: fun()");
	}
	
	@Override
	void stub(){
		System.out.println("Derived1 :: stub()");
	}
	
	public static void main(String[] args){
		Base1 b = new Derived1();    //upcasting   
		//Derived1 d = new Base1();
		//Derived1 d = (Derived1)b;  //Derived d = new Derived();
		System.out.println(b.id);    
		b.stub();   //Derived1 :: stub
		b.fun();   //Base1.fun()
		fun();
	}
}