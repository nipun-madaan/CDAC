class A1{
	int i;
	A1(){
		//super();    //provided by compiler
		System.out.println("A1");
	}
	
	A1(int i){
		this.i=i;
		System.out.println("A1(int)");
	}
}