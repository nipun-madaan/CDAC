package multiThreading;

public class ThreadJoin extends Thread{
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println(super.getName()+" "+i);
	}
	
	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		t1.setName("t1");
		ThreadJoin t2 = new ThreadJoin();
		t2.setName("t2");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
