class A3 extends A2{
	int k;
	A3(){
		//super();    //provided by compiler
		System.out.println("A3");
	}
	A3(int i,int j,int k){
		super(i,j);
		this.k=k;
		System.out.println("A3(int,int,int)");
	}
	public static void main(String[] args){
		A3 a = new A3(10,20,30);
		A3 b = new A3();
	}
}