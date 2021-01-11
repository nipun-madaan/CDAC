package innerClass;

public class LocalInnerClass1 {

	private int data=20;
	
	void fun() {
		int x=10; //it was not accepted before java 8 it should be final before 8
			//it can't be private/public/protected it can only be final
		class B{
			int y=50;  
			void sum() {
				System.out.println("B :: sum with y="+y+" "+x);
			}
		}
		
		B b = new B();
		b.sum();
		//b.y;  //we can't access data members outside the class
	}
	
	public static void main(String[] args) {
		LocalInnerClass1 l = new LocalInnerClass1();
		l.fun();
	}
}
