/**
 * 
 */
package collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
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
		SortedSet<Integer> ss = t.headSet(40); //returns the sorted set from the actual set having all the 
							//elements less than the number given i.e 40 
		System.out.println(ss);
		ss.add(5);
		System.out.println(ss);
		System.out.println(t);
		SortedSet<Integer> ss1 = t.headSet(40,false);  //similar to headset bu here true or false indicates that 
							//the number should be included or not
		System.out.println(ss1);
		SortedSet<Integer> ss2 = t.headSet(40,true);
		System.out.println(ss2);
		System.out.println(t.higher(30));  //returns the no higher than the given number i.e.30
		System.out.println(t.last()); //returns the last number in the set
		System.out.println(t.lower(30)); //returns the no less than the given number i.e 30
		t.pollFirst();  //it returns the first element as well as delete that element
		System.out.println(t);
		t.pollLast();   //it returns the last element as well as delete that element
		System.out.println(t);
		SortedSet<Integer> x = t.subSet(20, 40);  //it returns the SortedSet which contains element from 20 to 40 
								//but 40 is not included 
		System.out.println(x);
		SortedSet<Integer> x1 = t.tailSet(20);  //it returns the SortedSet which contains from 20 to last, 20 also included
		System.out.println(x1);
		SortedSet<Integer> x2 = t.tailSet(20,false);  //it returns the SortedSet which contains from 20 to last, 
							//true or false indicates that whether the 20 is included or not
		System.out.println(x2);
	}
}
