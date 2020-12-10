/**
 * 
 */
package collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author Nipun Madaan
 *
 */
public class TreeSetEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(20);   //add the data in the set in the sorted order
		t.add(40);
		t.add(10);
		t.add(30);
		System.out.println(t);
		Iterator<Integer> itr = t.iterator();     //gives iterator to iterate over the elements of set
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		Iterator<Integer> itr1 = t.descendingIterator(); //gives descending iterator which prints the reverse order of set
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println(t.ceiling(40));  //prints the least number greater than or equal to that number
		//t.clear();  //it empty the given set i.e remove all the elements present
		System.out.println(t);
		NavigableSet<Integer> ns = t.descendingSet();  //it gives the set of reverse order of the given set 
		System.out.println(ns);          //any changes in this set will reflect the changes in the main set and vice versa
		ns.add(50);
		System.out.println(t);
		t.add(60);
		System.out.println(ns);
		System.out.println(t.first());    //print the first element in the set
		System.out.println(t.floor(49));   //prints the greatest number less than or equal to that number
		System.out.println(t.ceiling(49));  //greater than or equal to
	}
	
}
