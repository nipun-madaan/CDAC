/**
 * 
 */
package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nipun Madaan
 *
 */
public class MapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map map = new HashMap(); //in map elements are added in the form of key value pair
		map.put(4,"one");
		map.put(2,"two");
		map.put(3, "three");
		map.put(1, "one");  //if key is duplicated the new value is overriden by previous one
		//map.put(1, "four");
		System.out.println(map);
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(5, "one");
		map1.put(6,"two");
		map1.put(7, "three");
		map.putAll(map1);  //add all the elements present in the map1
		System.out.println(map);
		Map<String,Integer> map2 = new HashMap<String,Integer>();
		map2.put("one",4);
		map2.put("two",2);
		map2.put("three",3);
		map2.put("one",1);
		map.put("abc", 5);
		map.put(5,"def");
		System.out.println(map);
		System.out.println(map2);
		map1.compute(5, (k,v)->v!=null ? v.concat(" five"): null);  //if we want to 
						//do any operation on the particular key's value then compute is used
		map2.compute("three", (k,v)->15);
		System.out.println(map1);
		System.out.println(map2);
	}
}
