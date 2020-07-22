class MY extends Thread{
	public void run(){
		System.out.println("running");
	}
	public static void main(String[] args){
		MY m = new MY();
		System.out.println(m.getPriority());
		m.start();
		m.setPriority(MAX_PRIORITY);
		System.out.println(m.getPriority());
		m.setPriority(MIN_PRIORITY);
		System.out.println(m.getPriority());
		m.setPriority(NORM_PRIORITY);
		System.out.println(m.getPriority());
	}
}