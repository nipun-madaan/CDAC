class A2{
	
	@Override
	protected void finalize() throws Throwable{ 
		System.out.println("gc called");
	}
	public static void main(String[] args){
		A2 a1 = new A2();
		a1 = null;
		Runtime.getRuntime().gc();
	}
}