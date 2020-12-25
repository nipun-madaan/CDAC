package collection;
interface Sample{     //Functional Interface  => Interface having only one abstract function
	public void sum(); 
}
public class LambdaExpression implements Sample{
	
	@Override
	public void sum() {
		System.out.println("sum");
	}
	/**Using normal flow**/
	public static void main(String[] args) {
		Sample t = new LambdaExpression();  //upcasting
		t.sum();
	}
}
