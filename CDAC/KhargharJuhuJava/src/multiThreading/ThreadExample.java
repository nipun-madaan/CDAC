package multiThreading;

public class ThreadExample extends Thread{

	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {  //extending Thread class
		ThreadExample t = new ThreadExample();
		t.start();
		
	}
}
