package multiThreading;

public class DaemonThread extends Thread{
	
	public void run() {
		if(currentThread().isDaemon()) {
			System.out.println("Daemon thread running");
		}else
			System.out.println("user thread running");
	}
	
	public static void main(String[] args) {
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		DaemonThread t3 = new DaemonThread();
		t1.setDaemon(true);
		t1.start();
		//t1.setDaemon(true);  //it will throw IllegalThreadState exception if marked daemon after running
		t2.start();
		t3.start();
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}
}
