/**
 * 
 */
package collection;

/**
 * @author Nipun Madaan
 *
 */
interface Bcd{
	public void add(String a,int b) ;
}
public class LambdaExpressionExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bcd b = (str,no)->{
			System.out.println(str+" "+no);
		};
		b.add("Pranit", 10);
	}

}
