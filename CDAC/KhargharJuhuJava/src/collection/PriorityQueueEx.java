/**
 * 
 */
package collection;

import java.util.PriorityQueue;

/**
 * @author Nipun Madaan
 *
 */
public class PriorityQueueEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//PriorityQueue pq = new PriorityQueue();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(100); //add the element in the queue
		pq.add(200);
		pq.add(45);
		pq.add(100000);
		pq.add(1);
		System.out.println(pq);  
		System.out.println(pq.element()); //returns the head element of queue
		pq.offer(350);  //as it is similar to add
		System.out.println(pq); 
		System.out.println(pq.poll());  //returns the first element as well as delete that element 
		System.out.println(pq);
		System.out.println(pq.peek());  //it only returns the first element, it doesn't delete it
		System.out.println(pq);
	}

}
