class ACDF extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(super.getName()+" "+i);
		}
	}
	
	public static void main(String[] args){
		try{
			ACDF a1 = new ACDF();
			a1.setName("A1");
			ACDF a2 = new ACDF();
			a2.setName("A2");
			a1.start();
			a2.start();
			/*a1.join();
			a2.join();*/
		}catch(Exception e){
			System.out.println("Exception occured!!!");
		}
	}
}