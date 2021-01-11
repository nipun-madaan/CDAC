package innerClass;
abstract class Person{
	void eat() {
		System.out.println("Person :: eat()");
	}
	
	abstract void fun();
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person p = new Person(){
			void eat() {
				System.out.println("Anonymous :: eat()");
			}
			
			void fun() {
				System.out.println("Anonymous :: fun()");
			}
		};
		p.eat();
		p.fun();
	}
}
