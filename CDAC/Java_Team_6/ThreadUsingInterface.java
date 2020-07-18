class Bz implements Runnable{
	public void run(){
		for(int i=1;i<10;i++){
			System.out.println("Bz");
		}
	}
	public static void main(String[] args){
		Bz b = new Bz();
		Thread t1 = new Thread(b);
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println("main");
		}
	}
}