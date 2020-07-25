import java.util.*;
class LL{
	public static void main(String[] args){
		LinkedList<Object> l = new LinkedList<Object>();
		l.add(50);
		l.add("Laukik");
		l.add(20.5);
		System.out.println(l);
		System.out.println(l.get(1));
		//l.remove(2);
		l.add(1,40);
		System.out.println(l);
		//Collections.sort(l);   //used for sorting
		System.out.println(l);
		//int index = Collections.binarySearch(l,50);   //used for searching
		//System.out.println(index);
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(40);
		System.out.println(l.containsAll(l1));
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		System.out.println("----------------------------");
		//l.clear();
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
			System.out.println("Program Ends");
	}
}