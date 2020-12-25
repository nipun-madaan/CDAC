/**
 * 
 */
package collection;

import java.util.Scanner;

/**
 * @author Nipun Madaan
 *
 */
interface Abc{
	public void say(String name);
}
public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Abc a =(name)->{
			System.out.println("Hello "+name);
		};
		a.say(str);
		sc.close();
	}
}

