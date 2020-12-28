package multiThreading;

public class ThreadState extends Thread{

	public void run() {
		System.out.println("Running");
	}
	public static void main(String[] args) {
		ThreadState t = new ThreadState();
		System.out.println(t.getState());  //NEW
		t.start();
		System.out.println(t.getState());   //RUNNABLE
		try {
			sleep(1000);
		}catch(Exception e) {
			System.out.println("Exception occured");
		}
		System.out.println(t.getState());   //TERMINATED
	}
}
