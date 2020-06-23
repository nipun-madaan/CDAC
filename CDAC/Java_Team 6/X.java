class X{
	private int a, b;
	
	public X(){
		System.out.println("X()");
	}
	
	public X(int a,int b){
		this();
		//super();
		this.a=a;
		this.b=b;
		System.out.println("X(int,int)");
	}
	public static void main(String [] args){
		X x= new X(10,20);
	}
}
