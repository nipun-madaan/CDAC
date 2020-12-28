package multiThreading;

public class ThreadExample2{
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {  //Anonymous class
			public void run() {
				for(int i=1;i<=10;i++) 
					System.out.println(i);
			}
		});
		
		t1.start();
	}

	public static void main1(String[] args) {
		Runnable r = ()->{  //Lambda Expression
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
	}
}
