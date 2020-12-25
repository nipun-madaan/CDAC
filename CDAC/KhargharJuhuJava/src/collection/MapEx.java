/**
 * 
 */
package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		map.put(null, "four");
		System.out.println(map);
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(5, "one");
		map1.put(6,"two");
		map1.put(7, "three");
		map.putAll(map1);  //add all the elements present in the map1
		System.out.println(map);
		Map<String,Integer> map2 = new HashMap<String,Integer>();
		map2.put("one",4);
		map2.put("two",-1);
		map2.put("three",3);
		map2.put("one",1);
		map.put("abc", 5);
		map.put(5,"def");
		System.out.println(map);
		System.out.println(map2);
		System.out.println("------------------");
		map1.compute(8, (k,v)->v!=null ? v.concat(" five"): null);  //if we want to 
						//do any operation on the particular key's value then compute is used
		map2.compute("three", (k,v)->15);
		System.out.println(map1);
		System.out.println(map2);
		/***
		 * computeIfPresent-if key is found then do insert the value for that particular key by finding
		 * the value of the logic provided in the lambda expression
		 */
		map2.computeIfPresent("three",(k,v)->{
			if(v>0)
				return v;
			else
				return 0;
		});
		System.out.println(map2);
		/**
		 * computeIfAbsent - it is just the opposite of computeIfPresent - it will find the value of
		 * logic provided and insert only and only if the given key is not found in the map
		 */
		map2.computeIfAbsent("five",(k)->{
			if(k.equals("five"))
				return 5;
			else
				return 0;
		});
		System.out.println(map2);
		System.out.println(map.get("abc"));  //it will return the value for the key passed
		System.out.println(map.containsKey(11));  //it will check whether the key passed is present in the map or not
		System.out.println(map.containsValue(5)); // it will check whether the value passed is present in the map or not
		map2.forEach((k,v)->{  //forEach is used to iterate over the map and perform whatever operation you want to do for each key value pair
			System.out.println(v*v);
		});
		Set<Entry> set = map.entrySet();  // it will return the set of the entry i.e. key value pair so that we can iterate over map using iterator
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(Entry e : set) {
			System.out.println(e.getKey() + " "+e.getValue());
		}
		System.out.println(map.getOrDefault(11,"not defined"));  //it is used to get the value of the key if present otherwise return the default value passed
		System.out.println(map1);
		map1.merge(6,"six", (k,v)->v!=null ? v.concat(" five"): null);  //if the value passed is already map with any key then find the value of function and then replace it with the exising otherwise insert the value passed as it is
		System.out.println(map1);
		//put
		//putifabsent
		System.out.println("=============================================");
							/***HashMap****/
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		System.out.println(hm);
		hm.put(1, "four");
		System.out.println(hm);
		hm.putIfAbsent(5, "five");   //it is used to insert into map only and only if the key passed is absent
		hm.putIfAbsent(1, "six");
		System.out.println(hm);
		hm.remove(5);  //it is used to remove the pair whose key has been passed
		System.out.println(hm);
		System.out.println(hm.remove(1,"six"));  //it will remove the pair only and only if both key value pair is found in the map
		System.out.println(hm);
		Collection<String> c = hm.values();   //it will provide the collection of all the values present in the map (not key)
		for(String s : c) {
			System.out.println(s);
		}
		hm.replace(2, "kelvin");  //it will replace the value of the key if the key is found in the map
		System.out.println(hm);
		hm.replace(2, "kelvin","two");  //it will replace the value with the value passed only when both key and value pair is found in the map
		System.out.println(hm);
		hm.replaceAll((k,v)->{ //it will relace all the values with value being evaluated by the lambda expression by the logic given in the lambda expression
			if(k%2==0)
				return "even";
			else 
				return "odd";
		});                                  
		System.out.println(hm);
	}
}
