package innerClass;

public class LocalInnerClass {

	private static int x=10;
	
	static void test() {
		class A{
			void fun() {
				System.out.println("A :: fun() with x="+x);
			}
		}
		
		A a = new A();
		a.fun();
	}
	
	public static void main(String[] args) {
		LocalInnerClass l = new LocalInnerClass();
		l.test();
	}
}
