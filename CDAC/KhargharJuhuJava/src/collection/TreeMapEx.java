/**
 * 
 */
package collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Nipun Madaan
 *
 */
public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer,Object> tm = new TreeMap<Integer,Object>();
		tm.put(1, "one");  //add element in the form of key value pair
		tm.put(2, "two");
		tm.put(9, "nine");
		tm.put(7,"seven");
		tm.put(6,"six");
		tm.put(8, 8);
		//tm.put(null, 10);
		System.out.println(tm);	
		System.out.println(tm.ceilingEntry(5)); //least no greater than or equal to the given number
		System.out.println(tm.ceilingKey(5));   //least key greater than or equal to the given number
		NavigableSet<Integer> set = tm.descendingKeySet(); //it will return the set of keys in the descending order
		System.out.println(set);
		NavigableMap<Integer,Object> nm = tm.descendingMap();  //it will return the navigable map in the descending order
		System.out.println(nm);
		System.out.println(nm.firstEntry());   //it will return the very first key value pair of map
		System.out.println(tm.firstKey());  //it will return only first key in the map
		System.out.println(tm.floorEntry(5));  //it will return the greatest key value pair less than or equal to the given no
		System.out.println(tm.floorKey(5));  //greater key less than or equal to the given no
		SortedMap<Integer, Object> sm = tm.headMap(6);  //it will return the sorted map having key less than or equal to the given key but that key is not included 
		System.out.println(sm);
		SortedMap<Integer, Object> sm1 =tm.headMap(6, true);   //it will return the sorted map having key less than or equal to the given key but that key is included or not will depend on the boolean flag passed
		System.out.println(sm1);
		System.out.println(tm.higherEntry(6));   //it returns the least key value pair greater than the given key
		System.out.println(tm.higherKey(6));    //it returns only the least key greater than the given key
		Set<Integer> keySet = tm.keySet();   //it returns the set of only keys
		System.out.println(keySet);
		System.out.println(tm.lastEntry());   //it returns the last key value pair from the map 
		System.out.println(tm.lastKey());   //it returns the last key from the map
		Entry<Integer,Object> e =tm.lowerEntry(6); //it returns the greatest key value pair less than the given key
		System.out.println(e);
		System.out.println(tm.lowerKey(6)); ////it returns only the greatest key less than the given key
		NavigableSet<Integer> ns = tm.navigableKeySet();  //it returns the navigable set of all the keys (not value)
		System.out.println(ns);
		System.out.println(tm.pollFirstEntry());  //it will return the first key value pair in the map and remove it
		System.out.println(tm);
		System.out.println(tm.pollLastEntry());  //it will return the last key value pair in the map and remove that 
		System.out.println(tm);
		Map<Integer,Object> map= tm.subMap(2, 8);  //it will return the map starting with the key passed here 2 till the key which is passed in the next parameter i.e. 8 but it is not included 
		System.out.println(map);
		Map<Integer,Object> map1= tm.subMap(2, false, 8, true);  //it will return the map starting with the key passed here 2 till the key which is passed in the 3rd parameter i.e. 8 but 
						//1st parameter should be included or not will be decided by the 2nd parameter i.e true or false similarly key passed in the 3rd parameter should be included or not will
						//depend on the 4th parameter (true/false)
		System.out.println(map1);
		Map<Integer,Object> map2= tm.tailMap(6);  //it will return the starting with this key till the end of the map but the key passed is also included
		System.out.println(map2);
		Map<Integer, Object> map3 = tm.tailMap(6, false); //it will return the starting with this key till the end of the map but whether the key passed should be included or not will depend on the next parameter
		System.out.println(map3);
	}
}
