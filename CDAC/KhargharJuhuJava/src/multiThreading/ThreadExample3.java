package multiThreading;

public class ThreadExample3 extends Thread{

	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(super.getName());
	}
	public static void main(String[] args) {
		ThreadExample3 t = new ThreadExample3();
		t.setName("ThreadExample3");
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("main");
	}
}
