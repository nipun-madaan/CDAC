package innerClass;
class Payal{
	interface Pratima{
		void show();
	}
}

public class NestedInterface1 implements Payal.Pratima{

	public void show() {
		System.out.println("NestedInterface1 :: show()");
	}
	public static void main(String[] args) {
		Payal.Pratima p = new NestedInterface1(); //upcasting
		p.show();
	}
}
