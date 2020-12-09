/**
 * 
 */
package collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Nipun Madaan
 *
 */
public class HashSetEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet h = new HashSet();
		System.out.println(h.add(10));
		h.add(10.3);
		h.add(1001);
		h.add(1010);
		System.out.println(h.add(10.3));
		System.out.println(h);
		//default initial capacity - 16
		//default load ratio - 75%
		HashSet<Integer> h1 = new HashSet<Integer>(32);   //here 32 is the initial capacity
		HashSet<Integer> h2 = new HashSet<Integer>(32, 0.90f); //here 32 is initial capacity
									// and 0.90f is load ratio
		System.out.println(h.size());
		Iterator itr = h.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
