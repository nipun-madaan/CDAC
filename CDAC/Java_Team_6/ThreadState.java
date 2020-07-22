class LC extends Thread{
	public void run(){
		System.out.println("running");
	}
	public static void main(String[] args){
		LC l = new LC();
		System.out.println(l.getState());    //NEW
		l.start();
		System.out.println(l.getState());    //RUNNABLE
		try{
			sleep(5000);
		}catch(Exception e){
			System.out.println("Exception occured");
		}
		System.out.println(l.getState());   //TERMINATED
	}
}