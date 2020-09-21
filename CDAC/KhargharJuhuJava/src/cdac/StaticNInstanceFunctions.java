package cdac;

public class StaticNInstanceFunctions {
	
	static int i=10;
	int j=20;
	
	static void fun(StaticNInstanceFunctions c) {
		System.out.println(i);
		System.out.println(c.j);
	}
	
	static void sum() {     //static funcion
		System.out.println("sum()");
	}
	
	void sub() {           //instance function
		System.out.println("sub()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 30;
		//System.out.println(i);
		StaticNInstanceFunctions c1 = new StaticNInstanceFunctions();
		/*System.out.println(c1.j); 
		System.out.println(k);
		fun(c1);*/
		sum();
		c1.sub();
		StaticNInstanceFunctions.sum();
		c1.sum();   //C.sum();
	}

}
