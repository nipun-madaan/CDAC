/**
 * 
 */
package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author Nipun Madaan
 *
 */
class SortPercent implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		return (int)(s1.getGradPercent() - s2.getGradPercent());
	}
}

class SortName implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
public class LinkedListEx1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Student s = new Student(65,"Prafulla",24,73);   //LinkedList with user defined class
		System.out.println(s);
		LinkedList<Student> ll = new LinkedList<Student>();
		ll.add(new Student(68,"Pranit",24,74));
		ll.add(s);
		ll.add(new Student(2,"Shailesh",25,74));
		System.out.println(ll);
		/***
		 * Collections.sort() will sort data on the basis of compareTo method which is there in Comparable
		 * class. Here sorting is done on the basis of roll no. Please refer Student.java file regarding compareTo method
		 */
		Collections.sort(ll);
		System.out.println(ll);
		/**
		 * Comparator is a functional interface which only contains one method compare which needs to be overriden 
		 * to sort data on the multiple types like name,percentage,etc.So comparator is basically used when we want sorting 
		 * on multiple types 
		 */
		Comparator<Student> sortByName = (Student s1,Student s2)->s1.getName().compareTo(s2.getName());
		/**
		 * For sorting on the particular type of data we need to pass reference of Comaparator class in Collections.sort() methods
		 * as given in the example below
		 */
		Collections.sort(ll,sortByName);
		SortPercent sp = new SortPercent();
		Collections.sort(ll,sp);
		System.out.println(ll);
	}

}
