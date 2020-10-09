import java.util.*;
class Arr{
	public static void main(String[] args){
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add(20.5);
		a.add("Nidhi");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(2));
		//a.remove(1);
		System.out.println(a);
		//a.clear();   //it deletes all elements and memory
		//a.removeAll(a);  //it only deletes the element
		System.out.println(a);
		boolean x = a.contains(20.5);
		System.out.println(x);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(20);
		a1.add(10);
		a1.add(30);
		System.out.println(a1.containsAll(a));  //compare two arraylist
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		int i = Collections.binarySearch(a1,20);
		System.out.println(i);
	}
}
