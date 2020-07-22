class NM{
	public static void main(String[] args){
		LP l = new LP();
		l.start();
		synchronized(l){
			try{
				l.wait();
			}catch(Exception e){
				System.out.println("Exception occured");
			}
		}
		System.out.println(l.balance);
	}
}

class LP extends Thread{
	int balance;
	public void run(){
		for(int i=1;i<=10;i++){
			balance = balance+i;
		}
		try{
			notify();
		}catch(Exception e){
			System.out.println("Exception occured");
		}
	}
}