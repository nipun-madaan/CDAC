class A2 extends A1{
	int j;
	A2(){
		//super();    //provided by compiler
		System.out.println("A2");
	}
	A2(int i,int j){
		this(i);
		this.j=j;
		System.out.println("A2(int,int)");
	}
	
	A2(int i){
		super(i);
		System.out.println("A2(int)");
	}
}