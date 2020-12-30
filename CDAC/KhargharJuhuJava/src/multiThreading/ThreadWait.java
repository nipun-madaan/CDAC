package multiThreading;

class UserThread extends Thread{
	int balance;
	public void run() {
		for(int i=1;i<=10;i++)
			balance = balance+i;
		try {
			notify();
		}catch(Exception e) {
			System.out.println("Exception occured");
		}
	}
}

public class ThreadWait {

	public static void main(String[] args) {
		UserThread t = new UserThread();
		t.start();
		synchronized(t) {
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(t.balance);
	}
	
}
