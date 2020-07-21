class A9 extends Thread{
	public void run(){
		for(int i=1;i<10;i++){
			if(super.getName().equals("A2")){
				try{
					sleep(500);
				}catch(Exception e){
					System.out.println("Exception occured!!!");
				}
			}
			System.out.println(super.getName());
		}
	}
	
	public static void main(String[] args){
		A9 a1 = new A9();
		A9 a2 = new A9();
		a1.setName("A1");
		a2.setName("A2");
		a1.start();
		a2.start();
	}
}