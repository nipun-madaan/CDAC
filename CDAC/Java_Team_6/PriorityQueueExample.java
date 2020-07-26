import java.util.*;
class PQ{
	public static void main(String[] args){
		PriorityQueue p = new PriorityQueue();
		p.add(10);
		p.add(45);
		p.add(100);
		p.add(20);
		System.out.println(p);
		System.out.println(p.contains(100));
		System.out.println(p.peek());
		p.poll();
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		//System.out.println("---------------------");
		/*while(p.peek() != null){
			System.out.println(p.poll());
		}*/
		System.out.println(p);
	}
}