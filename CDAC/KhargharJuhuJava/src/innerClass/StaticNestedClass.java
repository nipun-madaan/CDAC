package innerClass;

public class StaticNestedClass {

	static int data=40;
	static class C{
		void fun() {
			System.out.println("C :: fun() with data="+data);
		}
		
		static void test() {
			System.out.println("C :: test() with data="+data);
		}
	}
	public static void main(String[] args) {
		StaticNestedClass.C.test();
		StaticNestedClass.C c = new StaticNestedClass.C();
		c.fun();
				
	}
}
