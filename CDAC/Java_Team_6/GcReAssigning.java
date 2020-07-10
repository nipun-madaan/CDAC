class BD{
	@Override
	protected void finalize() throws Throwable{ 
		System.out.println("gc called");
	}
	public static void main(String[] args){
		BD b1 = new BD();
		BD b2 = new BD();
		b1 = b2;
		System.gc();
	}
}