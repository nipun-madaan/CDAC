package cdac;

public class A {

	static String i;   //static - depends on the class
	int j;         //instance - depends on object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		int x;
		x=5;
		int arr[];
		System.out.println(x);
		System.out.println(a.j);
		System.out.println(i);
		System.out.println(A.i);
		System.out.println(a.i);   //A.i
	}

}
