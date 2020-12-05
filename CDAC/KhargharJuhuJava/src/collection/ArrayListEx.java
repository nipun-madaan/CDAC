package collection;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);  // add data
		a.add(20.5);
		a.add("Nipun");
		System.out.println(a);
		System.out.println(a.get(2));  //returns the data at particular index
		System.out.println(a.size());  //size of the arrayList
		boolean x = a.contains(20);   //checks whether data is present or not
		System.out.println(x);
		a.remove(1);  //removes the element at a particular index
		System.out.println(a);
		//a.clear();   //remove all the elements
		System.out.println(a);
		a.add(10);
		System.out.println(a);
		ArrayList a1 = new ArrayList();
		a1.add(10);
		//a1.add(20.5);
		//a1.add("Amit");
		System.out.println(a1);
		//a.removeAll(a1);   //remove all the elements present in the second arraylist
 		System.out.println(a);
		System.out.println(a.containsAll(a1));  //checks whether second list is present 
												//inside the first one i.e. comparison
		//#####################################################
		ArrayList a2 = new ArrayList();
		a2.add(50);
		a2.add(20);
		a2.add(40);
		a2.add(10);
		a2.add(30);
		System.out.println(a2);
		Collections.sort(a2);    //Collections is a class use to search and sort the list
								//It is used to sort the data present in the list
								//but condition is that data should be homogeneous
		System.out.println(a2);
		int index = Collections.binarySearch(a2, 50);  //to search the elements in the list
													//but catch is data should be sorted
		System.out.println(index);
	}
}
