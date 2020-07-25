import java.util.*;
class AL{
	public static void main(String[] args){
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(30);
		l.add(20);
		l.add(10);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(2));
		Collections.sort(l);
		System.out.println(l);
		int index = Collections.binarySearch(l,10);
		System.out.println(index+" - "+l.get(index));
		System.out.println(l.contains(40));
		l.remove(2);   //index
		System.out.println(l);
		//l.clear();    //deletes both data and memory
		ArrayList<Integer> remove = new ArrayList<Integer>();
		remove.add(10);
		remove.add(20);
		remove.add(40);
		//System.out.println(l.removeAll(remove));    //deletes only data
		System.out.println(l);
		System.out.println(l.containsAll(remove));
		
	}
}