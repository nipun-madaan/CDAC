package innerClass;

public class MemberInnerClass {

	private int j=20;
	class A{
		void fun() {
			System.out.println("j : "+j);
		}
	}
	
	public static void main(String[] args) {
		MemberInnerClass m = new MemberInnerClass();
		MemberInnerClass.A a= m.new A();
		a.fun();
	}
}
