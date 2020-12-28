package multiThreading;

public class ThreadSleep extends Thread{

	public void run() {
		for(int i=0;i<10;i++) {
			if(this.getName().equals("t2")) {
				try {
					sleep(1000);
				}catch(InterruptedException e) {
					System.out.println("Exception occured");
				}
			}
			System.out.println(this.getName());
		}
	}
	
	public static void main(String[] args) {
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
}
