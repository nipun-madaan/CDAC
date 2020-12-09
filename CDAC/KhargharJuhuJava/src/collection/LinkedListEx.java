package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);  //add the element to the linkedlist
		l.add(20.5);
		l.add("Pranit");
		System.out.println(l);
		System.out.println(l.size());  //gives the size of the linkedlist
		System.out.println(l.get(2));  //give the value at the particular index
		System.out.println(l.contains(20.5));   //check the data exists in the linkedlist
		l.remove();   //it will remove the first element
		System.out.println(l);
		l.remove(1);  //it will delete the value at particular index 
		System.out.println(l);
		l.remove(20.5);
		System.out.println(l); //it will delete the particular value 
		System.out.println(l.isEmpty());
		l.add(10);
		l.add(20.5);
		l.add("Nipun");
		//l.clear();     //deletes all the element
		//l.removeFirst(); //removes first element
		l.removeLast();   //removes last element
		System.out.println(l);
		//l.removeAll(l1) - removes data similar with the another linkedlist
		l.addFirst(50);   //adds the element at the start
		System.out.println(l);
		l.addLast(100);    //adds the element at the end
		System.out.println(l);
		System.out.println(l.indexOf(20.5));  //gives the index of the particular value
		l.offer(500);     //works similar to add
		System.out.println(l);
		System.out.println(l.peek());   //returns only the value and data is not deleted
		System.out.println(l);
		System.out.println(l.poll());   //deletes as well as returns the value
		System.out.println(l);
		l.add(10);
		//l.removeFirstOccurrence(10);   //remove the first recuring value from start
 		l.removeLastOccurrence(10);     //remove the first recuring value from last 
		System.out.println(l);
		System.out.println(l.hashCode());   //gives the hash code of the linkedlist 
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(5);
		ll.add(10);
		ll.add(15);
		ll.add(20);
		ll.add(25);
		ll.add(30);
		//ll.removeIf(n->n%2!=0);//removeif   //boolean even(n){
		System.out.println(ll);				//	if(n%2==0) return true;else return false;
		//l.removeAll(ll);									//	}
		l.retainAll(ll);//retainall
		System.out.println(l);
		System.out.println(ll);
		ll.set(1,50);//set
		System.out.println(ll);
		List<Integer> sl = ll.subList(2, 6);//subList
		System.out.println(sl);
		Object[] arr = ll.toArray();//toArray
		for(Object o : arr) {
			System.out.print(o+" ");
		}
		System.out.println();
		Iterator<Integer> itr = ll.iterator(); //iterator
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		Iterator<Integer> dItr = ll.descendingIterator();//descendingIterator
		while(dItr.hasNext()) {
			System.out.print(dItr.next()+" ");
		}
		System.out.println();
		ListIterator<Integer> lItr = ll.listIterator();
		while(lItr.hasNext()) {
			System.out.print(lItr.next()+" ");
		}
		System.out.println();
		ListIterator<Integer> lItr1 = ll.listIterator(2);
		while(lItr1.hasNext()) {
			System.out.print(lItr1.next()+" ");
		}
		
		/*LinkedList<Integer> l1 = new LinkedList<Integer>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();
		List<Integer> a2 = new ArrayList<Integer>();*/
	}
	
}
