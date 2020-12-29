package multiThreading;

public class ThreadPriority extends Thread{

	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println(this.getName()+" "+i);
	}
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		System.out.println("Priority of t1 : "+t1.getPriority());  //default 5 
		System.out.println("Priority of t2 : "+t2.getPriority());   //default 5
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		t2.setPriority(MIN_PRIORITY);  //1
		t1.setPriority(MAX_PRIORITY);  //10
		System.out.println("Priority of t1 : "+t1.getPriority());
		System.out.println("Priority of t2 : "+t2.getPriority());
		/*t.setPriority(NORM_PRIORITY);  //5
		System.out.println("Priority : "+t.getPriority());
		t.setPriority(7);  
		System.out.println("Priority : "+t.getPriority());*/
		
		/**
		 * Deamon thread is the thread which has the lowest priority i.e. MIN_PRORITY(1) 
		 * like garbage collector thread which runs in the background
		 */
	}
}
