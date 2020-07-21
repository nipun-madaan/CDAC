class Bank{
	int balance;
	Bank(){
		balance=0;
	}
	void account(){
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				deposit();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				withdraw();
			}
		});
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}catch(Exception e){
			System.out.println("Exception occured!!!");
		}
	}
	
	void deposit(){
		for(int i=1;i<=1000;i++){
			balance = balance+i;
			System.out.println("deposit "+i);
		}
	}
	
	void withdraw(){
		for(int i=1;i<=1000;i++){
			balance = balance-i;
			System.out.println("withdraw "+i);
		}
	}
	
	public static void main(String[] args){
		Bank b = new Bank();
		b.account();
		System.out.println(b.balance);
	}
}	