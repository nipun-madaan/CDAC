class DG{
	void fun(){
		DG d1 = new DG();
		System.out.println("fun");
	}
	
	@Override
	protected void finalize() throws Throwable{ 
		System.out.println("gc called");
	}
	
	public static void main(String[] args){
		DG d = new DG();
		d.fun();
		System.gc();
		System.out.println("main");
	}
}