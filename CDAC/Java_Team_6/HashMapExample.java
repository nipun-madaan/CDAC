import java.util.*;
class HM{
	public static void main(String[] args){
		HashMap<Object,Object> h = new HashMap<Object,Object>();
		h.put(6.1,"One");
		h.put(6.2,"Two");
		h.put(6.5,"Five");
		h.put(6.3,"Three");
		h.put(6.4,4);
		h.put("A",5.5);    //replace Five by Six
		h.put(6.6,"Six");
		System.out.println(h);
		System.out.println(h.get(6.3));
		h.remove("Six");
		System.out.println(h);
		Iterator<Map.Entry<Object,Object>> itr = h.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Object,Object> e = itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}