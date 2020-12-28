package multiThreading;

public class ThreadExample1 implements Runnable{

	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {  //implementing Runnable interface
		ThreadExample1 t = new ThreadExample1();
		Thread t1 = new Thread(t);
		t1.start();
	}
}
