class A extends Thread{
	public void run(){
		for(int i=1;i<10;i++){
			System.out.println(super.getName());
		}
	}
	
	public static void main(String[] args){
		A a = new A();
		a.setName("A");
		a.start();
		for(int i=0;i<10;i++){
			System.out.println("main");
		}
	}
}