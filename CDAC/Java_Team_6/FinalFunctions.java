class Final{
	final void fun(){
		System.out.println("Final :: fun()");
	}
	
	void test(){
		System.out.println("Final :: test()");
	}
	
}
class Final1 extends Final{
	/*void fun(){             //error because final functions can't be overriden
		System.out.println("Final1 :: fun()");
	}*/
	
	void test(){
		System.out.println("Final1 :: test()");
	}
	
	public static void main(String[] args){
		Final f = new Final1();
		f.fun();
		f.test();
	}
}