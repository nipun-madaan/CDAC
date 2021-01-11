package innerClass;
interface Shailesh{
	abstract class Pardeep{
		static void fun() {
			System.out.println("Pardeep :: fun()");
		}
		abstract void test();
	}
}
public class NestedClass extends Shailesh.Pardeep{
	void test() {
		System.out.println("NestedClass :: test()");
	}
	public static void main(String[] args) {
		Shailesh.Pardeep.fun();
		Shailesh.Pardeep p = new NestedClass();   //upcasting
		p.test(); 
	}
}
