package multiThreading;

public class UserThreadGroup implements Runnable{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		UserThreadGroup u = new UserThreadGroup();
		ThreadGroup g = new ThreadGroup("Bazookas");
		Thread t1 = new Thread(g,u,"Prafull");  //Thread(ThreadGroup, Runnable, Name)
		Thread t2 = new Thread(g,u,"Pranit");
		ThreadGroup g1 = new ThreadGroup(g,"Bazookas2");
		Thread t3 = new Thread(g1,u,"Payal");
		Thread t4 = new Thread(g1,u,"Pratima");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("Thread grouping");
		g.list();  //prints the information of the thread group
		System.out.println("Parent : "+g1.getParent());
		System.out.println("Active count : "+g1.activeCount());  //it gives the estimate of how many threads are running currently of this group
		System.out.println("Group count : "+g1.activeGroupCount());  // it gives the estimate of how many threads groups are running of this group 
	}
	
}
