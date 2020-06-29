class C{
	{
		System.out.println("init");
	}
	static{
		System.out.println("static 1");
	}
	static{
		new C();
		System.out.println("static 2");
	}
	C(){
		System.out.println("C");
	}
	
	public static void main(String[] args){
		System.out.println("main");
	}
}