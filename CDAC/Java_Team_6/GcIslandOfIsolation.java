class Isolation{
	Isolation i;
	
	@Override
	protected void finalize() throws Throwable{ 
		System.out.println("gc called");
	}
	
	public static void main(String[] args){
		Isolation i1 = new Isolation();
		Isolation i2 = new Isolation();
		Isolation i3 = new Isolation();
		i1.i = i2;
		i2.i = i3;
		i3.i = i1;
		i1 = i2 = i3 = null;
		System.gc();
		System.out.println("main");
	}
}