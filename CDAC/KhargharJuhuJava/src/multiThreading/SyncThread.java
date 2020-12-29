package multiThreading;
class Bank1{
	int balance;
	
	Bank1(){
		balance = 0;
	}
	int getBalance() {
		return balance;
	}
	void account() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				deposit();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				withdraw();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	synchronized void deposit() {
		for(int i=1;i<=1000;i++) {
			balance+=i;   //balance = balance+i
			System.out.println("deposit "+i);
		}
	}
	
	synchronized void withdraw() {
		for(int i=1;i<=1000;i++) {
			balance-=i;   //balance = balance-i
			System.out.println("withdraw "+i);
		}
	}
}
public class SyncThread {
	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.account();
		System.out.println(b.getBalance());
	}
}
