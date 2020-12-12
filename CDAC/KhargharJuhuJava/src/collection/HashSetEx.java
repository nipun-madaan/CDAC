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
		HashSet<Integer> h = new HashSet<Integer>();
		System.out.println(h.add(10));  //add element in the set and return true if added and return false if not added
		h.add(10);
		h.add(1001);
		h.add(1010);
		System.out.println(h.add(10));
		System.out.println(h);
		//default initial capacity - 16
		//default load ratio - 75%
		HashSet<Integer> h1 = new HashSet<Integer>(32);   //here 32 is the initial capacity
		HashSet<Integer> h2 = new HashSet<Integer>(32, 0.90f); //here 32 is initial capacity
									// and 0.90f is load ratio
		System.out.println(h.size());  // gives size of the set
		Iterator<Integer> itr = h.iterator();  //gives the object of iterator which is used to
		while(itr.hasNext()) {         //iterate over the elements
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		h.forEach(n->{    //for each loop to iterate over all the elements and perform any action like square of the no
			System.out.println(n*n);
		});
		//Collections.sort(h);  //sorting works  on the list
	}

}
