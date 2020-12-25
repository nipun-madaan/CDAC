/**
 * 
 */
package collection;

/**
 * @author Nipun Madaan
 *
 */
interface Efg{
	public int add(int a,int b);
}
public class LambdaExpressionExample3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Efg e1 = (int no1,int no2)->{
			return no1+no2;
		};
		Efg e2 = (no1,no2)->(no1+no2);
		int sum = e1.add(10, 20);
		System.out.println(sum);
		System.out.println(e2.add(10,20));
	}

}
