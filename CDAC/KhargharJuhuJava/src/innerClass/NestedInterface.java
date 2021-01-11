package innerClass;

interface Prafull {

	void show();
	interface Pranit{
		void fun();
	}
}
public class NestedInterface implements Prafull.Pranit{
	
	public void fun() {
		System.out.println("NestedInterface :: fun()");
	}
	
	public static void main(String[] args) {
		Prafull.Pranit p = new NestedInterface();  //upcasting
		p.fun();
	}
}
