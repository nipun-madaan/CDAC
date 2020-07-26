import java.util.*;
class HS{
	public static void main(String[] args){
		HashSet h = new HashSet();
		//HashSet h = new HashSet(32);
		//HashSet h = new HashSet(32,0.90f);
		h.add(10);   
		h.add("Manoj");  
		h.add(100);   
		h.add(1010); 
		System.out.println(h);		
		h.remove("Manoj");  //works on data
		System.out.println(h.size());
		System.out.println(h);
		Iterator itr = h.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}