package innerClass;
interface Eatables{
	void eat();   //public abstract void eat();
}
public class AnonymousInnerClass1 {

	public static void main(String[] args) {
		Eatables e = new Eatables() {
			public void eat() {
				System.out.println("Eatables eat");
			}
		};
		e.eat();
	}
}

