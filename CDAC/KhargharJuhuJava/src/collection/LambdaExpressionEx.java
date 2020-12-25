package collection;
interface Drawables{  
    public void draw();  
}  
public class LambdaExpressionEx {

	public static void main(String[] args) {
		/**Lambda Expression**/
		Drawables d = ()->{
			System.out.println("Draw()");
		};
		d.draw();
		
		/**Anonymous class**/
		new EqualsMethodExample() {
			public void sub() {
				System.out.println("sub");
			}
		}.sub();
		
		System.out.println(new Student(65,"Prafulla",24,73).getAge());
	}
}
