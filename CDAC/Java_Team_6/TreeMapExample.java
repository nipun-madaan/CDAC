import java.util.*;
class TM{
	void TM(){
	}
	private static final void main(String[] args){
		TreeMap<Object,Object> t = new TreeMap<Object,Object>();
		t.put(6.1,"One");
		t.put(6.2,"Two");
		t.put(6.5,"Five");
		t.put(6.3,"Three");
		t.put(6.4,4);
		t.put(6.6,"Six");
		t.put(6.5,"Six"); 
		System.out.println(t);
		System.out.println(t.get(6.4));
		System.out.println(t.size());
		for(Map.Entry<Object,Object> entry : t.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		Iterator<Map.Entry<Object,Object>> itr = t.entrySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}