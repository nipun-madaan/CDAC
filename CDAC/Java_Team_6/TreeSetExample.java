import java.util.*;
class TS{
	public static void main(String[] args){
		TreeSet t = new TreeSet();
		t.add(50);
		t.add(20);
		t.add(10);
		t.add(40);
		t.add(30);
		t.add(50);   //it wil not give exception but it will not be inserted
		System.out.println(t);
		System.out.println(t.size());
		System.out.println(t.contains(50));
		TreeSet t1 = new TreeSet();
		t1.add("Mehul");
		t1.add("Laukik");
		t1.add("Shubham");
		System.out.println(t1);
	}
}